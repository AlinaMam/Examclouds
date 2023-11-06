import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 3, 8, 5, 21, 13};

        //сортировка пузырьком
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        //сортировка выбором
        for (int i = 0; i < nums.length; i++) {
            int pos = i;
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    pos = j;
                    min = nums[j];
                }
            }
            nums[pos] = nums[i];
            nums[i] = min;
        }
        System.out.println(Arrays.toString(nums));

    }
}