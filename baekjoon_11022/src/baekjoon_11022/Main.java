package baekjoon_11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < num ; i++)
			{
				int count = i+1;
				StringTokenizer st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int result = A+B;
				bw.write("Case #"+count+": ");
				bw.write(A+" + "+B+" = "+result+"\n");
			}
				bw.flush();
				bw.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}