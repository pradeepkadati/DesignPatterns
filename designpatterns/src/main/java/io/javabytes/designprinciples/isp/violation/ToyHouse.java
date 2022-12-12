package io.javabytes.designprinciples.isp.violation;

public class ToyHouse implements Toy {

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// This is violation of ISP, even though Toy House need not move it has to implement the method.

	}

	@Override
	public void fly() {
		// This is violation of ISP, even though Toy House need not move it has to implement the method.

	}

}
