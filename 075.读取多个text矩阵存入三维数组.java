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

		for (int r3 = 0; r3 < 51; r3++) {
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					
					System.out.print(levelAr3R[r3][i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}

         
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
