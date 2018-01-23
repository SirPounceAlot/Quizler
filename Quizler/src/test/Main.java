/**
 * john Locklear
 */
package test;
import java.util.Scanner;
/**
 * trying to figure out how to use Inheritance
 * @author Veteran
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Test a = new Test();
		a.setText("Did i do this right");
		a.setAnswer("yes");
		a.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(a.checkAnswer(response));

	}

}
