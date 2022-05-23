
package producerconsumer;

import java.util.UUID;

public class ProducerConsumer {

    public static void run(String[] args) {
        
        //String uniqueID = UUID.randomUUID().toString();
        int pnum = 0, cnum = 0, pesp = 0, cesp = 0, tambuf = 0, n = 0, m = 0;
        try {
            pnum = Integer.parseInt(args[0]);
            cnum = Integer.parseInt(args[1]);
            pesp = Integer.parseInt(args[2]);
            cesp = Integer.parseInt(args[3]);
            tambuf = Integer.parseInt(args[4]);
            n = Integer.parseInt(args[5]);
            m = Integer.parseInt(args[6]);
            
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        
        Buffer buffer = new Buffer();
    
        // @TODO cambiar 5 por cantidadProductores
        for (int i = 0; i < pnum; i++){
            Producer producer = new Producer(buffer, i, n , m, tambuf, pesp);
            producer.start();
        }

        // @TODO cambiar 5 por cantidadConsumidores
        for (int i = 0; i < cnum; i++){
            Consumer consumer = new Consumer(buffer, i, tambuf, cesp);
            consumer.start();
        }
        

    }
    
}
