package beakjoon_10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int turn = stdIn.nextInt();
		int[] resultArray = new int[turn];
		for(int i = 0 ; i < turn ; i++)
		{
			int numA = stdIn.nextInt();
			int numB = stdIn.nextInt();
			int result = numA + numB;
			resultArray[i] = result;
		}
		
		for(int i = 0 ; i < turn ; i++)
		{
			System.out.println(resultArray[i]);
		}
	}

}
