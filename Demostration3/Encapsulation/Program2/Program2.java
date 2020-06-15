class Circle{
	int radius;
	double circumference(){
		return 2*Math.PI*radius;
	}
	double area(){
		return Math.PI*radius*radius;
	}
}
class Box{
	int length,breath,height;
	double surfaceArea(){
		return 6*length*breath;
	}
	double volume(){
		return length*breath*height;
	}
}
class Program2{
	public static void main(String args[]){
		Circle c = new Circle();
		Box b = new Box();
		c.radius=5;
		b.length=6;
		b.breath=7;
		b.height=8;
		System.out.println("Circumference of circle "+c.circumference());
		System.out.println("Area of circle "+c.area());
		System.out.println("Surface Area of Box "+b.surfaceArea());
		System.out.println("Volume of box "+b.volume());
	}
}