
package producerconsumer;

import java.util.UUID;

public class ProducerConsumer {

    public static void run(String[] args) {
        
        //String uniqueID = UUID.randomUUID().toString();
        
        Buffer buffer = new Buffer();
        
        Producer producer = new Producer(buffer);
        producer.start();
        
        Consumer consumer = new Consumer(buffer);
        consumer.start();
    }
    
}
