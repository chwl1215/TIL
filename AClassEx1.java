package interfacequestion;

public class AClassEx1 {

	public static void main(String[] args) {
		AClass aa=new AClass(); //�ν��� ��ü ����
		AClass.BClass bb=aa.new BClass(); //AClass���ο� �ִ� BClass ��ü ����
		bb.bField=10;
		bb.bMethod();
	}

}
