package javaObject;

public class EnumEx3 {

	public static void main(String[] args) {
		Week today=Week.SUNDAY;
		String name=today.name(); //���� ��ü�� ���ڷ� ����
		System.out.println(name);
		int ordinal=today.ordinal(); // ���� ��ü�� ��ġ�� ���ڷ�  ����(0���� ����)
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.THURDAY;
		int result1=day1.compareTo(day2); //��ġ ����
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		Week week=Week.valueOf("SUNDAY"); //���ڿ��� ���� ��ü�� ����
		if(week == Week.SUNDAY || week == Week.SATURDAY) {
			System.out.println("��ſ� �ָ� ��������");
		}else {
			System.out.println("�����̴� ������ �����ϼ���");
		}
		Week[] days=Week.values(); //��� ���� ��ü���� �迭�� ����z
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
