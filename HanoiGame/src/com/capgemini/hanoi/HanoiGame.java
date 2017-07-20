package com.capgemini.hanoi;
import java.util.Scanner;

public class HanoiGame 
{
	
	String name = "";
	int numberOfDiscks;
	
	public void game()
	{
	Scanner rObject = new Scanner(System.in);
	
	System.out.println("Create your name");
	name = rObject.nextLine();
	
	System.out.println("Hello " + name + ".");
	
	
	System.out.println("Select number of items in game.");
	numberOfDiscks = rObject.nextInt();
	}
}
