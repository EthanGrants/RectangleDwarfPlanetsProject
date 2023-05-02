
/**
 * FigureStrawman.java - Create a set of strawman classes to describe a Rectangle.
 * Author:     Chris Merrill
 * Module:     3
 * Project:    Lab #1
 * Problem Statement: Create a Rectantle class with a constructor, getters, 
setters,
 *     toString, and draw, erase, and center.  For this strawman exercise, each 
method
 *     will be a sub that simply prints a message identifying which method has been
 *     invoked and any instance variables being changed.  Constructor, getters, and
 *     setters all work.  The draw, erase, and center methods just print messages 
and exit.
 *
 * Algorithm / Overall Plan:
 *   1. Objective is to create a set of stub methods only (non-functioning except 
to
 *      update instance variables and print messages on console).
 *   2. Create Rectangle classes:
 *      *  Instance variables will represent the rectangles id, height, width, 'x',
and
 *         'y' coordinate
 *      *  The constructor will print a message showing each instance variable, 
then print
 *         a message saying that the constructor is being run
 *      *  All getters and setters should print a message saying which method is 
being run.
 *          *  Setters should update instance variable and show new value.
 *      *  Will have a center, erase, and draw method that simply output a
 *         message indicating which method has been invoked, but do nothing else.
 *          * center method should call erase, print message, then call draw
 *
 * In main:
 *   1. Create 2 Rectangles ("Uno" and "Dos").
 *   2. Draw both Rectangle objects.
 *   3. Center Rectangle object "Uno".
 *   4. Test the setters for height and width on "Uno".
 *   5. Test the setters for x and y on "Dos".
 *   4, Run the "toString" method for both Rectangles, showing returned String.
 */
public class FigureStrawman {
    public static void main(String [] args) {
        // Create two rectangles.
        System.out.println("** Creating two Rectangle objects **") ;
        Rectangle rectangle1 = new Rectangle("Uno", 25, 13, 4, 12) ;
        Rectangle rectangle2 = new Rectangle("Dos", 7, 17, 29, -11) ;
        // Draw both rectangles
        System.out.println("\n** Drawing both Rectangles **") ;
        rectangle1.draw() ;
        rectangle2.draw() ;
        // Recenter the first Rectangle
        System.out.println("\n** Centering first Rectangle **") ;
        rectangle1.center() ;
        // Testing setters
        System.out.println("\n** Testing setters **") ;
        rectangle1.setHeight(28) ;
        rectangle1.setWidth(16) ;
        rectangle2.setX(15) ;
        rectangle2.setY(-34) ;
        // Finally test the toString method for each Rectangle
        System.out.println("\n** Testing toString() **") ;
        System.out.println("** Returned ** " + rectangle1) ;
        System.out.println("** Returned ** " + rectangle2) ;
    }
}