package javaObject;

public class EnumEx1 {
	static final double PI=3.141592;//한번만 입력 가능(상수: 불변의 값) //static : 고정(정적)
	
	public static void main(String[] args) { //열거타입 => 열거 상수 변수 : 하나의 값을 저장하는 메모리 공간 
		
		// (에러) num=30;
		//System.out.println(num);//
		
		double radius=5.0;
		double area=radius*radius*PI;
		System.out.println("반지름이 5일때 원의 면적=" + area);
		radius=10.0;
		area=radius*radius*PI;
		System.out.println("반지름이 10일때 원의 면적=" + area);

	}

}
