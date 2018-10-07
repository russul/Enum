package cn.scut.yz_1;

public class Demo {
	public static void main(String[] args) {
		Direction d1 = Direction.FRONT;
		
		Direction d2 = Direction.RIGHT;
		System.out.println(d1);//cn.scut.yz_1.Direction@53606bf5
		System.out.println(d2);//cn.scut.yz_1.Direction@5f4fcc96
		
		System.out.println("------------------------------");
		
		Direction2 d3=Direction2.BACK;
		System.out.println(d3);
		System.out.println(d3.getName());
		System.out.println("------------------------------");
		
		
		Direction3 d4=Direction3.RIGHT;
		System.out.println(d4);
		d4.show();
	}
}
