package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {

		List<Shape> list = new ArrayList<Shape>();

		list.add(new Rectangle(5, 6));
		list.add(new RectTriangle(6, 2));

		for (Shape shape : list) {
			System.out.println("area:" + shape.getArea());	//Area 출력
			System.out.println("perimeter:" + shape.getPerimeter());	//Perimeter 출력

			//새로운 Area와 perimeter를 출력
			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape;
				resizable.resize(0.5);
				System.out.println("new area:" + shape.getArea());
				System.out.println("new perimeter:" + shape.getPerimeter());
			}
		}

	}
}