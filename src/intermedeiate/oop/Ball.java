/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedeiate.oop;

/**
 *
 * Author: Rudy Washington
 * This application consist of Intermediate Java Concept:
 * Object-Oriented Programming
 * Classes and objects
 * Access modifiers and Constructors
 * overloading constructors
 * Inheritance and Overriding
 *
 */
public class Ball {

    public String color;
    private String name;
    private int capacity;
    private int bounceRate;

    public Ball() {
    }

    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {
        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }

    public Ball(String mColor, String mName) {
        color = mColor;
        name = mName;
    }

    public Ball(String mColor, String mName, int mCapacity) {
        color = mColor;
        name = mName;
        capacity = mCapacity;
    }

    public void showColor() {
        System.out.println(color);
    }

    public void showName() {
        System.out.println(name);
    }

    public void bounce() {
        System.out.println("Bouncing...");

    }

    public void deflate() {
        System.out.println("Deflating....");

    }

    public void inflates() {
        System.out.println("Inflating...");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

}
