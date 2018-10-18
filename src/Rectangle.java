public class Rectangle extends Shape {
    private int height; //Defines height and allows user input of height//
    private int width; //Defines width and allows user input of width//
    public Rectangle(int height, int width){
        super("Rectangle"); //refernce to the constructor in Shape class//
        this.height = height; //initializes the value of the height//
        this.width = width; //initializes the value of the width//
    }
    public double getArea(){
        return (width * height);
    }  //method to get area of the rectangle and returns area//
    public double getPerimeter(){
        return (2 * width + 2 * height);  //method to get perimeter of the rectangle and returns area//
    }
}
