public class EquilateralTriangle extends Triangle {
    
    // Constructor - all sides are equal
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
    
    // Getter for side length
    public double getSide() {
        return a; // Since a = b = c for equilateral triangle
    }
    
    // Setter for side length - sets all three sides to the same value
    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive: " + side);
        }
        this.a = side;
        this.b = side;
        this.c = side;
    }
    
    // Override setters to maintain equilateral property
    @Override
    public void setA(double a) {
        setSide(a);
    }
    
    @Override
    public void setB(double b) {
        setSide(b);
    }
    
    @Override
    public void setC(double c) {
        setSide(c);
    }
    
    // Override getArea for more efficient equilateral triangle calculation
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * a * a; // (√3/4) * side²
    }
    
    // Override getPerimeter for more efficient calculation
    @Override
    public double getPerimeter() {
        return 3 * a; // 3 * side
    }
    
    // toString method
    @Override
    public String toString() {
        return "EquilateralTriangle: " + name + " [side=" + a + "], Area: " + 
               String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
