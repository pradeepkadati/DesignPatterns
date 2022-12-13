package io.javabytes.designpatterns.singleton;

/**
 * Singleton Pattern with synchronization and Lazy Initialization.
 * 
 * @author kadat
 *
 */
public class SynchronizedLazySingleton {

	private static volatile SynchronizedLazySingleton INSTANCE;

	private SynchronizedLazySingleton() {

	}

	public static SynchronizedLazySingleton getInstance() {

		if (INSTANCE == null) {
			synchronized (SynchronizedLazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new SynchronizedLazySingleton();
				}

			}
		}

		return INSTANCE;
	}
}
