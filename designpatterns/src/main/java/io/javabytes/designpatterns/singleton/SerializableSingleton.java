package io.javabytes.designpatterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	/**
	 * generated serial ID is required to make sure that there are no exceptions thrown 
	 * when there is class change from serialized object to deserialization object
	 */
	private static final long serialVersionUID = 8712935629402378164L;

	private SerializableSingleton() {
		// private constructor
	}

	private static class DemoSingletonHolder {
		public static final SerializableSingleton INSTANCE = new SerializableSingleton();
	}

	public static SerializableSingleton getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
