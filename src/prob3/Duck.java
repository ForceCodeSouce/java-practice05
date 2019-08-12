package prob3;

public class Duck extends Bird {

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
		System.out.println("참새("+ name +")는" + "날아다닙니다.");
		return this.name;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		System.out.println("참새("+ name +")는" + "소리내어 웁니다.");
		return this.name;
	}

	@Override
	public String toString() {
		return "오리의 이름은" + name + "입니다.";
	}

}
