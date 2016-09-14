package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Hairy Jerry III", 2.0, 3, false, 6, 1);
	}
	
	/* 
	 * name = Hairy Jerry III
	 * antennaCount = 2
	 * eyeCount = 3
	 * hasBellyButton = false
	 * armCount = 6
	 * noseCount = 1
	 */
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster);
	}
}
