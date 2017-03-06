/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author jonej9442
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating bob and kw
        City kw = new City();
        RobotSE bob = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //creating the objects 
        kw.showThingCounts(true);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        // bob moves onto first pile
        int counter = 0;
        bob.move();
        // if bob can pick thing he picks all things
        while (bob.canPickThing()) {

            if (bob.canPickThing()) {
                bob.pickAllThings();
                counter++;
                //turn left 
            }
            counter = bob.countThingsInBackpack();
            bob.turnLeft();
            //when you put thing then move one space
            for (int i = 0; i < counter; i++) {
                bob.putThing();
                bob.move();

            }
            //turn around and go back
            bob.turnAround();

            for (int i = 0; i < counter;) {
                bob.move();
                counter--;
            }

            bob.turnLeft();
            bob.move();


        }
    }
}
