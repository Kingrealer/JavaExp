package model;

import support.BaseModel;
import support.Common;

public class Plane extends BaseModel implements Common{

	public Plane(double a, double b, double c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	public double getTime() {
		return A + B + C;
	}
}
