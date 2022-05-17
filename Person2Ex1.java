package javaSpecial;

public class Person2Ex1 {

	public static void main(String[] args) {
		//객체 필드 선언
		Person2 chanho;
		/*chanho=(age) -> {
			int myAge=age+1;
			System.out.println("내 나이는 " + myAge + "세 입니다.");
		};
		chanho.info(26);*/
		/*chanho=(age) -> System.out.println("내 나이는 " + (age+1) + "세 입니다."); //매개변수가 여러개 일때는 ,사용
		chanho.info(30);*/
		chanho=age -> System.out.println("내 나이는 " + (age+1) + "세 입니다.");
		chanho.info(30); //출력이 하나일 때는 중괄호 생략 가능

	}

}
