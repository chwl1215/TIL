package javaSpecial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class StudentEx1 {

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printName(t ->t.getName());
		System.out.println("[국어 점수]");
		printScore(t ->t.getKorScore());
		System.out.println("[영어 점수]");
		printScore(t ->t.getEngScore());
		System.out.println("[수학 점수]");
		printScore(t ->t.getMatScore());
		
		
	}//main
	
	//List 동적 객체 필드
	public static List<Student> list=Arrays.asList(
			new Student("김철수", 80, 96, 85),
			new Student("홍길동", 90, 70, 60),
			new Student("이영희", 80, 70, 90)
	);
	//성적 자료 출력 메소드(이름 출력)
	public static void printName(Function<Student, String> function) {
		for(Student stu:list) {
			System.out.println(function.apply(stu) + "   ");
		}
		System.out.println();
	}
	//성적 자료 출력 메소드(점수 출력)
	public static void printScore(ToIntFunction<Student> function) {
		for(Student stu:list) {
			System.out.print(function.applyAsInt(stu) + "  ");
		}
		System.out.println();
	}
}
