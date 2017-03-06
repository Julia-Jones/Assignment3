/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Robot;

/**
 *
 * @author jonej9442
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE bob = new RobotSE(kw,3,3,Direction.SOUTH);
        
        //creating first box
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        
        //creating second box
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,5,Direction.EAST);
        new Wall(kw,2,5,Direction.EAST);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        
        //creating third box
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,5,1,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,4,2,Direction.EAST);
        new Wall(kw,5,2,Direction.EAST);
        new Wall(kw,5,1,Direction.SOUTH);
        new Wall(kw,5,2,Direction.SOUTH);
        
        //creating fourth box
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,5,4,Direction.WEST);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,5,5,Direction.EAST);
        new Wall(kw,5,4,Direction.SOUTH);
        new Wall(kw,5,5,Direction.SOUTH);
        
        //making bob go around the first box\
        for(int loop=0; loop < 4; loop= loop +1 ){
        int count = 0;
        
        while(count < 4){
        bob.move();
        bob.move();
        bob.move();
       // bob.turnLeft();
        
        if (count < 3){
        bob.turnLeft();
        }
        count = count +1;
        }
        }
        
        
        
    }
  }

