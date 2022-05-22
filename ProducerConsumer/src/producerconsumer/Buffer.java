
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Buffer {
    
    private Scheme buffer = new Scheme();
    
    Buffer() {
        this.buffer.setSymbol('f');
    }
    
    synchronized Scheme consume() {
        Scheme product = new Scheme();
        
        if(this.buffer.getSymbol() == 'f') {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        product = this.buffer;
        this.buffer.setSymbol('f');
        notifyAll();
        
        return product;
    }
    
    synchronized void produce(Scheme product) {
        if(this.buffer.getSymbol() != 'f') {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer = product;
        
        notifyAll();
    }
}
