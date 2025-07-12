public class Demo {
    
    // Static method that receives an array of Scalable objects and a scale factor
    public static void scaleShapes(Scalable[] scalableObjects, double scaleFactor) {
        System.out.println("Scaling all shapes by factor: " + scaleFactor);
        for (Scalable obj : scalableObjects) {
            obj.scale(scaleFactor);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Task 4: Scalable Interface Demo ===\n");
        
        // Create objects of all shape types
        Shape[] shapes = {
            new Circle("Small Circle", 3.0),
            new Ellipse("Oval", 5.0, 3.0),
            new Triangle("Right Triangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("Equilateral", 4.0)
        };
        
        // Print objects before scaling
        System.out.println("BEFORE SCALING:");
        System.out.println("===============");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        System.out.println("\n");
        
        // Scale all shapes by factor of 2.0
        double scaleFactor = 2.0;
        scaleShapes(shapes, scaleFactor);
        
        System.out.println("\n");
        
        // Print objects after scaling
        System.out.println("AFTER SCALING (factor = " + scaleFactor + "):");
        System.out.println("==========================================");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        System.out.println("\n");
        
        // Demonstrate scaling with a different factor
        scaleFactor = 0.5;
        scaleShapes(shapes, scaleFactor);
        
        System.out.println("AFTER SCALING AGAIN (factor = " + scaleFactor + "):");
        System.out.println("===============================================");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}
