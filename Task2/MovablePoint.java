public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    
    // Default constructor
    public MovablePoint() {
        super(); // Call Point's default constructor
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    
    // Constructor with position only
    public MovablePoint(float x, float y) {
        super(x, y); // Call Point's constructor
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    
    // Constructor with position and speed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call Point's constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }
    
    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    
    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }
    
    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    // Method to set both speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    // Method to get both speeds as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    
    // Method to move the point by its speed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Return this instance for method chaining
    }
    
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
