import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderElement {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leader elements are: " + leaders);
    }



    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leader = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // The rightmost element is always a leader
        leaders.add(maxFromRight);

        // Traverse the array from the second last element to the beginning
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse the list since leaders were added from right to left
        Collections.reverse(leaders);

        return leaders;
    }
}
