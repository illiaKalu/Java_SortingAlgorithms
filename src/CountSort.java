public class CountSort {

    int[] sort(int arr[], int range) {

        char nums[] = new char[range];
        for (int anArr : arr) nums[anArr] += 1;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = 0; j < nums[i]; j++) {
                    arr[c] = i;
                    c++;
                }
            }
        }
        return arr;
    }
}
