package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Hairy Jerry III", 2.0, 3, false, 6, 1);
		keyboardInput = new Scanner(System.in);
	}
	
	
	public void start()
	{
//		System.out.println("Here is my monster: " + firstMonster);
//		System.out.println("my monster has this many eyes: " + firstMonster.getEyeCount());
		System.out.println("My monster looks like this:");
		System.out.println("My monster's name is: " + firstMonster.getName());
		System.out.println("My monster has " + firstMonster.getAntennaCount() + " antenna!");
		System.out.println("My monster has " + firstMonster.getEyeCount() + " eyes!");
		System.out.println("My monster's belly button status is: " + firstMonster.getHasBellyButton());
		System.out.println("My monster has " + firstMonster.getArmCount() + " arms!");
		System.out.println("My monster has " + firstMonster.getNoseCount() + " nose!");

//		if (firstMonster.getEyeCount() > 3)
//		{
//			System.out.println("That's a lot of eyes!");
//		}
		monsterDecisions();
		
		
		System.out.println("Your monster now has " + firstMonster.getNoseCount() + " noses");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Your new monster looks like this:");
		System.out.println("Your monster's name is: " + firstMonster.getName());
		System.out.println("Your monster has " + firstMonster.getAntennaCount() + " antenna!");
		System.out.println("Your monster has " + firstMonster.getEyeCount() + " eye(s)!");
		System.out.println("Your monster's belly button status is: " + firstMonster.getHasBellyButton());
		System.out.println("Your monster has " + firstMonster.getArmCount() + " arm(s)!");
		System.out.println("Your monster has " + firstMonster.getNoseCount() + " nose(s)!");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Thank you for playing!");
		System.out.println("You will find this monster in your closet tomorrow morning, Good luck!");
		
		loopMonster();
	}
	
	private void monsterDecisions()
	{
		System.out.println("Do you want my name to change?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Fine, don't change my name!");
		}
		System.out.println(firstMonster);
		
		System.out.println("Do you want to change the amount of antenna?");
		String antennaAnswer = keyboardInput.nextLine();
		
		if (antennaAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many antenna would you like me to have?");
			double newAntenna = keyboardInput.nextDouble();
			firstMonster.setAntennaCount(newAntenna);
			keyboardInput.nextLine();
			// clears the scanner
		}
		else
		{
			System.out.println("Okay, the amount of antenna will remain the same!");
		}
		System.out.println("The amount of antenna is: " + firstMonster.getAntennaCount());
		
		System.out.println("Would you like to change the amount of eyes?");
		String eyeAnswer = keyboardInput.nextLine();
		
		if (eyeAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("What would you like the new amount of eyes to be?");
			int newEye = keyboardInput.nextInt();
			firstMonster.setEyeCount(newEye);
			keyboardInput.nextLine();
			// clears the scanner
		}
		else
		{
			System.out.println("The amount of eyes will be the same!");
		}
		System.out.println("Your monster has " + firstMonster.getEyeCount() + " eyes!");
		
		System.out.println("Do you want to whether or not your monster has a belly button?");
		String bellyButtonAnswer = keyboardInput.nextLine();
		
		if (bellyButtonAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("Do you want your monster to have a belly button?");
			String trueFalse = keyboardInput.nextLine();
			if (trueFalse.equalsIgnoreCase("yes"))
			{
				firstMonster.setHasBellyButton(true);
			}
			else 
			{
				firstMonster.setHasBellyButton(false);
			}
		}
		else
		{
			System.out.println("Your monster's belly button status will remain the same!");
		}
		System.out.println("Your monsters belly button status: " + firstMonster.getHasBellyButton());
		
		System.out.println("Do you want to change how many arms your monster has?");
		String armAnswer = keyboardInput.nextLine();
	
		if (armAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many arms do you want your monster to have?");
			int armCount = keyboardInput.nextInt();
			firstMonster.setArmCount(armCount);
			keyboardInput.nextLine();
			// clears the scanner
		}
		else
		{
			System.out.println("Your monster will have the same amount of arms!");
		}
		System.out.println("Your monster has " + firstMonster.getArmCount() + " arms!");
		
		System.out.println("Do you want to change the number of noses your monster has?");
		String noseAnswer = keyboardInput.nextLine();
		
		if (noseAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many noses would you like your monster to have?");
			int noseCount = keyboardInput.nextInt();
			firstMonster.setNoseCount(noseCount);
			keyboardInput.nextLine();
			// clears the scanner
		}
		else
		{
			System.out.println("Your nose count will stay the same!");
		}	
	}
	private void loopMonster()
	{
		//define a variable for condition/test
		int numberOfTimes = 0;
		while(numberOfTimes < 1000)
		{
			//Code to do
			System.out.print("First monster words "+ firstMonster);
			
			//Code to change variable for condition
			numberOfTimes++;
		}
	}
	
}
