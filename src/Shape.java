public abstract class Shape { //why is this an error?//
    private String type;
    public Shape(String type)
    {
        this.type = type;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString()
    {
        return "I am a " + type + ".";
    }
}