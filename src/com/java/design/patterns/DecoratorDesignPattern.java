package com.java.design.patterns;

import java.util.PrimitiveIterator.OfDouble;

enum burgerSize {
	SMALL(20), MEDIUM(35), LARGE(50);

	private int price;

	private burgerSize(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

abstract class Burger {

	private String description;
	private long price;

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Burger(String description, long price) {
		super();
		System.out.println("burger object created");
		this.description = description;
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public long getPrice() {
		return price;
	}

	void showDetais() {
		System.out.println(getDescription() + " of price " + getPrice());

	}

}

class PotatoCornBurger extends Burger {

	public PotatoCornBurger(String description, long price) {
		super(description, price);
	}

}

class ZingerBurger extends Burger {

	public ZingerBurger(String description, long price) {
		super(description, price);
	}

}

abstract class BurgerDecorator extends Burger {

	protected Burger burger;

	public BurgerDecorator(Burger burger) {
		this.burger = burger;
		this.setDescription(burger.getDescription() + "\s" + additionalDescription());
		this.setPrice(burger.getPrice() + additionalPirce());
	}

	public abstract String additionalDescription();

	public abstract long additionalPirce();

}

class ExtraChissBurgerDecorator extends BurgerDecorator {

	public ExtraChissBurgerDecorator(Burger burger) {
		super(burger);
	}

	private static final String DESC_STRING = "with extra chiss";
	private static final long EXTRA_PRICE = 7;

	@Override
	public String additionalDescription() {
		return DESC_STRING;
	}

	@Override
	public long additionalPirce() {
		return EXTRA_PRICE;
	}

}

class ExtraSouceDecorator extends BurgerDecorator {

	public ExtraSouceDecorator(Burger burger) {
		super(burger);

	}

	@Override
	public String additionalDescription() {
		return "with extra souce";
	}

	@Override
	public long additionalPirce() {
		return 8;
	}

}

public class DecoratorDesignPattern {
	public static void main(String[] args) {
//		System.out.println(burgerSize.SMALL.getPrice());
//		burgerSize.SMALL.setPrice(70);
//		System.out.println(burgerSize.SMALL.getPrice());

		Burger burger = new PotatoCornBurger("Poteto Corn Burger", 70);
		burger.showDetais();
		Burger burgerDecorator = new ExtraChissBurgerDecorator(burger);
		burgerDecorator.showDetais();

		Burger souceDecorator = new ExtraSouceDecorator(burger);
		souceDecorator.showDetais();
		
		new ExtraChissBurgerDecorator(souceDecorator).showDetais();
		
	}

}
