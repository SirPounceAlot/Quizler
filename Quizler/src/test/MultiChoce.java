/**
 * John Locklear
 */
package test;
import java.util.Scanner;
public class MultiChoce {
/**
 * trying to figure out how to use Inheritance
 * @param args
 */
	public static void main(String[] args) {
		ChoiceQuestion first = new ChoiceQuestion();
		first.setText("How many turtles in the team?");
		first.addChoice("1",false);
		first.addChoice("3",false);
		first.addChoice("4",true);
		first.addChoice("2",false);
		
		ChoiceQuestion second = new ChoiceQuestion();
		second.setText("Who is the leader?");
		second.addChoice("Raph",false);
		second.addChoice("Mikey",false);
		second.addChoice("Donnie",false);
		second.addChoice("Leo",true);
		
		presentQuestion(first);
		presentQuestion(second);
		
	}

	private static void presentQuestion(ChoiceQuestion a) {
		a.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response =  in.nextLine();
		System.out.println(a.checkAnswer(response));
		
	}

}
