class Circle{
	int radius;
	double circumference(){
		return 2*Math.PI*radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
}
class Encapsulation{
	public static void main(String args[]){
		Circle c = new Circle();
		c.radius=5;
		System.out.println("Circumference of circle "+c.circumference());
		System.out.println("Area of circle "+c.area());
	}
}