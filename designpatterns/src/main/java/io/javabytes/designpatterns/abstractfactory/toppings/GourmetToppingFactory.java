package io.javabytes.designpatterns.abstractfactory.toppings;

import io.javabytes.designpatterns.abstractfactory.cheese.Cheese;
import io.javabytes.designpatterns.abstractfactory.cheese.GoatCheese;
import io.javabytes.designpatterns.abstractfactory.sauce.CaliforniaOilSauce;
import io.javabytes.designpatterns.abstractfactory.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}

}
