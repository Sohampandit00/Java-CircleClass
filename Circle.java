public class Circle
{
private double radius;

public Circle(){
this.radius = 1/0;
}

public Circle(double radius){
this.radius = radius;

}

public double getRadious(){
return radius;
}

public void setRadius(double radius){
this.radius = radius;
}

public double getArea(){
return radius*radius*Math.PI;
}

public String toString(){
return "The circle has an area of " + getArea();
}
}

public class Circle2
{
public static void main(String[] args){
Circle circle1 = new Circle();
circle1.setRadius(6.0);
circle1.getArea();
System.out.println(circle1);
}
}
