import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// write your code here
		int x = a + b;
		int y = a * b;
		if(y >= x){
		    System.out.println(y - x);
		}
		else{
		    System.out.println(x - y);
		}
	}
}
