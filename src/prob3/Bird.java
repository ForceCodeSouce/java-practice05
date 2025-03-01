package prob3;

public abstract class Bird {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String fly();

	public abstract String sing();

}
