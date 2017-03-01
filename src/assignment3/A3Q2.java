/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //city and robot
        City kw = new City();
        Robot bob = new Robot(kw, 0, 0, Direction.EAST);

        //creating the box for bob to go around
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        //creating the loop so bob can keep go around the box

        int counter = 0;
        while (counter < 8) {

            bob.move();
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            counter = counter + 1;
        }
    }
}
