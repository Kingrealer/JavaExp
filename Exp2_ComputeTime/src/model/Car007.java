package model;

import support.BaseModel;
import support.Common;

public class Car007 extends BaseModel implements Common{
	
	public Car007(double a, double b, double c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	public double getTime() {
		return A * B / C;
	}
	
}
