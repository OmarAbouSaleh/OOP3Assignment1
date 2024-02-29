package shapes;

public class Cone extends Shape3D {
	private double height;
	private double radius;
	
	public Cone(double height, double radius) {
		this.height = height;
		this.radius = radius;
				
	}
	
	public double getTheHeight() {
		return height;
	}
	
	
	public double getTheRadius() {
		return radius;
	}
	
	@Override
	public double calculateVolume() {
		return height * (1.0/3) * Math.PI * radius * radius;
		
	}
	
	@Override
	public double calculateBaseArea() {
		return Math.PI * radius * radius;
		
	}

	@Override
	public double getTheVolume() {
		double volume = calculateVolume();
		return volume;
	}

	@Override
	public double getTheBaseArea() {
		double baseArea = calculateBaseArea();
		return baseArea;
	}	
}
