package baekjoon_2742;

import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int num = Integer.parseInt(br.readLine());
			for(int i = num ; i > 0 ; i--)
			{
				bw.write(i+"\n");
			}
			
				bw.flush();
				bw.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}