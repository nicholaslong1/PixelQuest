package pixelQuest;
/*
 *  Gulley
 *  Dec 9th, 2016
 *  Accepts a minimum and maximum value in an accessor to return a number within those parameters
 * 
 * sample code:
 * random rand = new random();
 * System.out.println(rand.next(-10,10)); //prints "-2" as an example
 * System.out.println(rand.next(10,-10)); //prints an IllegalArgumentException
 */

/**
 *
 * @author Peach-Raspberry
 */
public class random {
    
    public int next(int min,int max){ //accepts bounds of a random number to exist within
        int holding;
        if(min>max){ //ensuring that minimum and maximum values are not confused
            throw new IllegalArgumentException(); 
        }
        return (int)(Math.random() * (max - min) + min); //returns integer within bounds of inclusive minimum up to and including maximum
    }
    
    
}
