package monster.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MonsterView 
{
	private String windowMessage;
	private ImageIcon monsterIcon;
	
	public MonsterView()
	{
		windowMessage = "This message brought to you by the MonsterProject! :D";
		monsterIcon = new ImageIcon(getClass().getResource("images/monsterproject.png"));
	}
	
	public String collectUserText(String displayText)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, monsterIcon, null, "Type here please!").toString();
		
		return userInput;
	}
	
}
