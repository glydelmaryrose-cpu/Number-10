
/**
 * Write a description of class Number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number10
{
    public static void main(String [] args){
    
        int [] arr = {1,3,4,5,6};
        int index = -1;
        for (int x = 0; x <arr.length; x++){
            if (arr[x] % 2 == 0){
                index = x;
                break;
            }
        }
        if (index != -1){
            System.out.println("First even number at index: " + index);
        } else {
            System.out.println("No even number found.");
        }
    }
}