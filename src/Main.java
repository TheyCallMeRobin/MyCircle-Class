public class Main {
    public static void main(String[] args) {
        MyCircle c = new MyCircle(); // default circle
        System.out.println("Circle attributes are: radius = " + c.getRadius() + ", center = ("+c.getX()+", "+c.getY()+")");
        double x = 0.5;
        double y = 0.5;
        
        System.out.println("Is point (" +x+ ", " +y+ ") inside the circle object? " + c.contains(x,y));

        c.setX(0.25);
        c.setY(0.25);
        c.setRadius(-10.0);

        System.out.println("Circle attributes are: radius = " + c.getRadius() + ", center = ("+c.getX()+", "+c.getY()+")");
        System.out.println("Is point (" +x+ ", " +y+ ") inside the circle object? " + c.contains(x,y));
    }
}