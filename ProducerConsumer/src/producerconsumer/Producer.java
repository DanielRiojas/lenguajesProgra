package producerconsumer;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    Buffer buffer;
    int id;
    int n;
    int m;
    int pesp;
    int tambuf;

    Producer(Buffer buffer, int id, int n, int m, int tambuf, int pesp) {
        this.buffer = buffer;
        this.id = id;
        this.n = n;
        this.m = m;
        this.tambuf = tambuf;
        this.pesp = pesp;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void run() {
        System.out.println("Running Producer...");
        String symbols = "+-/*";
        Random r = new Random(System.currentTimeMillis() + id);
        Scheme product = new Scheme();
        

        // @TODO cambiar n y m a datos de GUIFrame

        // @TODO Cambiar 5 por tamaño del buffer
        for(int i=0 ; i < tambuf ; i++) {
            product.setSymbol(symbols.charAt(r.nextInt(4)));
            product.setNum1(r.nextInt(m - n) + n);
            product.setNum2(r.nextInt(m - n) + n);
            product.setFlag(1);
            this.buffer.produce(product);
            System.out.println("Producer produced: " + "(" + product.getSymbol() + " " + product.getNum1() + " " + product.getNum2() + ") ID: " + id);
            producerconsumer.GUIFrame.model.addRow(new Object[]{id,  "(" + product.getSymbol() + " " + product.getNum1() + " " + product.getNum2() + ")"} );
            producerconsumer.GUIFrame.jProgressBar1.setValue(producerconsumer.GUIFrame.jProgressBar1.getValue() + (100 / tambuf) );
            

            //@TODO cambiar 1000 por timepo de espera de GUI
            try {
                Thread.sleep(pesp);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}