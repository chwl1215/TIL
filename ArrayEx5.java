package javaObject;

public class ArrayEx5 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("자료를 2개 넣어주세요");
		}else {
			System.out.println("첫번째 자료=>" + args[0]);
			System.out.println("두번째 자료=>" + args[1]);
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			int sum=num1+num2;
			System.out.println("두 수의 합=" + sum);
		}

	}

}
