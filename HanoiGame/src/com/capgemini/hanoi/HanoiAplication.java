package com.capgemini.hanoi;
import java.util.Scanner;

public class HanoiAplication {

	public static void main(String[] args) 
	{
		Hanoi hanoiObject = new Hanoi();
		
		String name = "";
		Scanner rObject = new Scanner(System.in);
		
		System.out.println("Create your name");
		name = rObject.nextLine();
		
		System.out.println("Hello " + name + ".");
		
		int numberOfDiscks;
		System.out.println("Select number of items in game.");
		numberOfDiscks = rObject.nextInt();
		
		System.out.println("Good luck.");
		
		hanoiObject.han(numberOfDiscks);
		
	}

}
