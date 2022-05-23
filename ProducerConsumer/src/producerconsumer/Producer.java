
package producerconsumer;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    Buffer buffer;
    Scheme scheme;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.println("Running Producer...");
        String symbols = "+-/*";
        Random r = new Random(System.currentTimeMillis());
        Scheme product = new Scheme();


        for(int i=0 ; i < 5 ; i++) {
            product.setSymbol(symbols.charAt(r.nextInt(4)));
            product.setNum1(r.nextInt(10));
            product.setNum2(r.nextInt(10));
            this.buffer.produce(product);
            System.out.println("Producer produced: " + product.getSymbol() + " " + product.getNum1() + " " + product.getNum2());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}