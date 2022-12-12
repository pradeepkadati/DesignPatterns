package io.javabytes.designprinciples.ocp.solution;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
	public boolean isValidClaim() {
		System.out.println("VehicleInsuranceSurveyor: Validating Vehicle insurance claim...");
		/* Logic to validate Vehicle insurance claims */
		return true;
	}
}
