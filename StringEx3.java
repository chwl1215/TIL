package javaAPI;

public class StringEx3 {

	public static void main(String[] args) {
		//문자열 찾기
		String str="내일부터 어린이날 휴무입니다.";
		int index=str.indexOf("어린이");
		System.out.println(index); //특정문자 입력하면 문자가 위치한 수 출력
		String subject="이것이 자바다";
		int location=subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련이 없습니다.");
		}
	}

}
