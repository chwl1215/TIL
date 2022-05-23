package javaSpecial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class StudentEx1 {

	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printName(t ->t.getName());
		System.out.println("[���� ����]");
		printScore(t ->t.getKorScore());
		System.out.println("[���� ����]");
		printScore(t ->t.getEngScore());
		System.out.println("[���� ����]");
		printScore(t ->t.getMatScore());
		
		
	}//main
	
	//List ���� ��ü �ʵ�
	public static List<Student> list=Arrays.asList(
			new Student("��ö��", 80, 96, 85),
			new Student("ȫ�浿", 90, 70, 60),
			new Student("�̿���", 80, 70, 90)
	);
	//���� �ڷ� ��� �޼ҵ�(�̸� ���)
	public static void printName(Function<Student, String> function) {
		for(Student stu:list) {
			System.out.println(function.apply(stu) + "   ");
		}
		System.out.println();
	}
	//���� �ڷ� ��� �޼ҵ�(���� ���)
	public static void printScore(ToIntFunction<Student> function) {
		for(Student stu:list) {
			System.out.print(function.applyAsInt(stu) + "  ");
		}
		System.out.println();
	}
}
