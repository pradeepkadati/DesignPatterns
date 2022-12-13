package io.javabytes.designpatterns.singleton;

/**
 * Singleton Pattern with Eager Initialization.
 * @author kadat
 *
 */
public class EagerSingleton {

	private static volatile EagerSingleton INSTANCE = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
