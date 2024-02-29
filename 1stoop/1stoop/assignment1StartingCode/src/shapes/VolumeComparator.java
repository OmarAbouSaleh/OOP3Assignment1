package shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape3D> {
	@Override
	public int compare(Shape3D shape1, Shape3D shape2) {
		return Double.compare(shape1.getTheVolume(), shape2.getTheVolume());
		//comparing the shape3d objects by the volume
	}

}


