package com.java.design.patterns;

enum carTypes{
	SMALL, LUXURY, SEDAN
}

abstract class Car{
	protected carTypes carModel;

	public Car(carTypes carModel) {
		super();
		this.carModel = carModel;
	}

	public carTypes getCarModel() {
		return carModel;
	}

	public void setCarModel(carTypes carModel) {
		this.carModel = carModel;
	}
	
	public abstract void constructCar();
}

class SmallCar extends Car{

	public SmallCar(carTypes carModel) {
		super(carModel);
	}

	@Override
	public void constructCar() {
		System.out.println(getCarModel());
		System.out.println("building small car");
		
	}
	
}

class SedanCar extends Car{

	public SedanCar(carTypes carModel) {
		super(carModel);
	}

	@Override
	public void constructCar() {
		System.out.println(getCarModel());
		System.out.println("building sedan car");
		
	}
	
}

class LuxuryCar extends Car{

	public LuxuryCar(carTypes carModel) {
		super(carModel);
	}

	@Override
	public void constructCar() {
		setCarModel(carTypes.SMALL);
		System.out.println(getCarModel());
		System.out.println("building luxury car");
		
	}
	
}


class CarFactroy{
	
	public Car getCarByType(carTypes model) {
		if (model.equals(carTypes.SMALL)) {
			return new SmallCar(carTypes.SMALL);
		}
		else if (model.equals(carTypes.SEDAN)) {
			return new SedanCar(carTypes.SEDAN);
		}
		else if (model.equals(carTypes.LUXURY)) {
			return new LuxuryCar(carTypes.LUXURY);
		}
		
		return null;
	}
	
}

public class FactoryDesignPatternEx2 {
	public static void main(String[] args) {
		CarFactroy factroy = new CarFactroy();
		Car car = factroy.getCarByType(carTypes.LUXURY);
		car.constructCar();
	}


}




