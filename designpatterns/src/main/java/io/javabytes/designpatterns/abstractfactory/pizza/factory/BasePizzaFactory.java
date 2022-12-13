package io.javabytes.designpatterns.abstractfactory.pizza.factory;

import io.javabytes.designpatterns.abstractfactory.pizza.Pizza;

public abstract class BasePizzaFactory {
	public abstract Pizza createPizza(String type);
}
