package programs;

public class Circle {

	private static int randomId = 1054;
	private int ID;
	private Double radius= 0.0;

	public Circle() {

		ID=randomId++;
	}

	public Circle(int ID, Double radius) {
		this.ID = randomId++;
		this.radius = radius;
	}


	public int getID() {
		return ID;
	}

	public void setID(int Id) {
		ID = Id;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double getDiameter() {
		Double diameter = (double) (2 * radius);
		return diameter;
	}

	public float getArea() {
		Float area = (float) (Math.PI * Math.pow(radius, 2));
		return area;
	}

	public float getCircumference() {
		Float area = (float) (2 * Math.PI * radius);
		return area;
	}


	@Override
	public String toString() {
		return "" + ID + " "+"\t" + (String.format("%.3f",radius)) + " "+"\t" + (String.format("%.3f",getDiameter())) + " "+"\t"
				+(String.format("%.3f",getArea())) + " "+"\t" +(String.format("%.3f",getCircumference()))+ "";
	}

}
