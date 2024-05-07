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

        BasketBall basketBall = new BasketBall();
        BaseBall baseBall = new BaseBall();

        basketBall.setColor("Blue");
        basketBall.setName("BasketBall");
        basketBall.setIsNBA(true);
        basketBall.setCapacity(4423);

        baseBall.setColor("White");
        baseBall.setName("BaseBall");

        System.out.println("Baketball Desciption:" + "\n" + basketBall.getName() + ", " + basketBall.getColor() + "," + basketBall.isNBA() + "," +  basketBall.getCapacity() +
                "\n" + "BaseBall Description:" + "\n" + baseBall.getName() + ", " + baseBall.getColor());

        basketBall.bounce();


    }

}