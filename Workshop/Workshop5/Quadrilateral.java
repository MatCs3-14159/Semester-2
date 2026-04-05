package Workshop;

class Quadrilateral extends Shape{
	
	double a, b, c, d ,angle;
	
	Quadrilateral(double a, double b, double c, double d, double angle){
		  if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
	            throw new IllegalArgumentException("Sides must be positive numbers.");
	        }

	        // Basic validity check (not strict but useful)
	        if ((a + b + c + d) <= 0) {
	            throw new IllegalArgumentException("Invalid quadrilateral dimensions.");
	        }
	        //angle sum cannot be 360 or greater than that 
	        if (angle >= 360) {
	        	throw new IllegalArgumentException("Invalid quadrilateral angles.");
	        }
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.angle = angle;
	}
	
	@Override 
	void calculateArea() {
		try {
			double s = (a + b + c + d) / 2; 
			double rad = Math.toRadians(angle / 2);
			double area = Math.sqrt((s - a)*(s - b)*(s - c)*(s - d) - Math.pow(a*b*c*d*Math.cos(rad),2));
			
			if ((s - a) <= 0 || (s - b) <= 0 || (s - c) <= 0 || (s - d) <= 0) {
	            throw new ArithmeticException("Invalid quadrilateral dimensions.");
	        }
			if (Double.isNaN(area)) {
                throw new ArithmeticException("Invalid shape for area calculation.");
            }
			System.out.printf("Area of Quadrilateral: %.2f%n", area + "sq units.");
		
		} catch(Exception e) {
			System.out.println("Error calculating area: " + e.getMessage());
		}
	}
	@Override
	void calculatePerimeter() {
		System.out.printf("Perimeter of Quadrilateral: %.2f%n", a + b + c + d);
		
	}
	
	public void print() {
		System.out.println(" child class");
	}
}
