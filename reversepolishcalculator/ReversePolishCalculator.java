
package reversepolishcalculator;
import java.util.Scanner;

/**
 * Reverse Polish Calculator (Postfix Calculator)
 * 
 * @author Vita
 */
public class ReversePolishCalculator {
    
    /**
     * Main thread of execution.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        Stack sck = new Stack();
        String exp;
        
        //System.out.print("Enter expression: ");
        //exp = scn.nextLine();
        
        exp = "2 3 + 4 *";
        String parts[] = exp.split(" ");
        
        for (int i = 0; i < parts.length; i++) {
            switch(parts[i]) {
                case "+":
                    sck.push(sck.pop() + sck.pop());
                    break;
                case "-": 
                    sck.push(-sck.pop() + sck.pop());
                    break;
                case "*":
                    sck.push(sck.pop() * sck.pop());
                    break;
                case "/":
                    sck.push(1 / (sck.pop() / sck.pop()));
                    break;
//                case "^":
//                    sck.push();
//                    break;
                default:
                    sck.push(Double.parseDouble(parts[i]));
            }
        }
        
        System.out.println("Result is: " + sck.pop());
    }
    
}
