package beakjoon_9489;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int score = stdIn.nextInt();
		
		if (90 <= score)
		{
			if (score <= 100)
			{				
				System.out.println("A");
			}
		}
		else if (80 <= score) {
			if (score <= 89)
			{				
				System.out.println("B");
			}
		}
		else if (70 <= score) {
			if (score <= 79)
			{				
				System.out.println("C");
			}
		}
		else if (60 <= score) {
			if (score <= 69)
			{				
				System.out.println("D");
			}
		}
		else
			{
			System.out.println("F");
		}
	}

}
