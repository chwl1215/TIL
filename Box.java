package javaSpecial;
//제네릭 타입 클래스
public class Box<T> {
	//객체 필드
	private T t; //객체 타입이 정해져 있지 않을 때 사용

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	

	
}
