package cn.scut.yz_2;

public enum Direction3 {  //ö����ĳ����಻����abstrct����
	FRONT("ǰ"){

		@Override
		public void show() {
			System.out.println("ǰ");
			
		}
		
	}, 
	BACK("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	}, 
	LEFT("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	}
	, 
	RIGHT("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	};

	private String name;

	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void show();
}
