package shapes;

public abstract class Shape3D implements Comparable<Shape3D> {
	
	public abstract double getTheVolume();
	public abstract double getTheBaseArea();
	public abstract double getTheHeight();
	public abstract double calculateVolume();
	public abstract double calculateBaseArea();
	
	//getter method that returns the value of the volume property, this method does not perform any calculation but returns the value already been calculated and stored 
	// contains the formula for calculating the volume and return result
	@Override //implement compareTo to compare the Shape3D objects by the height
	public int compareTo(Shape3D other) {
		return Double.compare(this.getTheHeight(), other.getTheHeight());
		//the height become double and want to avoid precision issues 
	}
	
	

}


