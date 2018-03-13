package model;

import model.pizza.NYStyleCheesePizza;
import model.pizza.Pizza;
import model.pizza.ny.NYStyleClamPizza;
import model.pizza.ny.NYStylePepperoniPizza;
import model.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new NYStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}else return null;
	}

}
