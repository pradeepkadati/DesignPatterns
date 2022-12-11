package io.javabytes.designprinciples.lsp;

public class ProblemBicycle extends TransportationDeviceProblem {

	@Override
	void startEngine() {
		//This is the PRoblem, even though Bicycle is Transportation Device, it does not have engine.
		// we can not truly replace Car with Cycle Object
	}
}
