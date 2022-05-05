package Repeat;

import java.util.Scanner;

public class Repeat_Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 0;
			if(1<=n && n<=10000)
				for(int i=0; i<=n; i++) {
					sum+=i;
					}System.out.println(sum);
		}
}