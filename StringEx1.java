package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		/*String str="내일부터 어린이날 휴무";
		System.out.println(str);
		char ch=str.charAt(7);
		System.out.println(ch);*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("주민등록번호입력>>");
		String jumin=scanner.next();
		char sex=jumin.charAt(7); //7번째 수 판변
		if(jumin.length()==14) { //총 14자리인지 판별 '-'도 자릿수 인지
 			if(sex=='1' || sex=='3') {
				System.out.println("남성입니다");
			}else if(sex=='2' || sex=='4') {
				System.out.println("여성입니다");
			}else {
				System.out.println("주민번호를 잘못 입력하셨습니다.");
			}
		}else {
			System.out.println("주민번호 수가 맞지않습니다");
		}
			
		
	}

}
