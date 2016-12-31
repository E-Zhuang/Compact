
/**
 * Lab 17.2 Compact
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 28 November 2016
 */

public class Compact
{
    private int myIndex;
    
    /**
     * Constructor for objects of class Compact. Instantiates the index which is the length of the array.
     */
    public Compact(int index)
    {
        myIndex = index;
    }
    
    /**
     * This method removes the value that is passed in search.
     */
    public void remove(int[] numbers, int search)
    {
        int takeOut = search;       //the number that is being removed
        int tally = 0;              //total of how many times takeOut has appeared
        int moving;                 //the number that is being moved ahead
        
        for (int k = 0; k < (myIndex + tally); k++)
        {
            if (numbers[k] == takeOut)  //counts the number that takeOut appears
            {
                tally++;
                myIndex--;
            }
            else                        //moves the values over in the array
            {
                moving = numbers[k];
                numbers[k - tally] = moving;
            }
        }
    }
    
    /**
     * This method retrieves the final index value.
     */
    public int getIndex()
    {
        return myIndex;
    }
    
//     public void makeCompact(int[] numbers)
//     {        
//         for (int k = 0; k < myIndex; k++)
//         {
//             if (numbers[k] == 0)
//             {
//                 moveLeft(numbers, k);
//                 k--;
//             }
//         }
//     }
//     
//     private void moveLeft(int[] numbers, int index)
//     {
//         int moving;
//         int k = index;
//         
//         do
//         {
//             moving = numbers[k + 1];
//             numbers[k] = moving;
//             k++;
//         }
//         while (moving != -1);
//         
//         myIndex--;
//     }
}
