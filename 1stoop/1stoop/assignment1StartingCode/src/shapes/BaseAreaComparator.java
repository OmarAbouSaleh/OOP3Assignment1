package shapes;

import java.util.Comparator;

public class BaseAreaComparator implements Comparator<Shape3D> {
	
	@Override
	public int compare(Shape3D shape1, Shape3D shape2) {
		return Double.compare(shape1.getTheBaseArea(), shape2.getTheBaseArea());
	}

}
// comparing the shape3d object by the base area