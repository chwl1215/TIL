package javaSpecial;

public class Person3Ex1 {

	public static void main(String[] args) {
		//��ü �ʵ� ����
		Person3 younghee;
		
		younghee=(h,w) -> {
			String result="�� ������ " + h + "cm�̰� �����Դ� " + w + "kg�Դϴ�";
			return result;
		};
		System.out.println(younghee.info(168.3, 47.5));

	}

}
