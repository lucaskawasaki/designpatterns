package model;

import model.pizza.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nystore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nystore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
		

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");

	}

}
