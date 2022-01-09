package beakjoon_11728;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		List<Integer> A = new ArrayList(N);
		for(int i = 0 ; i < N ; i++) {
			A.add(scan.nextInt());
		}
		
		List<Integer> B = new ArrayList(N);
		for(int i = 0 ; i < M ; i++) {
			B.add(scan.nextInt());
		}
		
		List<Integer> result = new ArrayList();
		
		int i = 0, j = 0;
		
		while(i < N && j < M)
		{
			if(A.get(i) <= B.get(j))
			{
				result.add(A.get(i));
				i++;
			}
			else{
				result.add(B.get(j));
				j++;
			} 
		}
		for (;i < N; i++)
		{
			result.add(A.get(i));
		}
		for (;j < M; j++)
		{
			result.add(B.get(j));
		}
		result.forEach(x -> System.out.print(x + " "));
		
	}
}
