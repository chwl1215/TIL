package javaSpecial;

public class BoxEx1 {

	public static void main(String[] args) {
		Box<String> box1=new Box<String>();
		box1.setT("ȫ�浿");
		String name=box1.getT();
		Box<Integer> box2=new Box<Integer>();
		box2.setT(23);
		int age=box2.getT();
		System.out.println("�̸���: " + name + "\n���̴�: " + age);
	}

}
