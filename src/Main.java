import java.lang.reflect.Array;
import java.util.ArrayList;

    /*

    1. F
    2. F
    3. F
    4. T
    5. T

    1.B
    2.D
    3.D (its actually C)
    4.B
    5.C

    1. extends
    2. default
    3. Comparator
    4. ArrayList<Long> longInt = new ArrayList<>();
    5. FileWriter (not scanner)

    1.
    2.
    3.
    4.
    5.
     */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-1);
        nums.add(-1);
        nums.add(1);
        nums.add(6);

        System.out.println(countNegative(nums));
    }

    /**
     * modifies the array by mutliplying each element by the factor
     * @param nums the input array
     * @param factor the input factor to multiply with
     */
    public static void multiply(double[] nums, double factor) {
        if (nums == (null)) {
            return;
        }

        for (int i = 0; i < nums.length; i++) { //cant use enhanced for loop because need to modify element
            nums[i] *= factor;
        }
    }

    /**
     * counts the number negative numbers in arraylist
     * @param nums the input arraylist
     * @return the number of negative numbers
     */
    public static int countNegative(ArrayList<Integer> nums) { //if it returns something it isnt void
        if (nums == null) { //if check null should go before the variables
            return 0;
        }

        int count = 0;

        for (int num : nums) {
            if (num < 0) {
                count++;
            }
        }

        return count;
    }


}
