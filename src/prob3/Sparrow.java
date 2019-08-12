package prob3;

public class Sparrow extends Bird {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+ name +")는" + "날지 않습니다.");
		return name;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		System.out.println("오리("+ name +")는" + "소리내어 웁니다.");
		return name;
	}

	@Override
	public String toString() {
		return "참새의 이름은" + name + "입니다.";
	}
	
	

}
