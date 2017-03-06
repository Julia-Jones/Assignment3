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

       
        int counter = 0;
        
        bob.move();
        
        while(bob.canPickThing()){
            
            if(bob.canPickThing()){
                bob.pickAllThings();
                counter++;
            
        }
        counter = bob.countThingsInBackpack();
        bob.turnLeft();
        
        for(int i =0; i < counter; i++){
         bob.putThing();
         bob.move();
                    
        }
          
        bob.turnAround();
        
        for(int i = 0; i < counter;){
            bob.move();
            counter--;
        }
        
        bob.turnLeft();
        bob.move();
       
     
        }
    }
}
