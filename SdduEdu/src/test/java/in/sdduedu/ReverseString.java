package in.sdduedu;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
//		String str = "Naman";
		Scanner scn = new Scanner(System.in);
		String std = scn.nextLine();
		int n= std.length();
		
		for(int i=n-1;i>=0;i--) {
			
			System.out.print(std.charAt(i));
		
		}
		//nama
		
//		Scanner scn = new Scanner(System.in);
//
//		String std = scn.nextLine();	
		
//		StringBuffer stbfr = new StringBuffer(std); 
//		
//		StringBuffer name = stbfr.reverse();
//		System.out.println(name);
	}
}
