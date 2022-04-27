# 1. MyCircle class
In this assignment you will implement a class with attributes (aka data fields) and methods. Follow these guidelines:
1. Name the class `MyCircle`
1. Declare `3` `private` `double` properties named `x`, `y`, and `radius`. The `x` and `y` attributes represent the center of the circle, and the `radius` defines the radius of the same circle object.
1. Implement `3` constructors:
    1. The default constructor creates a circle object center at (`0`,`0`) and has radius `1`.
    1. Overloaded constructor that accepts `1` `double` argument used to define a circle's radius, and default center at (`0`,`0`).
    1. Overloaded constructor that accepts `2` `double` arguments to define the center point coordinates, and sets the radius to the default `1` value.
    1. Overloaded constructor that accepts `3` `double` arguments that initializes the center point coordinates and the radius of the circle object with the given values, the arguments should be in this order: x, y, radius respectively.
1. Implement getter methods for each of the private data fields.
1. Implement setter methods for each of the private data fields. 
1. Implement the `contains(doubnle x, double y)` method. It returns `true` if the given (`x`,`y`) arguments are inside the circle object, `false` otherwise.
1. Make sure that the `radius` property of the circle can never be less than or equal to `0` (zero).
    1. In the constructor(s), make sure that if the given radius value is less than or equal to 0, that it sets radius to the default value instead (`1`).
    1. In the radius setter, make sure the value does NOT change if the given value is `0` or negative.

Boilerplate code:

```java
public class MyCircle {
    /* Attributes/Data fields/Properties */
    // YOUR CODE HERE

    /* Constructor(s) */
    Circle () {
        // YOUR CODE HERE
    }
    Circle (/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    Circle (/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    Circle (/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }

    /* Method(s) */
    // Getters and Setters
    public /* add appropriate return type */ setRadius(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    public /* add appropriate return type */ getRadius(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    public /* add appropriate return type */ setX(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    public /* add appropriate return type */ getX(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    public /* add appropriate return type */ setY(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    public /* add appropriate return type */ getY(/* add expected arguments here if needed */) {
        // YOUR CODE HERE
    }
    // Other helpful methods
    public /* add appropriate return type */ contains(double x, double y) {
        // YOUR CODE HERE
    }
}
```

After implementing the `MyCircle` class, you can create a tester program to test that your class does what it's supposed to. It is not part of the grade, and you can be creative and test various different scenarios in your tester program.

Example tester program:

```java
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
```

Hints:
1. You only need to change the `MyCircle.java` file, use the `Main.java` to test that your class/methods do what they're suppose to do.
1. Print the attributes by calling the getter methods for each attribute.
1. The set methods should protect the attributes; i.e. don't allow the radius of the circle to be netative.
1. To decide if a point is inside a circle, you will need to calculate the distance between the center of the circle, and the given point.
    1. To calculate the distance, use the eucleadean distance formula: https://en.wikipedia.org/wiki/Euclidean_distance
    1. If the distance between the points is less than or equal to the radius of the circle, the point is inside the circle.
    1. If the calculated distance is larger than the radius, the point is outside the circle.

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
