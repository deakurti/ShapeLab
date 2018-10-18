public class ETriangle extends Shape {
    private int side; //Defines side and allows user input of side//
    public ETriangle(int side){
        super("ETriangle"); //refernce to the constructor in Shape class//
        this.side = side; //initializes the value of the side//
    }
    public double getArea(){
        return ((Math.sqrt(3)/4))*(side*side);  //method to get area of the triangle and returns area//
    }
    public double getPerimeter(){
        return 3*side;
    }  //method to get perimeter of the triangle and returns perimeter//
}
