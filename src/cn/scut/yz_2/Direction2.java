package cn.scut.yz_2;

public enum Direction2 {

	// ����в������죬ͬ2��
	FRONT("ǰ"), BACK("��"), LEFT("��"), RIGHT("��");

	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
