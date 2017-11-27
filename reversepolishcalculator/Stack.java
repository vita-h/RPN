
package reversepolishcalculator;

/**
 * Stack class.
 * 
 * @author Vita
 */
public class Stack {
    
    private double[] stackArray = new double[100];
    private int stackPointer = -1;
    
    /**
     * Stack push.
     *
     * @param el element to be pushed into the stack.
     */
    public void push (double el) {
        if (stackPointer == 99) {
            System.err.println("Stack is full!");
            System.exit(0);
        }
        stackArray[++stackPointer] = el;
    }
    
    /**
     * Stack pop.
     *
     * @return element to be popped from the stack.
     */
    public double pop () {     
        return (stackPointer < 0) ? -1 : stackArray[stackPointer--];
    }
  
}
