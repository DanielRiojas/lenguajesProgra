
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer extends Thread {
    Buffer buffer;
    int id;

    Consumer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Running Consumer...");
        Scheme product;

        // @Cambiar 5 por tamaño del buffer
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
                try{
                    result = product.getNum1() / product.getNum2();
                }catch(ArithmeticException e) {
                // Exception handler
                    System.out.println("Divided by zero operation cannot possible");
                    result = -10000;
                }

            }
            else if(product.getSymbol() == '-'){
                result = product.getNum1() - product.getNum2();
            }
            System.out.println("Consumer consumed: " + result + " ID: " + id);

            //@TODO cambiar 1000 por timepo de espera de GUI
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}