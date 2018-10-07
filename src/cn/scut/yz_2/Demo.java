package cn.scut.yz_2;

public class Demo {
	public static void main(String[] args) {
		Direction d = Direction.BACK;
		System.out.println(d);//在公共枚举类中已经重写了toString方法  结果：BACK
		System.out.println("------------------");
		Direction2 d2 =Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		
		
	}
}
