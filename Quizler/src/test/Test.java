/**
 * John Locklear
 * Practicing inheritence
 */
package test;
/**
 * trying to figure out how to use Inheritance
 * @author Veteran
 *
 */
public class Test 
{
	// this makes the empty Q&A
	private String text;
	private String answer;
	
	public Test()
	{ 
	text = "";
	answer = "";
	}
	// this sets the question text
	public void setText(String questionText) 
	{
	text = questionText;
	}
	//sets the answer
	public void setAnswer(String correctResponse)
	{
		answer = correctResponse;
	}
	
	public boolean checkAnswer (String response)
	{
		return response.equals(answer);
	}
	public void display()
	{
		System.out.println(text);
		
	}	

}
