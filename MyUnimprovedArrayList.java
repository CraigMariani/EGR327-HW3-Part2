import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * #set{ $MyName = "Craig Mariani"}
 * #set{ $ThisClass = ".java"}
 * Created by Intelli J Idea.
 * User: $MyName
 * Date: 9/22/2018
 * Time: 11:35 AM
 * Contact: craigdacles.mariani@calbaptist.edu
 * $ThisClass was created for..
 */
public class MyUnimprovedArrayList<E> {

    //List<E> box = new ArrayList<>();
    private Object[] box;
    private int boxSize =  0;
    public MyUnimprovedArrayList(){
        //this.box = new ArrayList<>(10);
        this.box = new Object[10];

    }

    public E get(int index){
        //getting an index that does not exist
        MyArrayIndexOutOfBounds.CheckRange(index, boxSize);

        for(int i = 0; i < boxSize; i++){
            //for loop loops through array
            if(i == index){
                //when finding the object that you want
                E returnVal = (E) box[i];
                return returnVal;//returns the object
            }
        }
        return null;
    }



    public void add(E obj){
        //box[boxSize++] = obj;
        //every time add increment the size
        box[boxSize++] = obj;//the new increment contains the new object

    }

    public E remove(int index){
        //use a for loop
        //when removing something shift everything right of the removed object left by one

        MyArrayIndexOutOfBounds.CheckRange(index, boxSize);//getting an index that does not exist

        for(int i = 0; i < boxSize; i++){
            if(box[i] == box[index]){
                box[i] = null;
                for(int j = index; j < boxSize; j++){
                    //continue looping through array until all places are shifted left
                    box[j] = box[j++];//current object in selected index equals next index
                }
                return (E) box[i];
            }
        }
        boxSize--;//every time remove need to decrement the size


        return null;
    }

    public void changeSize(){

        box = Arrays.copyOf(box, box.length * 2);
    }

    public int size(){
        return boxSize;
    }


    public static void main (String args[]){
        MyUnimprovedArrayList myU = new MyUnimprovedArrayList();

        Object obj1 = "object";
        myU.add("object");
        myU.get(0);
        myU.changeSize();
        myU.size();
        myU.remove(0);

    }

}
