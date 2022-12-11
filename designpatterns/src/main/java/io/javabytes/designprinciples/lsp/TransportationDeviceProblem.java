package io.javabytes.designprinciples.lsp;

public class TransportationDeviceProblem {

	String name;
	double speed;
	Engine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	// Start Transportaion device engine 
	void startEngine() {
	}

}
