public class ITriangle extends Shape{
    private double base;
    private double side;
    public ITriangle (double base, double side){
        super ("ITraingle");
        this.base = base;
        this.side = side;
    }
    public double getArea(){
        double s = (base + side + side)/2;
        return (Math.sqrt(s*(s-base)*(s-side)*(s-base)));
    }
    public double getPerimeter(){
        return (base + side + side);
    }
}

