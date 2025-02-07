import java.util.HashMap;
import java.util.Map;

public class FindMajorityElementInArray {

    public static void main(String[] args) {

        int[] arr = {3, 3, 2, 3, 2, 2, 3,};

        System.out.println(findMajorityElement(arr));

        System.out.println(findMajorityElementBoyerMooreVotingAlgorithm(arr));
    }

    public static int findMajorityElement(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int n : arr) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        int r = 0;

        int v = arr.length / 2;

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > v) {
                r = e.getKey();
                break;
            }
        }

        return r;
    }

    public static int findMajorityElementBoyerMooreVotingAlgorithm(int[] arr) {

        //Assuming first element is the majority element
        int candidate = arr[0];
        //And count as 1
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            //If the count is 0, current element will become candidate and count will be 1
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                //If the current element is equal to candidate then we need to increase the count
                count++;
            } else {
                //If not (candidate != arr[i) we decrease the count
                count--;
            }
        }

        //Verifying if problem do not guarantee a majority element
        count = 0;
        for (int n : arr) {
            if (n == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }
        return -1;
    }
}
