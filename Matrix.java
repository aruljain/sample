package com.demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	
	private static int[][] mat=new int[9][9];
	private static int[] gunPosition= new int[2];
	private static int[] playerPosition = new int[2];
	private static int direction;
	private static int moves;
	private static Scanner in;

	
	public static int[][] initializeMatrix()
	{
		Arrays.stream(mat).forEach(a -> Arrays.fill(a, 0));
		return mat;
	}
	
	public static void setPlayer()
	{			
	//	playerPosition[0]=getRandomNumber(0, 8);
	//	playerPosition[1]=getRandomNumber(0, 8);
	//	if(mat[playerPosition[0]][playerPosition[1]]!=5)
	//	mat[playerPosition[0]][playerPosition[1]]=1;
	//	else
	//	{
			playerPosition[1]=getRandomNumber(0, 8);
			playerPosition[0]=getRandomNumber(0, 8);
			mat[playerPosition[0]][playerPosition[1]]=1;
		//}
	}
	
	public static void setGun()
	{
		gunPosition[0]=getRandomNumber(0, 8);
		gunPosition[1]=getRandomNumber(0, 8);
		mat[gunPosition[1]][gunPosition[0]]=5;		
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static void initializeGame()
	{
		initializeMatrix();
		setGun();
		setPlayer();		
		System.out.println("Game Initialized: ");
		 in=new Scanner(System.in);		
	}
	
	public static void move()
	{
		initializeMatrix();	
		mat[gunPosition[1]][gunPosition[0]]=5;
		if(direction==1) {
			playerPosition [0]-=moves;
			if(playerPosition[0]>=0 && playerPosition [0]<=8)
			mat[playerPosition [0]][playerPosition [1]]=1;
			else
				System.out.println("Cannot Move, Please choose another move");
		}
		if(direction==2) {
			playerPosition [0]+=moves;
			if(playerPosition [0]>=0 && playerPosition [0]<=8)
			mat[playerPosition [0]][playerPosition [1]]=1;
			else
				System.out.println("Cannot Move, Please choose another move");
		}
		if(direction==3) {
			playerPosition [1]-=moves;
			if(playerPosition [1]>=0 && playerPosition [1]<=8)
			mat[playerPosition [0]][playerPosition [1]]=1;
			else
				System.out.println("Cannot Move, Please choose another move");
		}
		if(direction==4) {
			playerPosition [1]+=moves;
			if(playerPosition [1]>=0 && playerPosition [1]<=8)
			mat[playerPosition [0]][playerPosition [1]]=1;
			else
				System.out.println("Cannot Move, Please choose another move");
		}

	}
	
	public static void printMatrix()
	{
		System.out.println("Gun Position======>  "+gunPosition[0]+"    "+gunPosition[1]);		
		System.out.println("Player Position======>  "+playerPosition [1]+"    "+playerPosition[0]);
		for (int[] r : mat) {
		    for (int c : r) {
		        System.out.print(c+" ");
		    }
		    System.out.println("");
		}
		
	}
public static void main(String args[]) throws IOException
{
	int i=0;
	initializeGame();	
	printMatrix();
	while(true)
	{
		i++;
		if(i>=10)
			break;
		System.out.println("enter the direction you want to move: ");
		
		System.out.println("1 ==> UP ");
		System.out.println("2 ==> DOWN ");
		System.out.println("3 ==> LEFT ");
		System.out.println("4 ==> RIGHT ");
		 direction=in.nextInt();
		System.out.println("enter the moves(0 to3):");
		 moves=in.nextInt();
		 move();
		 printMatrix();
	}
}
}
