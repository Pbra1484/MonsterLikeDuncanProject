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
		
		System.out.println("Do you want to change name");
		
		System.out.println("It has " + firstMonster.getHeadTenticalCount() + " tenticals on its head");
		System.out.println("It has " + firstMonster.getAntennaCount() + " antena");
		System.out.println("It has " + firstMonster.getEyeCount() + " eyes");
		System.out.println("It has " + firstMonster.getLegCount() + " legs");
		System.out.println("It has a neck " + firstMonster.getHasNeck());
		System.out.println("It has a mouth " + firstMonster.getHasMouth());
		
	}
	
	
}
