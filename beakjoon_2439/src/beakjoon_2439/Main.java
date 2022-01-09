package beakjoon_2439;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i=0; i<7; i++) {
		        if(i<4) {
		           //X
		           for(int j=0; j<7; j++)
		           {
		              for(int k=0; k<j; k++)
		              {
		            	  bw.write(" ");   
		              }
		              bw.write("*");   
		           }
		           bw.write("\n");   
		        }
//		        else if(i>4) {
//		           for(int j=3; j<i; j++) {
//		              System.out.print("0");
//		           }
//		           for(int k=8; k>i-2; k--) {
//		              System.out.print("*");
//		           }
//		        }
		        if(i==4)
		        {
		           for(int j=0;j<7; j++)
		           {
		        	   bw.write("*");
		           }
		        }

		        bw.write("\n");
		   
				bw.flush();
				bw.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

}