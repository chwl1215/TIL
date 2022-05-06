package Repeat;

import java.util.Scanner;

public class Repeat_Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C= sc.nextInt();
			for(int i=1; i<=C; i++) {
				int A= sc.nextInt();
				int B= sc.nextInt();
					System.out.println("Case #" + i +": " + A  +" + " + B + " = " + (A+B));		
			}
	}
}