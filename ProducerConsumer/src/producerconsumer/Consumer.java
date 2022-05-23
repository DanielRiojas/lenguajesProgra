
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer extends Thread {
    Buffer buffer;
    
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        Scheme product;

        for(int i=0 ; i < 5 ; i++) {
            product = this.buffer.consume();
            
            int result = 0;
            if(product.getSymbol() == '+'){
                result = product.getNum1() + product.getNum2();
            }
            else if(product.getSymbol() == '*'){
                result = product.getNum1() * product.getNum2();
            }
            else if(product.getSymbol() == '/'){
                if (product.getNum2() == 0) {
                    result = 0;
                } else {
                    result = product.getNum1() / product.getNum2();
                }
            }
            else if(product.getSymbol() == '-'){
                result = product.getNum1() - product.getNum2();
            }
            System.out.println("Consumer consumed: " + result);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}