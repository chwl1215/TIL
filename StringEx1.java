package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		/*String str="���Ϻ��� ��̳� �޹�";
		System.out.println(str);
		char ch=str.charAt(7);
		System.out.println(ch);*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�Է�>>");
		String jumin=scanner.next();
		char sex=jumin.charAt(7); //7��° �� �Ǻ�
		if(jumin.length()==14) { //�� 14�ڸ����� �Ǻ� '-'�� �ڸ��� ����
 			if(sex=='1' || sex=='3') {
				System.out.println("�����Դϴ�");
			}else if(sex=='2' || sex=='4') {
				System.out.println("�����Դϴ�");
			}else {
				System.out.println("�ֹι�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}else {
			System.out.println("�ֹι�ȣ ���� �����ʽ��ϴ�");
		}
			
		
	}

}
