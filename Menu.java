interface IMenu{}

class Soup implements IMenu{
	Order menu;
	boolean isVeg;

	Soup(Order menu, boolean isVeg){
		this.menu = menu;
		this.isVeg;
	}
}

class Salad implements IMenu{
	Order menu;
	boolean isVeg;
	String dressing;

	Salad(Order menu, boolean isVeg, String dressing){
		this.menu = menu;
		this.isVeg = isVeg;
		this.dressing;
	}
}

class Sandwich implements IMenu{
	Order menu;
	String filling1;
	String filling2;
	Strin bread;

	Sandwich(Order menu, String filling1, String filling2, String bread){
		this.filling1 = filling1;
		this.filling2 = filling2;
		this.bread = bread;
	}
}

class Order{
	String name;
	int price;
}

class ExamplesDeliMenu{
	ExamplesDeliMenu(){}

	Order a = new Order("Soup",23);
	IMenu a1 = new Soup(a,false);
	Order b = new Order("Salad",45);
	IMenu b1 = new Salad(b,true, "mayo");
	Order c = new Order("Sandwich",25);
	IMenu c1 = new Sandwich(c,"peanut butter", "jelly", "pan de sal");
	Order d = new Order("Sandwich",25);
	IMenu d1 = new Soup(a,false);

}