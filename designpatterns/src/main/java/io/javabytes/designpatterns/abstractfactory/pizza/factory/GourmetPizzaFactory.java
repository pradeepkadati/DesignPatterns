package io.javabytes.designpatterns.abstractfactory.pizza.factory;

import io.javabytes.designpatterns.abstractfactory.pizza.CheesePizza;
import io.javabytes.designpatterns.abstractfactory.pizza.PepperoniPizza;
import io.javabytes.designpatterns.abstractfactory.pizza.Pizza;
import io.javabytes.designpatterns.abstractfactory.pizza.VeggiePizza;
import io.javabytes.designpatterns.abstractfactory.toppings.BaseToppingFactory;
import io.javabytes.designpatterns.abstractfactory.toppings.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		BaseToppingFactory toppingFactory = new GourmetToppingFactory();
		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza(toppingFactory);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(toppingFactory);
			break;
		case "veggie":
			pizza = new VeggiePizza(toppingFactory);
			break;
		default:
			throw new IllegalArgumentException("No such pizza.");
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}