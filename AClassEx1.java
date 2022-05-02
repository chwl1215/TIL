package interfacequestion;

public class AClassEx1 {

	public static void main(String[] args) {
		AClass aa=new AClass(); //인스언스 객체 생성
		AClass.BClass bb=aa.new BClass(); //AClass내부에 있는 BClass 객체 생성
		bb.bField=10;
		bb.bMethod();
	}

}
