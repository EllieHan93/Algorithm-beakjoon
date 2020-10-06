package beakjoon_2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int year = stdIn.nextInt();
		
		int result = 0;
		if( year % 4 == 0)
		{
			if(year % 100 != 0)
			{
				result = 1;
			}
			else if( year % 400 == 0)
			{
				result = 1;
			}
			
		}
		System.out.print(result);
		
	}

}
