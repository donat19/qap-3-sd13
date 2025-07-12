public class Ellipse extends Shape {
    protected double a; // semi-major axis
    protected double b; // semi-minor axis
    
    // Constructor
    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    
    // Getter for semi-major axis
    public double getA() {
        return a;
    }
    
    // Setter for semi-major axis
    public void setA(double a) {
        this.a = a;
    }
    
    // Getter for semi-minor axis
    public double getB() {
        return b;
    }
    
    // Setter for semi-minor axis
    public void setB(double b) {
        this.b = b;
    }
    
    // Implementation of abstract method getArea
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    
    // Implementation of abstract method getPerimeter
    // Using Ramanujan's approximation for ellipse perimeter
    @Override
    public double getPerimeter() {
        double h = Math.pow((a - b) / (a + b), 2);
        return Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }
    
    // Implementation of Scalable interface
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Ellipse: " + name + " [a=" + a + ", b=" + b + "], Area: " + 
               String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
