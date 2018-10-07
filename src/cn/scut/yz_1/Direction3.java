package cn.scut.yz_1;

public abstract class Direction3 {
	//抽象类用匿名内部类实现枚举类
	public static final Direction3 FRONT = new Direction3(){

		@Override
		public void show() {
			System.out.println("前");
			
		}
		
	};
	public static final Direction3 BACK = new Direction3(){
		public void show() {
			System.out.println("后");
			
		}
	};
	public static final Direction3 LEFT = new Direction3(){
		public void show() {
			System.out.println("左");
			
		}
	};
	public static final Direction3 RIGHT = new Direction3(){
		public void show() {
			System.out.println("右");
			
		}
	};
	
	private String name;
	//定义一个有参数的构造
//	private Direction3(String name) {
//		this.name = name;
//	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
}
