package model;

import model.pizza.ChicagoStyleCheesePizza;
import model.pizza.Pizza;
import model.pizza.chicago.ChicagoStyleClamPizza;
import model.pizza.chicago.ChicagoStylePepperoniPizza;
import model.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else if(type.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if(type.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}else return null;
	}


}
