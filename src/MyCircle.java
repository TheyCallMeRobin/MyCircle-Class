public class MyCircle {
    /* Attributes/Data fields/Properties */
    private double x;
    private double y;
    private double radius;


    /* Constructor(s) */
    MyCircle () {
       this(0,0,1);
    }

    MyCircle (double radius) {
       this(0, 0, radius);

    }

    MyCircle (double x, double y) {
        this(x, y,1);
    }

    MyCircle (double x, double y, double radius) {
      this.x = x;
      this.y = y;
      if (radius > 0) {
          this.radius = radius;
      } else {
          this.radius = 1;
      }
    }

    /* Method(s) */
    // Getters and Setters
    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    // Other helpful methods
    public boolean contains(double x, double y) {
        double xPoint = Math.pow((x - this.x), 2);
        double yPoint = Math.pow((y - this.y), 2);
        double distanceXY = Math.sqrt(xPoint + yPoint);
        if (distanceXY <= this.radius){
            return true;
        }return false;

    }
}