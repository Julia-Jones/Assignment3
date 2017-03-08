/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating the city and bob the robot
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 2, 2, Direction.SOUTH);

        //building the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //moving bob to the outside walls
        bob.move();

        //to make bob turn and check if he can go through or not
        while (true) {
            if (bob.frontIsClear() == true) {
                bob.turnRight();
                //turn out and leave box
                if (bob.frontIsClear() == true) {
                    bob.move();
                    break;
                }
            } else if (bob.frontIsClear() == false) {
                bob.turnLeft();
                bob.move();
            }



        }
    }
}
