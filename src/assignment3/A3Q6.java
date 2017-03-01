/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

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
        Robot bob = new Robot(kw,1,1,Direction.EAST);
        
        //creating the objects 
        kw.showThingCounts(true);
        
        
        
        
        
    }
}
