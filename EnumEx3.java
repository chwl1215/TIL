package javaObject;

public class EnumEx3 {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name=today.name(); //열거 객체를 무자로 리턴
		System.out.println(name);
		int ordinal=today.ordinal(); // 열거 객체의 위치를 숫자로  리턴(0부터 시작)
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.THURDAY;
		int result1=day1.compareTo(day2); //위치 차이
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		Week week=Week.valueOf("SUNDAY"); //문자열을 열거 객체로 리턴
		if(week == Week.SUNDAY || week == Week.SATURDAY) {
			System.out.println("즐거운 주말 보내세요");
		}else {
			System.out.println("평일이니 열심히 공부하세요");
		}
		Week[] days=Week.values(); //모든 열거 객체들을 배열로 리턴z
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
