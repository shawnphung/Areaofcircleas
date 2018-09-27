/*
 * Shawn Phung
 * September 18, 2018
 * Calculating Area of a Circle
 */

package circlearea;

/**
 *
 * @author shphu0697
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double radius = 15.0;
       double pi = 3.14;
       double area = 0.0;
       //algorithm for area calc
       area = pi * radius * radius;
       System.out.println("the area..." + area + "cm squared");
    }
    
}
