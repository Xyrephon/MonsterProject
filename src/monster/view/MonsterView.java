package monster.view;

import javax.swing.ImageIcon;

public class MonsterView 
{
	private String windowMessage;
	private ImageIcon monsterIcon;
	
	public MonsterView()
	{
		windowMessage = "This message brought to you by the MonsterProject! :D";
		monsterIcon = new ImageIcon(getClass().getResource("images/monsterproject.png"));
	}
	
}
