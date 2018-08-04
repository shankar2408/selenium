package week1.day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i = 0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number:");
		int i=obj.nextInt();


		switch(i)
		{
		case 0:
		System.out.println("testcase passed");
		break;
		
		case 1:
			System.out.println("testcase failed");
			break;
		case 2:
			System.out.println("testcase blocked");
			break;
		default:
			System.out.println("testcase invalid");
			
		
		
		}
	}

}
