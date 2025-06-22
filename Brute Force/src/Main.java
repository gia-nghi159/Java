public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        int[] counts = bruteForce(nums); // Save the returned array
        printArray(counts); // Print the `counts` array
    }

    public static int[] bruteForce(int[] nums) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    counts[i]++;
                }
            }
        }
        return counts;
    }

    public static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Use `print` instead of `println` to avoid new lines
        }
        System.out.println(); // New line after printing the entire array
    }
}
