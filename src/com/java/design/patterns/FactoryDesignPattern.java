package com.java.design.patterns;

abstract class Plan{
	protected double rate;
	public abstract void getRate();
	
//	public Plan(double rate) {
//		this.rate = rate;
//	}
	
	public void CalculateBil(int uits) {
		System.out.println(uits);
		System.out.println(rate);
		System.out.println("Total Bil is\t "+ uits*rate);
	}
}

class ComercialPlan extends Plan{

	
//	public ComercialPlan(double rate) {
//		super(rate);
//	}

	@Override
	public void getRate() {
		rate = 15.50;
		System.out.println(rate);
		
	}
	
}

class DomesticPlan extends Plan{

	@Override
	public void getRate() {
		rate = 6.75;
		
	}
	
}

class InstitutionalPlan extends Plan{

	@Override
	public void getRate() {
		rate= 9.67;
		
	}
	
}

class PlanFactory{
	
public Plan getPlan(String planName) {
		
		if (planName.equalsIgnoreCase("DomesticPlan")) {
			System.out.println("worikg");
			return new DomesticPlan();
		}
		else if (planName.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		else if (planName.equalsIgnoreCase("ComercialPlan")) {
			return new ComercialPlan();
		}
		return null;
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		PlanFactory factory = new PlanFactory();
		Plan plan = factory.getPlan("ComercialPlan");
		plan.getRate();
		plan.CalculateBil(120);
	}
	
	

}
