package week1.day2;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 22;
		System.out.println("Number is " + number);
		
		
		String[] studentsList = {"Raja","Rani","Ram"};
		int[] ageList = {22,22,23};
		char[][] grades = {
				{'A','B','F','C','E'},
				{'A','A','A','A','A'},
				{'B','B','B','B','B'}
						  };
		
		System.out.println("Whose data you want?");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		
		index = index -1;
		
		//Raja whose is 23 years old scored A, B, F, C, E
		System.out.println(studentsList[index] 
		+ " whose is "
		+ ageList[index]
		+ " years old scored "
		+  grades[index][0] + " , "
	    + grades[index][1] + " , "
	    + grades[index][2] + " , "
	    + grades[index][3] + " , "
        + grades[index][4]
	    );
	    			
	}
}

