
/**
 * Lab 17.2 Compact
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 28 November 2016
 */

import chn.util.*;

public class CompactTester
{
     /**
     * Here is the main() method. This will read in values from text file compact.txt
     * and writing it into an array while counting how many values that are being read 
     * in and then it removes the all the zeros from the array and then prints all the 
     * values of the array.
     */
    public static void main(String[] args)
    {
        Compact compact;
        FileInput inFile = new FileInput ("compact.txt");
        int[] numbers = new int[100];
        
        int index = 0;     //keeps track of how many numbers were read in from the file
        int k = 0;
        
        while (inFile.hasMoreTokens())
        {
            numbers[index] = inFile.readInt();
            
            index++;    //counts how many values are being read in
        }
        
        compact = new Compact(index);   //passes the number of values
        
        //prints the original array
        while (k < index)
        {
            System.out.print(numbers[k] + "  ");
            k++;
        }
        compact.remove(numbers, 0);     //removes the zeros from the array
        index = compact.getIndex();     //retrieves the index
        System.out.println();
        k = 0;
        
        //prints the modified array
        while (k < index)
        {
            System.out.print(numbers[k] + "  ");
            k++;
        }
    }
}
