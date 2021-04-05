import java.util.ArrayList;

public class Menu {
	String type;
	double price;
	ArrayList<Dish> dishes;
	
	public Menu(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(ArrayList<Dish> dishes) {
		this.dishes = dishes;
	}
	
	public String listDishes() {
		String list="";
		for (Dish d:this.dishes) {
			list=list+d.getName();
		}
		return list;
	}
	
	public void addDish(Dish dish) {
		this.dishes.add(dish);
	}

	@Override
	public String toString() {
		return "Menu [type=" + type + ", price=" + price + ", dishes=" + listDishes() + "]";
	}
	
	
	
	
}
