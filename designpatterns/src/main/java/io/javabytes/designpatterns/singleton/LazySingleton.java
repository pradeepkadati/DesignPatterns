package io.javabytes.designpatterns.singleton;

/**
 * Singleton Pattern with Lazy Initialization.
 * @author kadat
 *
 */
public class LazySingleton {

	private static volatile LazySingleton INSTANCE;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new LazySingleton();
		}

		return INSTANCE;
	}
}
