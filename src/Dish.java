
public class Dish {
	private String name;

	public Dish(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName()+",";
	}
	
	
	
	
}
