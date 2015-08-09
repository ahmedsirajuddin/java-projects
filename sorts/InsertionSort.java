import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] args) { // main method must be given an array of strings called args
        int hand[] = new int[] {1, 5, 2, 7, 3, -10, -10, 9, 8, 10, 15, 0, 12, 5, 6, 9, 18, 4, 2};
        sort(hand);
    }
    
    /*
    public static void sort (int[] hand) {
        for (int index = 1; index < hand.length; index++) {
            int key = hand[index];
            int prev = index - 1;
            while (prev >= 0 && hand[prev] > key) {
                hand[prev + 1] = hand[prev];
                prev = prev - 1;
            }
            hand[prev + 1] = key;
        }
        System.out.println(Arrays.toString(hand));
    }
    */

    public static void sort (int[] hand) {
        for (int index = 1; index < hand.length; index++) {
            int key = hand[index];
            int counter = index;
            while ( counter > 0 && (hand[counter - 1] > key) ) {
                hand[counter] = hand[counter - 1];
                counter--;
            } 
            hand[counter] = key;
        }
        System.out.println(Arrays.toString(hand));
    }
}
