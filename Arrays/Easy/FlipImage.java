public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0, right = image[i].length - 1;
            while (left <= right) {
                int temp = 1 - image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}