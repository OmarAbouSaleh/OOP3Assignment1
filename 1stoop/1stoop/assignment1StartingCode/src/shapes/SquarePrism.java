package shapes;

public class SquarePrism extends Shape3D
{
	private double height;
	private double side;
	

	public SquarePrism(double height, double side) {
		this.height = height;
		this.side = side;
	}
	
	@Override
	public double getTheHeight() {
		return height;
	}
	
	@Override
	public double calculateBaseArea() {
		return height * height;
	}
	
	@Override
	public double calculateVolume( ) {
		return calculateBaseArea() * side;
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
