package baekjoon_14681;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int hour = stdIn.nextInt();
		if(0 <= hour && hour <= 23)
		{
			int min = stdIn.nextInt();
			if(0 <= min && min <= 59 )
			{
				int result = min - 45;
				
				if(result < 0) 
				{
					if( hour == 0 )
					{
						hour = 24;
					}
					hour = hour-1;
					min = 60 + result;
				}
				else
				{
					min = result;
				}
				
				System.out.print(hour + " " + min);
			}
		}
	}

}
