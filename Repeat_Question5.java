package Repeat;

import java.util.Scanner;

public class Repeat_Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int num = N+1;
			if(1<=N && N<=100000)
				for(int i=0; i<N; i++) {
					num-=1;
					System.out.println(num);
					}
		}
}