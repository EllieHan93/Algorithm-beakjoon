package beakjoon_2738;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < num ; i++)
			{
				for(int j = 0 ; j <= i ; j++)
				{
					bw.write("*");
				}
				bw.write("\n");
			}
				bw.flush();
				bw.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}