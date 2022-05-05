package Repeat;

import java.util.Scanner;

public class Repeat_Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int N = sc.nextInt();
				if(N>=1 && N<=9) {
				for(int i=1; i<10; i++) {
					System.out.println(N + " * " + i + " = " + N*i);
				}		
			}	
		}
}