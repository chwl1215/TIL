package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {
		String text="ȫ�浿,��ö��&����ȣ,�̿���#������";
		String[] names=text.split(",|&|#"); //���ڿ� ������ ����
		/*for(String na:names) { //Ÿ�� �ܼ�:
			System.out.println(na);
		}*/
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
