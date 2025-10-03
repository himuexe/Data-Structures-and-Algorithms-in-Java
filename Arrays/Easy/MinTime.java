package Arrays.Easy;

public class MinTime {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int xDiff = (int) Math.abs(points[i][0] - points[i - 1][0]);
            int yDiff = (int) Math.abs(points[i][1] - points[i - 1][1]);
            time += (int) Math.max(xDiff, yDiff);
        }
        return time;
    }
}