package javaSpecial;

public class Person2Ex1 {

	public static void main(String[] args) {
		//��ü �ʵ� ����
		Person2 chanho;
		/*chanho=(age) -> {
			int myAge=age+1;
			System.out.println("�� ���̴� " + myAge + "�� �Դϴ�.");
		};
		chanho.info(26);*/
		/*chanho=(age) -> System.out.println("�� ���̴� " + (age+1) + "�� �Դϴ�."); //�Ű������� ������ �϶��� ,���
		chanho.info(30);*/
		chanho=age -> System.out.println("�� ���̴� " + (age+1) + "�� �Դϴ�.");
		chanho.info(30); //����� �ϳ��� ���� �߰�ȣ ���� ����

	}

}
