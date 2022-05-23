
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Buffer {

    private Scheme buffer = new Scheme();

    Buffer() {
        this.buffer.setFlag(0);
    }

    synchronized Scheme consume() {
        Scheme product = new Scheme();

        while(this.buffer.getFlag() == 0) {
            try {
                wait(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        product = this.buffer;
        this.buffer.setFlag(0);
        notifyAll();

        return product;
    }

    synchronized void produce(Scheme product) {
        while(this.buffer.getFlag() != 0) {
            try {
                wait(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer = product;

        notifyAll();
    }
}
