package cn.scut.yz_1;

public class Direction2 {

	private String name;
//定义一个有参数的构造
	private Direction2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static final Direction2 FRONT = new Direction2("前");
	public static final Direction2 BACK = new Direction2("后");
	public static final Direction2 LEFT = new Direction2("左");
	public static final Direction2 RIGHT = new Direction2("右");
	
	
	
}
