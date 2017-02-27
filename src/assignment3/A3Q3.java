package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //robot and City
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //creating the walls 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        //creating things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

           //while bob can move straight, he moves straight
        while (true) {
            while (bob.frontIsClear() == true) {
                bob.pickAllThings();
                bob.move();
            }
            //if bob can pick up the objects, it picks it up
            while (bob.canPickThing()) {
                bob.pickAllThings();
            }
            //makes bob go to the next street 
            while (bob.getAvenue() == 1) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                bob.pickAllThings();
                bob.move();
                
            }            
            //makes him turn around
            while(bob.frontIsClear() == false) {
                bob.turnAround();

            }
            // when bob is done he goes back to his "home"
          if(bob.getAvenue()==4 && bob.getStreet()==3){
          break;
          
        }

    }
        //how he moves back to his "home"
         bob.turnRight();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
        bob.turnAround();
  }
}