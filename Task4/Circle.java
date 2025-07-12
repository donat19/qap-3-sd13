public class Circle extends Ellipse {
    
    // Constructor - Circle is an ellipse where a = b = radius
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }
    
    // Getter for radius
    public double getRadius() {
        return a; // Since a = b = radius for a circle
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.a = radius;
        this.b = radius;
    }
    
    // Override getArea for more efficient circle calculation
    @Override
    public double getArea() {
        return Math.PI * a * a; // π * r²
    }
    
    // Override getPerimeter for more efficient circle calculation
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * a; // 2π * r
    }
    
    // Override scale to maintain circle property (a = b)
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor; // Keep a = b for circle
    }
    
    // toString method
    @Override
    public String toString() {
        return "Circle: " + name + " [radius=" + a + "], Area: " + 
               String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
