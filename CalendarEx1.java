package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {

	public static void main(String[] args) {
		TimeZone tz=TimeZone.getTimeZone("America/Los_Angeles");
		Calendar date=Calendar.getInstance(tz);
		int year=date.get(Calendar.YEAR);
		int month=date.get(Calendar.MONTH)+1; //�ε��� �ν����� 0�޺��� ���� -> +1�� ����� 1������ ����
 		int day=date.get(Calendar.DAY_OF_MONTH);
		System.out.println("������" + year + "��" + month + "��" + day + "��");
		int week=date.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		String[] weeks= {"����" , "��","��","ȭ","��","��","��","��"};
		/*String strWeek=null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek="������";
			case Calendar.TUESDAY:
				strWeek="ȭ����";
			case Calendar.WEDNESDAY:
				strWeek="������";
			case Calendar.THURSDAY:
				strWeek="�����";
			case Calendar.FRIDAY:
				strWeek="�ݿ���";
			case Calendar.SATURDAY:
				strWeek="�����";
			case Calendar.SUNDAY:
				strWeek="�Ͽ���";	
		}
			System.out.println("������ " + strWeek + "�Դϴ�.");
	}*/
		System.out.println("������ " + weeks[week] + weeks[0] + "�Դϴ�.");
		int hour=date.get(Calendar.HOUR);
		int minute=date.get(Calendar.MINUTE);
		int second=date.get(Calendar.SECOND);
		int amPm=date.get(Calendar.AM_PM);
		String strAmPm=null;
		if(amPm==Calendar.AM) {
			strAmPm="����";
		}else {
			strAmPm="����";
		}
		System.out.println(("���� �ð��� " + strAmPm + " "+ hour + "�� " + minute + "�� " + second + "���Դϴ�."));
		
	}
}