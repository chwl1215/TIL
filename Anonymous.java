package ClassConfirmEx;

public class Anonymous {
	Vehicle field= new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�");
			
		}
	};
	void method1 () {
		Vehicle mVehicle=new Vehicle() {

			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				
			}
			
		};
		mVehicle.run();
	}
	void method2(Vehicle v) {
		v.run();
		
	}
}
