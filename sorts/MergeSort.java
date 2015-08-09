import java.util.Arrays;

public class MergeSort {
    public static void main (String[] args) {
        int[] hand = new int[] {1, 5, 2, 7, 3, -10, -10, 9, 8};
        sort(hand);
    }

    public static int[] sort (int[] hand) {
        if (hand.length < 2) { // base case for recuresion
            return hand;
        }

       int split = hand.length / 2; 
       int[] hand1 = Arrays.copyOfRange(hand, 0, split);
       int[] hand2 = Arrays.copyOfRange(hand, split, hand.length);
       hand1 = sort(hand1);
       hand2 = sort(hand2);
       return merge(hand1, hand2);
    }

    public static int[] merge (int[] hand, int[] hand2) {
        /* Example: 
         * >>> merge({1, 2, 5, 7}, {3, 4, 6, 8})
         * {1, 2, 3, 4, 5, 6, 7, 8}
         *
         * >>> merge({2, 7, 5, 1}, {6, 4, 8, 3})
         * {2, 6, 4, 7, 5, 8, 3}
         */

        int capacity = hand.length + hand2.length;
        int[] output = new int[capacity];
        int step = 0;
        int index = 0; // index for hand
        int index2 = 0; // index for hand2

        while (index < hand.length  && index2 < hand2.length) {
            if (hand[index] < hand2[index2]) {
                output[step] = hand[index];
                index++;
                step++;
            } else { // hand2 index is smaller than hand1 index
                output[step] = hand2[index2];
                index2++;
                step++;
            }
        } // end while hand and hand2 are not empty

        while (index < hand.length) {
            output[step] = hand[index];
            index++;
            step++;
        }

        while (index2 < hand2.length) {
            output[step] = hand2[index2];
            index2++;
            step++;
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
