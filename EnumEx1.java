package javaObject;

public class EnumEx1 {
	static final double PI=3.141592;//�ѹ��� �Է� ����(���: �Һ��� ��) //static : ����(����)
	
	public static void main(String[] args) { //����Ÿ�� => ���� ��� ���� : �ϳ��� ���� �����ϴ� �޸� ���� 
		
		// (����) num=30;
		//System.out.println(num);//
		
		double radius=5.0;
		double area=radius*radius*PI;
		System.out.println("�������� 5�϶� ���� ����=" + area);
		radius=10.0;
		area=radius*radius*PI;
		System.out.println("�������� 10�϶� ���� ����=" + area);

	}

}
