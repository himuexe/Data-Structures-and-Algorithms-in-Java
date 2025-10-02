public class Clock {
    public double angleClock(int hour, int minutes) {
        double minuteAngle = minutes * 6;
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
        double diff = Math.abs(minuteAngle - hourAngle);
        return Math.min(diff, 360 - diff);
    }
}