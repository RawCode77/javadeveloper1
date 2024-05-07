/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedeiate.oop;

/**
 *
 * @author Utilisateur
 */
public class Main {

    public static void main(String[] args) {

        //Ball ball = new Ball("Blue", "justBall", 12, 45);
        Ball ball = new Ball();
        Ball myBall = new Ball("Black", "AnotherBall");

//        myBall.setName("JoJo");
//        System.out.println(myBall.getName());

        ball.setName("Hello");
        ball.setColor("Red");

        ball.setBounceRate(123);
        ball.setCapacity(3);


        System.out.println(ball.getName() + ", " + ball.getColor() + ", " + ball.getBounceRate() + ", " + ball.getCapacity());


    }

}
