package javaAPI;

public class StringBufferEx1 {

	public static void main(String[] args) {
		/*String str="korea";
		str+="fighting";
		str+="corona";
		System.out.println(str);*/
		StringBuilder sb=new StringBuilder();
		sb.append("korea");
		sb.append("fighting");
		sb.append("corona");
		System.out.println(sb.toString());
		sb.insert(5, ':'); //값 넣어주기
		System.out.println(sb.toString());
		sb.insert(14, "==>"); //값 넣어주기
		System.out.println(sb.toString());
		sb.setCharAt(5, '-'); //값 들여쓰기
		System.out.println(sb.toString());
		sb.replace(6, 14, "remember"); //값 교체/대체
		System.out.println(sb.toString());
		sb.delete(14, 20);
		System.out.println(sb.toString());
		String result=sb.toString();
		System.out.println(result);
	}

}
