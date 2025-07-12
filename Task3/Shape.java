public abstract class Shape {
    protected String name;
    
    // Constructor
    public Shape(String name) {
        this.name = name;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Abstract methods that must be implemented by subclasses
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + String.format("%.2f", getArea()) + 
               ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
