package javaObject;

public class ArrayEx9 {

	public static void main(String[] args) {
		String[] names= {"김철수","이영희","홍길동"};
		String[] copyNames=new String[5];
		System.arraycopy(names, 0, copyNames, 0, names.length); //프로그램이 짜여져있는 밥전기솥
		for(int i=0; i<copyNames.length; i++) { //얕은 복사
			System.out.print(copyNames[i] + " , ");
		}

	}

}
