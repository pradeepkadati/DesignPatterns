package io.javabytes.designpatterns.abstractfactory.toppings;

import io.javabytes.designpatterns.abstractfactory.cheese.Cheese;
import io.javabytes.designpatterns.abstractfactory.cheese.MozzarellaCheese;
import io.javabytes.designpatterns.abstractfactory.sauce.Sauce;
import io.javabytes.designpatterns.abstractfactory.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
