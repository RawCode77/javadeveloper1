/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedeiate.oop;

/**
 *
 * @author Utilisateur
 */
public class BasketBall extends Ball {

    private int capacity;
    private boolean isNBA;

    @Override
    public int getCapacity() {
        return capacity;
    }

   
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isIsNBA() {
        return isNBA;
    }

    public void setIsNBA(boolean isNBA) {
        this.isNBA = isNBA;
    }



    public boolean isNBA() {

        if (isNBA == true) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void bounce() {
        System.out.println("BasketBall Bouncing");
    }

}
