package cn.scut.yz_1;

public abstract class Direction3 {
	//�������������ڲ���ʵ��ö����
	public static final Direction3 FRONT = new Direction3(){

		@Override
		public void show() {
			System.out.println("ǰ");
			
		}
		
	};
	public static final Direction3 BACK = new Direction3(){
		public void show() {
			System.out.println("��");
			
		}
	};
	public static final Direction3 LEFT = new Direction3(){
		public void show() {
			System.out.println("��");
			
		}
	};
	public static final Direction3 RIGHT = new Direction3(){
		public void show() {
			System.out.println("��");
			
		}
	};
	
	private String name;
	//����һ���в����Ĺ���
//	private Direction3(String name) {
//		this.name = name;
//	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
