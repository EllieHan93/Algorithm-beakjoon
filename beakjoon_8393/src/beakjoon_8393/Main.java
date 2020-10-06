package beakjoon_8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int result = 0;
		for(int i = 1 ; i <= num ; i++)
		{
			result += i;
		}
		
		System.out.println(result);
	}

}