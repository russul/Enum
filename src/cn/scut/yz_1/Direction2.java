package cn.scut.yz_1;

public class Direction2 {

	private String name;
//����һ���в����Ĺ���
	private Direction2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static final Direction2 FRONT = new Direction2("ǰ");
	public static final Direction2 BACK = new Direction2("��");
	public static final Direction2 LEFT = new Direction2("��");
	public static final Direction2 RIGHT = new Direction2("��");
	
	
	
}
