package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Duncical", 5, 1.5, 2, 4, true, true);
		keyboardInput = new Scanner(System.in);
		
	}
	
	
	public void start()
	{
		System.out.println("We made monsters!");
		System.out.println("Here is mine" + firstMonster);
		
		System.out.println("Do you want to change the name");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
			System.out.println(firstMonster);
			
		}
		else
		{
			System.out.println("The name was kept");
		}
		
		System.out.println("It has " + firstMonster.getHeadTenticalCount() + " tenticals on its head");
		
		System.out.println("Do you want to change the number of tenticals?");
		answer = keyboardInput.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many do  you want?");
			int newNumber = keyboardInput.nextInt();
			firstMonster.setHeadTenticalCount(newNumber);
			System.out.println(firstMonster.getHeadTenticalCount());
			keyboardInput.nextLine();
			
		}
		else
		{
			System.out.println("It will remain unchanged");
		}
		
		
		System.out.println("It has " + firstMonster.getAntennaCount() + " antena");
		
		System.out.println("Do you want to change the antenna count?");
		answer = keyboardInput.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the new count to be?");
			double newDouble = keyboardInput.nextDouble();
			firstMonster.setAntennaCount(newDouble);
			System.out.println(firstMonster.getAntennaCount());
		}
		
		System.out.println("It has " + firstMonster.getEyeCount() + " eyes");
		System.out.println("It has " + firstMonster.getLegCount() + " legs");
		System.out.println("It has a neck " + firstMonster.getHasNeck());
		System.out.println("It has a mouth " + firstMonster.getHasMouth());
		
	}
	
	
}
