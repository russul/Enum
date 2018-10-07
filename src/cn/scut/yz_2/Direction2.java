package cn.scut.yz_2;

public enum Direction2 {

	// 添加有参数构造，同2版
	FRONT("前"), BACK("后"), LEFT("左"), RIGHT("右");

	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
