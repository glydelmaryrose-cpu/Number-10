
/**
 * Write a description of class Number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number10
{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5};
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { 
                System.out.println("First even number at index " + i);
                break;  
            }
        }
    }
}
