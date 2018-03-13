package model;

import model.pizza.Pizza;
import model.pizza.california.CaliforniaStyleCheesePizza;
import model.pizza.california.CaliforniaStyleClamPizza;
import model.pizza.california.CaliforniaStylePepperoniPizza;
import model.pizza.california.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheese")){
			return new CaliforniaStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new CaliforniaStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new CaliforniaStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new CaliforniaStylePepperoniPizza();
		}else return null;
	}

}
