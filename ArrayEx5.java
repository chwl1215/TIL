package javaObject;

public class ArrayEx5 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("�ڷḦ 2�� �־��ּ���");
		}else {
			System.out.println("ù��° �ڷ�=>" + args[0]);
			System.out.println("�ι�° �ڷ�=>" + args[1]);
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			int sum=num1+num2;
			System.out.println("�� ���� ��=" + sum);
		}

	}

}
