/**
 * Attention  OVERWRITE
 */
package p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class TestMain {
	public static void main(String[] args) {
		
		//读取51个二维数组，存入三维数组
		int [][][] levelAr3R =new int[51][20][20];
		for (int i = 0; i < 51; i++) {
			Readmap map=new Readmap(i);
			levelAr3R[i]=map.getmap();
		}

//		for (int r3 = 0; r3 < 51; r3++) {
//			for (int i = 0; i < 20; i++) {
//				for (int j = 0; j < 20; j++) {
//					
//					System.out.print(levelAr3R[r3][i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		saveAr3R(levelAr3R);
         
	}

	private static void saveAr3R(int ar3[][][]) {
		
		 
		 
		  //将数组中的数据写入到文件中。每行各数据之间TAB间隔/wu
		File file;
		  for (int r3 = 0; r3 < ar3.length; r3++) {
			  file = new File("map2/"+r3+".map");  //存放数组数据的文件
			  
			  try {
				FileWriter out = new FileWriter(file);  //文件写入流
				  for(int i=0;i<ar3[0].length;i++){
				   for(int j=0;j<ar3[0][0].length;j++){
				    out.write(ar3[r3][i][j]+"");
				   }
//			   out.write("\r\n");
				   out.write("\n");
				  }
				  out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
//		  BufferedReader in = new BufferedReader(new FileReader(file));  //
//		  String line;  //一行数据
//		  int row=0;
//		  //逐行读取，并将每个数组放入到数组中
//		  while((line = in.readLine()) != null){
//		   String[] temp = line.split("\t"); 
//		   for(int j=0;j<temp.length;j++){
//		    arr2[row][j] = Double.parseDouble(temp[j]);
//		   }
//		   row++;
//		  }
//		  in.close();
//		 
//		  //显示读取出的数组
//		  for(int i=0;i<n;i++){
//		   for(int j=0;j<n;j++){
//		    System.out.print(arr2[i][j]+"\t");
//		   }
//		   System.out.println();
//		  }
//		}
//		}
		
	}
}
class Readmap
{
	private int level,mx,my;
	private int[][] mymap=new int[20][20];
	FileReader r;
	BufferedReader br;
	String bb="";
	int[] x;int c=0;
	Readmap(int k)
	{
		level=k;
		String s;
		try
		{
			File f=new File("map1\\"+k+".map");
			r=new FileReader(f);
			br=new BufferedReader(r);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		try
		{
			while ((s=br.readLine())!=null)
			{
				bb=bb+s;
				
			}
		}
		catch (IOException g)
		{
			System.out.println(g);
		}
		byte[] d=bb.getBytes();
		int len=bb.length();
		int[] x=new int[len];
		for(int i=0;i<bb.length();i++)x[i]=d[i]-48;
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
		    {
				mymap[i][j]=x[c];
		        if(mymap[i][j]==5)
		        {
					mx=j;my=i;
		        }
		        c++;
		    }
	    }
	}
	int[][] getmap(){return mymap;}
	int getmanX(){return mx;}
	int getmanY(){return my;}
}
