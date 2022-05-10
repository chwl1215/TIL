package javaObject;

import java.util.Calendar;

public class EnumEx2 {

	public static void main(String[] args) { //열거 타입 => 열거 상수 중에서 하나의 상수를 저장하는 데이터 타입
		Week today=null;
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK ); //일(1) ~토(7
		System.out.println("올달는=" + week);
		switch(week) {
		case 1 :
			today=Week.SUNDAY;
			break;
		case 2 :
			today=Week.MONDAY;
			break;
		case 3 :
			today=Week.TUESDAY;
			break;
		case 4 :
			today=Week.WEDNESDAY;
			break;
		case 5 :
			today=Week.THURDAY;
			break;
		case 6 :
			today=Week.FRIDAY;
			break;
		case 7 :
			today=Week.SATURDAY;
			break;
			
		}
		System.out.println("오늘 요일은 무슨요일?" + today);
		if(today == Week.SUNDAY) {
			System.out.println("그냥 집에 쳐 있어");
		}else {
			System.out.println("닥치고 공부하셈 ㅅㄱ");
		}
	}

}
