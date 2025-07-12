public class Triangle extends Shape {
    protected double a, b, c; // three sides of the triangle
    
    // Constructor with triangle inequality validation
    public Triangle(String name, double a, double b, double c) {
        super(name);
        
        // Validate triangle inequality: sum of any two sides must be greater than the third
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle: Triangle inequality not satisfied. " +
                "Sides: a=" + a + ", b=" + b + ", c=" + c);
        }
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Helper method to validate triangle inequality
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && 
               (a > 0) && (b > 0) && (c > 0);
    }
    
    // Getters
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    public double getC() {
        return c;
    }
    
    // Setters with validation
    public void setA(double a) {
        if (!isValidTriangle(a, this.b, this.c)) {
            throw new IllegalArgumentException("Invalid triangle: Setting a=" + a + " violates triangle inequality");
        }
        this.a = a;
    }
    
    public void setB(double b) {
        if (!isValidTriangle(this.a, b, this.c)) {
            throw new IllegalArgumentException("Invalid triangle: Setting b=" + b + " violates triangle inequality");
        }
        this.b = b;
    }
    
    public void setC(double c) {
        if (!isValidTriangle(this.a, this.b, c)) {
            throw new IllegalArgumentException("Invalid triangle: Setting c=" + c + " violates triangle inequality");
        }
        this.c = c;
    }
    
    // Implementation of abstract method getArea using Heron's formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    // Implementation of abstract method getPerimeter
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Triangle: " + name + " [a=" + a + ", b=" + b + ", c=" + c + "], Area: " + 
               String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
