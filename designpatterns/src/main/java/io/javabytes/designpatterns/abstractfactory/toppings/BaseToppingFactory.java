package io.javabytes.designpatterns.abstractfactory.toppings;

import io.javabytes.designpatterns.abstractfactory.cheese.Cheese;
import io.javabytes.designpatterns.abstractfactory.sauce.Sauce;

public abstract class BaseToppingFactory {
	public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
