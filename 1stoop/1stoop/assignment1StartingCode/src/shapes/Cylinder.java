package shapes;

public class Cylinder extends Shape3D
{
	private double height;
	private double radius;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	 @Override
	    public double getTheHeight() {
	        return height;
	  }
	 
	 public double getTheRadius() {
		 return radius;
	 }

	@Override
	public double calculateVolume() {
		return Math.PI * radius * radius * height;
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
