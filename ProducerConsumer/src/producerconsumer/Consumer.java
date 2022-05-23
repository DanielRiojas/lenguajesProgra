
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer extends Thread {
    Buffer buffer;
    int id;
    int tambuf;
    int cesp;

    Consumer(Buffer buffer, int id, int tambuf, int cesp) {
        this.buffer = buffer;
        this.id = id;
        this.tambuf = tambuf;
        this.cesp = cesp;
    }

    @Override
    public void run() {
        System.out.println("Running Consumer...");
        Scheme product;
        String sy = "";

        // @Cambiar 5 por tamaño del buffer
        for(int i=0 ; i < tambuf ; i++) {
            product = this.buffer.consume();

            int result = 0;
            sy = "( " + product.getSymbol() + " " + product.getNum1() + " " + product.getNum2() + " )";
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
            producerconsumer.GUIFrame.model2.addRow(new Object[]{id, sy, result} );
            producerconsumer.GUIFrame.jProgressBar1.setValue(producerconsumer.GUIFrame.jProgressBar1.getValue() - (100 / tambuf) );
            if(producerconsumer.GUIFrame.model.getRowCount() >= 0)
                producerconsumer.GUIFrame.model.removeRow(0);
            

            //@TODO cambiar 1000 por timepo de espera de GUI
            try {
                Thread.sleep(cesp);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}