public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        int[] nums = {5, 2, 6, 1};
        int[] result = obj.countSmaller(nums);
        int[] bruteForceResult = obj.bruteForce(nums);

        obj.printArray(result);
        obj.printArray(bruteForceResult);

    }
    public int[] bruteForce(int[] nums) {

        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    counts[i]++;
                }

            }
        }
        return counts;
    }
    void merge(int[] nums, int[] indexes, int[] result, int left, int middle, int right) {
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        int[] leftIndexes = new int[sizeLeft];
        int[] rightIndexes = new int[sizeRight];

        for (int i = 0; i < sizeLeft; ++i) {
            leftIndexes[i] = indexes[left + i];
        }
        for (int j = 0; j < sizeRight; ++j) {
            rightIndexes[j] = indexes[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        int rightCount = 0;


        while (i < sizeLeft && j < sizeRight) {
            if (nums[leftIndexes[i]] <= nums[rightIndexes[j]]) {
                result[leftIndexes[i]] += rightCount;
                indexes[k] = leftIndexes[i];
                i++;
            } else {
                rightCount++;
                indexes[k] = rightIndexes[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            result[leftIndexes[i]] += rightCount;
            indexes[k] = leftIndexes[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            indexes[k] = rightIndexes[j];
            j++;
            k++;
        }
    }

    void sort(int[] nums, int[] indexes, int[] result, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(nums, indexes, result, left, middle);
            sort(nums, indexes, result, middle + 1, right);

            merge(nums, indexes, result, left, middle, right);
        }
    }

    public int[] countSmaller(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] indexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        sort(nums, indexes, result, 0, n - 1);

        return result;
    }
    void printArray(int arr[])
    {
        int size = arr.length;
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}