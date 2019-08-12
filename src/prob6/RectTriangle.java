package prob6;

public class RectTriangle extends Shape {
	
	public double resultPer, resultArea;

	// Math 클래스 사용가능
	public RectTriangle(int width , int height ) {
		super();
		// TODO Auto-generated constructor stub
		//둘레
		double width2 = width * width;
		double height2 = height * height;
		double total = width2 + height2;
		total = Math.sqrt(total);
		resultPer = width + height + total;
		
		//넓이
		resultArea = width * height * 0.5;
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return resultArea;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		
		return resultPer;
	}

}
