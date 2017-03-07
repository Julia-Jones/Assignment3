/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author jonej9442
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating bob and the city
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //creating all the things
        kw.showThingCounts(true);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);

        //moving bob to the first spot
        bob.move();
        //making bob move, pick thing, move , put it down then turn around and go back 10 times
        for (int i = 0; i < 10; i = i + 1) {

            bob.pickThing();
            bob.move();
            bob.putThing();
            bob.turnAround();
            bob.move();
            bob.turnAround();
        }
        //moving bob to his final spot
        bob.move();
    }
}
