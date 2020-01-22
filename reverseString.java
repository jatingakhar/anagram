package javagroupquest;
import java.util.*;
public class stringwordreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int t1=0;t1<t;t1++)
		{
		String s1=sc.next();
		String s3[]=s1.split("\\.");
		for(int i=s3.length-1;i>=0;i--)
		{
			System.out.print(s3[i]);
			if(i!=0)
				System.out.print(".");
		}
		}		

	}

}
