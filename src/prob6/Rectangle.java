package prob6;

public class Rectangle extends Shape implements Resizable{
	
	public double resultPer, resultArea;
	
	public Rectangle(int width , int height ) {
		super();
		// TODO Auto-generated constructor stub
		resultPer = (width + height) * 2;
		
		resultArea = width * height;	//6 *5 = 30
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		//System.out.println(s); //Test Code
		//System.out.println(resultArea); //Test Code
		resultArea = resultArea * s; 
		//System.out.println(resultArea); //Test Code
		resultPer = resultPer * s;
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
