abstract class Shape{
    String name;

    // Constructor of Shape class
    public Shape(String name){
        this.name = name;
    }

    abstract double area(); // abstract method in abstract class

    // Concrete method
    public void display(){
        System.out.println("The area of "+name+" is: "+area());
    }
}

class Circle extends Shape{

    private double radius;

    // constructor
    public Circle(double radius){

        super("Circle");// Call the constructor of the Shape class
        this.radius = radius;

    }

    // for abstract method
    double area(){
        return Math.PI * radius*radius;
    }

}