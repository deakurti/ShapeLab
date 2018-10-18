
public class Circle extends Shape {
    private int radius; //Defines radius and allows user input of radius//
    public Circle (int radius)
    {
        super( "Circle") ; //refernce to the constructor in Shape class//
        this.radius = radius; //initializes the value of the radius//
    }
    public double getArea() //method to get area of the circle//
    {
        return (Math.PI * (radius * radius)); //returns the area//
    }
    public double getPerimeter() //method to get perimeter of the circle//
    {
        return (2 * Math.PI * radius); //returns the perimeter//
    }

}
