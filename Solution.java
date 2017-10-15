import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=findMinChanges(str);
		System.out.println(res);
		
		
	}
	private static int findMinChanges(String str) {
		char ch1='+';
		char ch2='-';
		int res1=0;
		int res2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch1)
				res1++;
			if(str.charAt(i)!=ch2)
				res2++;
			ch1=(ch1=='+')?'-':'+';
			ch2=(ch2=='+')?'-':'+';
		}
		return Math.min(res1, res2);
		
	}

}
