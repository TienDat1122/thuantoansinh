package Baitap_Interface;

public class MayTinhVinaCal500MS implements MayTinhBoTui {

	@Override
	public double cong(double a, double b) {
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		return a / b;
	}

}
