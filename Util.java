package javaSpecial;

public class Util {
	//���׸� Ÿ�� �޼ҵ�
	public static <T> Box<T> boxing(T t) {
		Box<T> box=new Box<T>();
		box.setT(t);
		return box;
	}
}
