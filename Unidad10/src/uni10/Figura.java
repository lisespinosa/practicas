package uni10;

public class Figura {
	private double lado1;
	private double lado2;
	private double lado3;

	public Figura(double lado1, double lado2, double lado3) {
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
	}

	public Figura(double lado1, double lado2) {
		this(lado1, lado2, 1);
	}

	public Figura(double lado1) {
		this(lado1, 1, 1);
	}

	public Figura() {
		this(1, 1, 1);
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}

	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		} else {
			throw new IllegalArgumentException("Çíà÷åíèå äîëæíî áûòü áîëüøå 0");
		}
	}


}


