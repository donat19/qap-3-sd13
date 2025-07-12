public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Testing Shape Hierarchy ===\n");
        
        // Create objects of all shape types
        Shape[] shapes = new Shape[5];
        
        try {
            // Create an Ellipse
            shapes[0] = new Ellipse("MyEllipse", 5.0, 3.0);
            
            // Create a Circle
            shapes[1] = new Circle("MyCircle", 4.0);
            
            // Create a Triangle
            shapes[2] = new Triangle("MyTriangle", 3.0, 4.0, 5.0); // Right triangle
            
            // Create an EquilateralTriangle
            shapes[3] = new EquilateralTriangle("MyEquilateralTriangle", 6.0);
            
            // Create another Triangle with different dimensions
            shapes[4] = new Triangle("ScaleneTriangle", 7.0, 8.0, 9.0);
            
            // Loop through array, printing name, area, perimeter
            System.out.println("All Shapes Information:");
            System.out.println("========================");
            for (int i = 0; i < shapes.length; i++) {
                System.out.println((i + 1) + ". " + shapes[i]);
            }
            
            System.out.println("\n=== Individual Shape Testing ===\n");
            
            // Test Ellipse specific methods
            System.out.println("Testing Ellipse:");
            Ellipse ellipse = (Ellipse) shapes[0];
            System.out.println("Semi-major axis (a): " + ellipse.getA());
            System.out.println("Semi-minor axis (b): " + ellipse.getB());
            ellipse.setA(6.0);
            ellipse.setB(4.0);
            System.out.println("After changing dimensions: " + ellipse);
            
            System.out.println("\nTesting Circle:");
            Circle circle = (Circle) shapes[1];
            System.out.println("Radius: " + circle.getRadius());
            circle.setRadius(5.0);
            System.out.println("After changing radius: " + circle);
            
            System.out.println("\nTesting Triangle:");
            Triangle triangle = (Triangle) shapes[2];
            System.out.println("Sides: a=" + triangle.getA() + ", b=" + triangle.getB() + ", c=" + triangle.getC());
            triangle.setA(5.0);
            System.out.println("After changing side a: " + triangle);
            
            System.out.println("\nTesting EquilateralTriangle:");
            EquilateralTriangle eqTriangle = (EquilateralTriangle) shapes[3];
            System.out.println("Side length: " + eqTriangle.getSide());
            eqTriangle.setSide(8.0);
            System.out.println("After changing side length: " + eqTriangle);
            
            System.out.println("\n=== Triangle Inequality Validation Testing ===");
            
            // Test triangle inequality validation
            try {
                Triangle invalidTriangle = new Triangle("InvalidTriangle", 1.0, 2.0, 5.0);
            } catch (IllegalArgumentException e) {
                System.out.println("✓ Triangle inequality validation works: " + e.getMessage());
            }
            
            try {
                Triangle validTriangle = new Triangle("ValidTriangle", 3.0, 4.0, 5.0);
                System.out.println("✓ Valid triangle created successfully: " + validTriangle.getName());
                // Try to set an invalid side
                validTriangle.setC(10.0);
            } catch (IllegalArgumentException e) {
                System.out.println("✓ Triangle inequality validation in setter works: " + e.getMessage());
            }
            
            System.out.println("\n=== Summary Statistics ===");
            double totalArea = 0;
            double totalPerimeter = 0;
            
            for (Shape shape : shapes) {
                totalArea += shape.getArea();
                totalPerimeter += shape.getPerimeter();
            }
            
            System.out.println("Total area of all shapes: " + String.format("%.2f", totalArea));
            System.out.println("Total perimeter of all shapes: " + String.format("%.2f", totalPerimeter));
            System.out.println("Average area: " + String.format("%.2f", totalArea / shapes.length));
            System.out.println("Average perimeter: " + String.format("%.2f", totalPerimeter / shapes.length));
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
