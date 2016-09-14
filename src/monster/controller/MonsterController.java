package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Duncical", 5, 1.5, 2, 4, true, true);
	}
	
	
	public void start()
	{
		System.out.println("We made monsters!");
		System.out.println("Here is mine" + firstMonster);
	}
	
	
	/*
	 * monster name is duncical
	 * has 5 head tenticals
	 * has 1.5 antena
	 * has 2 eyes
	 * has 4 legs
	 * has neck
	 * has mouth
	 */
}
