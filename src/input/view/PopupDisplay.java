package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class
 * @author jwil9706
 *@version 1.0 09/24/15
 */
public class PopupDisplay 
{
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
