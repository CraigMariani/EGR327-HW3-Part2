/**
 * #set{ $MyName = "Craig Mariani"}
 * #set{ $ThisClass = ".java"}
 * Created by Intelli J Idea.
 * User: $MyName
 * Date: 9/19/2018
 * Time: 2:56 PM
 * Contact: craigdacles.mariani@calbaptist.edu
 * $ThisClass was created for..
 */

public class Triple<A, B, C> {

    //fields
    private A left;
    private B middle;
    private C right;

    //constructor
    public Triple(A left, B middle, C right){

        this.left = left;
        this.middle = middle;
        this.right = right;

        setLeft(left);
        setMiddle(middle);
        setRight(right);

        getLeft();
        getMiddle();
        getRight();
    }

    //getters and setters
    public A getLeft(){return left;}
    public void setLeft(A left){this.left = left;}
    public B getMiddle(){return middle;}
    public void setMiddle(B middle){this.middle = middle;}
    public C getRight() {return right;}
    public void setRight(C right){this.right = right;}

    //public String toString() {return "("+left+", "+middle+", "+right+")";}

    public static void main (String args[]){

    }
}
