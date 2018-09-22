/**
 * #set{ $MyName = "Craig Mariani"}
 * #set{ $ThisClass = ".java"}
 * Created by Intelli J Idea.
 * User: $MyName
 * Date: 9/22/2018
 * Time: 3:41 PM
 * Contact: craigdacles.mariani@calbaptist.edu
 * $ThisClass was created for..
 */
public class MyArrayIndexOutOfBounds {
    public static void CheckRange(int index , int boxSize){
        //used to check if there is an index out of bounds exception
        if(index >= boxSize){
            throw new IndexOutOfBoundsException(OutOfBoundsMsg(index, boxSize));
        }
    }

    private static String OutOfBoundsMsg(int index, int boxSize){
        return "The Index is: " + index + ", The Size is: " + boxSize;
    }
}
