package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date=new Date(); // 현재날짜
		System.out.println(date);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년 MM월 dd일 (hh시 mm분 ss초)");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy년 MM월 dd일 (E요일)"); //E:요일
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy년 D일"); // 1년중 현재 지난 일
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy년 MM월 dd일 (HH시 mm분 ss초)"); //HH:24시간 단위
		SimpleDateFormat sdf5=new SimpleDateFormat("yyyy년 MM월 dd일 (a hh시 mm분 ss초(S))"); //a:오전 오후, S:1000분의 1초 단위
		SimpleDateFormat sdf6=new SimpleDateFormat("yyyy년 MM월 dd일-w주차 (a hh시 mm분 ss초(S))"); //w:몇 주
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		System.out.println(sdf5.format(date));
		System.out.println(sdf6.format(date));
		
	}

}