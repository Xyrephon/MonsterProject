package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Hairy Jerry III", 2.0, 3, false, 6, 1);
	}
	
	
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("my monster has this many eyes: " + firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
		{
			System.out.println("That's a lot of eyes!");
		}
	}
}
