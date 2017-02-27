/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author jonej9442
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //city and robot 1 & 2
        City kw = new City();
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        Robot karel2 = new Robot(kw, 1, 0, Direction.EAST);

        //building things and the walls
        new Wall(kw, 0, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);
        new Thing(kw, 1, 5);

        //creating the first loop so karel2 will move then stop infront of the wall
        for (int i = 0; i < 4; i = i + 1) {
            karel2.move();

        }
        //creating the loop so that karel will move and stop on the first object
        for (int i = 0; i < 2; i = i + 1) {
            karel.move();
        }



    }
}
