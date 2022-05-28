package javabase;

import java.util.Scanner;

public class Question133_7 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("---------------------------");
			System.out.print("선택 >");
			int num=scanner.nextInt();
			switch(num) {
			case 1:
				System.out.print("예금액 >>");
				balance+=scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액 >>");
				balance-=scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고 >>");
				System.out.println(balance);
				break;
			case 4:
				run=false;
				break;
			default :
				System.out.println("꺼지세요");
				break;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

}
