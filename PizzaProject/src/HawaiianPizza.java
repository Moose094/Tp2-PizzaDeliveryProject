
public class HawaiianPizza extends Pizza {
	public HawaiianPizza(String size) {
		super(size, "Hawaiian");
		this.toppings.add(new CanadianBacon());
		this.toppings.add(new Pineapple());
	}

}
