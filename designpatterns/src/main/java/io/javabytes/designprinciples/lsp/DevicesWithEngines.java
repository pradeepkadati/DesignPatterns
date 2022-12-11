package io.javabytes.designprinciples.lsp;

public class DevicesWithEngines extends TransportationDeviceSolution {

	Engine engine;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	void startEngine() {
		// transportation device with engines.
	}
}
