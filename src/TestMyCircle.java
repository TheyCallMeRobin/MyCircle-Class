import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestMyCircle {

  @Test
  @DisplayName("Should create object with default values.")
  public void testDefaultConstructor()
  {
    MyCircle circle = new MyCircle();
    assertEquals(0., circle.getX());
    assertEquals(0., circle.getY());
    assertEquals(1., circle.getRadius());
  }
  @Test
  @DisplayName("Should be able to create circle with given radius and default (x,y) center values.")
  public void testCenterConstructor()
  {
    MyCircle circle = new MyCircle(10.0);
    assertEquals(0., circle.getX());
    assertEquals(0., circle.getY());
    assertEquals(10., circle.getRadius());
  }
  @Test
  @DisplayName("Should be able to create circle with given (x,y) and default radius values.")
  public void testXYConstructor()
  {
    MyCircle circle = new MyCircle(1.0, -1.0);
    assertEquals(1., circle.getX());
    assertEquals(-1., circle.getY());
    assertEquals(1., circle.getRadius());
  }
  @Test
  @DisplayName("Should be able to create circle with both given (x,y) and radius values.")
  public void testXYCenterConstructor()
  {
    MyCircle circle = new MyCircle(1.0, -1.0, 1.0);
    assertEquals(1., circle.getX());
    assertEquals(-1., circle.getY());
    assertEquals(1., circle.getRadius());
  }
  @Test
  @DisplayName("Should prevent negative/zero radius value.")
  public void testNegativeRadiusConstructor()
  {
    MyCircle circle = new MyCircle(1.0, -1.0, -10.0);
    assertEquals(1., circle.getRadius());
    circle = new MyCircle(0.0);
    assertEquals(1., circle.getRadius());
    circle = new MyCircle(-0.5);
    assertEquals(1., circle.getRadius());
  }
  @Test
  @DisplayName("Should prevent negative/zero radius value in setter.")
  public void testRadiusSetter()
  {
    MyCircle circle = new MyCircle(1.0, -1.0, 10.0);
    assertEquals(10., circle.getRadius());
    circle.setRadius(-10.0);
    circle.setRadius(0.0);
    assertEquals(10., circle.getRadius());
    circle.setRadius(1.0);
    assertEquals(1., circle.getRadius());
  }
  @Test
  @DisplayName("Should be able to set (x,y) to any double number.")
  public void testXYSetters()
  {
    MyCircle circle = new MyCircle();
    assertEquals(0., circle.getX());
    assertEquals(0., circle.getY());
    circle.setX(1.0);
    circle.setY(10.0);
    assertEquals(1., circle.getX());
    assertEquals(10., circle.getY());
    circle.setX(-1.0);
    circle.setY(-10.0);
    assertEquals(-1., circle.getX());
    assertEquals(-10., circle.getY());
    circle.setX(0.);
    circle.setY(0.);
    assertEquals(0., circle.getX());
    assertEquals(0., circle.getY());
  }
  @Test
  @DisplayName("Should return true if given (x,y) is inside the circle, false otherwise.")
  public void testContains()
  {
    MyCircle circle = new MyCircle();
    assertTrue(circle.contains(0.0, 0.0));
    assertTrue(circle.contains(1.0, 0.0));
    assertFalse(circle.contains(1.0, 1.0));
  }
}