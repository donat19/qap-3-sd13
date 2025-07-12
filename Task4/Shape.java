public abstract class Shape implements Scalable {
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
    
    // Note: scale method from Scalable interface is not implemented here
    // Each subclass must implement it according to their specific scaling needs
}
