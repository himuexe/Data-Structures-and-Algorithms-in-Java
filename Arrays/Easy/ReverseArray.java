public class ReverseArray {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}