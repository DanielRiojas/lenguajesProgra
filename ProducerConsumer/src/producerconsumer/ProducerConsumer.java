
package producerconsumer;

public class ProducerConsumer {

    public static void main(String[] args) {
        
        Buffer buffer = new Buffer();
    
        // @TODO cambiar 5 por cantidadProductores
        for (int i = 0; i < 5; i++){
            Producer producer = new Producer(buffer,i);
            producer.start();
        }

        // @TODO cambiar 5 por cantidadConsumidores
        for (int i = 0; i < 5; i++){
            Consumer consumer = new Consumer(buffer, i);
            consumer.start();
        }
        

    }
    
}
