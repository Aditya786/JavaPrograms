//Multiple objects
class Circle{
	int radius;
	double circumference(){
		return 2*Math.PI*radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
}
class Program3{
	public static void main(String args[]){
		Circle c1 = new Circle(); //object 1
		c1.radius=5;
		Circle c2 = new Circle(); //object 2
		c2.radius=10;
		System.out.println("Circumference of circle 1 is "+c1.circumference());
		System.out.println("Area of circle 1 is "+c1.area());
		System.out.println("Circumference of circle 2 is "+c2.circumference());
		System.out.println("Area of circle 2 is "+c2.area());
	}
}