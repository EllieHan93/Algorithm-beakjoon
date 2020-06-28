package beakjoon_2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		int A = Integer.parseInt(a);
		
		int B_hundreds = Integer.parseInt(b.substring(0,1));
		int B_tens = Integer.parseInt(b.substring(1,2));
		int B_units = Integer.parseInt(b.substring(2));
		
		System.out.println(A*B_units);
		System.out.println(A*B_tens);
		System.out.println(A*B_hundreds);
		System.out.println((A*B_hundreds*100)+(A*B_tens*10)+(A*B_units));
	}

}
