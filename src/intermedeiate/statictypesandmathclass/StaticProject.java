/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedeiate.statictypesandmathclass;

/**
 * Author: Rudy Washington
 *
 * Description:
 * This application demonstrates the use of static methods and instance variables.
 * Specifically, it explores the following concepts:
 * - The Math class, which provides static utility methods (no instantiation required).
 * - Calling instance variables and methods within a class.
 * - Understanding that many Math class methods do not depend on instance variables.
 * - Considerations for when and where to use static methods.
 */
public class StaticProject {

    private static String name;

    public static void main(String[] args) {
        // Set the name using the setName method
        setName("John Doe");

        // Print the value of the 'name' variable
        System.out.println("Name: " + getName());

        // Example usage of Math class methods
        int myValue = -45;
        int secondValue = 56;
        int x = Math.min(myValue, secondValue);
        int y = Math.abs(myValue);

        System.out.println("X Minimum: " + x + ", Y Absolute: " + y);
    }

    public static void setName(String n) {
        name = n;
    }

    public static String getName() {
        return name;
    }
}