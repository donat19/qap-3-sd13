public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Testing Point Class ===");
        
        // Test Point default constructor
        Point p1 = new Point();
        System.out.println("Default Point: " + p1);
        
        // Test Point with parameters
        Point p2 = new Point(1.1f, 2.2f);
        System.out.println("Point with parameters: " + p2);
        
        // Test setters and getters
        p1.setX(3.3f);
        p1.setY(4.4f);
        System.out.println("Point after setting x=3.3, y=4.4: " + p1);
        System.out.println("Getting x: " + p1.getX() + ", y: " + p1.getY());
        
        // Test setXY and getXY
        p1.setXY(5.5f, 6.6f);
        System.out.println("Point after setXY(5.5, 6.6): " + p1);
        float[] coordinates = p1.getXY();
        System.out.println("getXY(): [" + coordinates[0] + ", " + coordinates[1] + "]");
        
        System.out.println("\n=== Testing MovablePoint Class ===");
        
        // Test MovablePoint default constructor
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Default MovablePoint: " + mp1);
        
        // Test MovablePoint with position only
        MovablePoint mp2 = new MovablePoint(1.0f, 2.0f);
        System.out.println("MovablePoint with position: " + mp2);
        
        // Test MovablePoint with position and speed
        MovablePoint mp3 = new MovablePoint(0.0f, 0.0f, 1.1f, 2.2f);
        System.out.println("MovablePoint with position and speed: " + mp3);
        
        // Test speed setters and getters
        mp1.setXSpeed(0.5f);
        mp1.setYSpeed(1.0f);
        System.out.println("MovablePoint after setting speeds: " + mp1);
        System.out.println("Getting xSpeed: " + mp1.getXSpeed() + ", ySpeed: " + mp1.getYSpeed());
        
        // Test setSpeed and getSpeed
        mp2.setSpeed(1.5f, 2.5f);
        System.out.println("MovablePoint after setSpeed(1.5, 2.5): " + mp2);
        float[] speeds = mp2.getSpeed();
        System.out.println("getSpeed(): [" + speeds[0] + ", " + speeds[1] + "]");
        
        // Test move method
        System.out.println("\n=== Testing Move Functionality ===");
        System.out.println("Before move: " + mp3);
        mp3.move();
        System.out.println("After 1st move: " + mp3);
        mp3.move();
        System.out.println("After 2nd move: " + mp3);
        mp3.move();
        System.out.println("After 3rd move: " + mp3);
        
        // Test inheritance - MovablePoint can use Point methods
        System.out.println("\n=== Testing Inheritance ===");
        MovablePoint mp4 = new MovablePoint(10.0f, 20.0f, 0.1f, 0.2f);
        System.out.println("Initial MovablePoint: " + mp4);
        mp4.setX(15.0f); // Using inherited Point method
        mp4.setY(25.0f); // Using inherited Point method
        System.out.println("After using inherited setX/setY: " + mp4);
        System.out.println("Current position: (" + mp4.getX() + ", " + mp4.getY() + ")");
    }
}
