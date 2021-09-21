public class StopWatch {
    double startTime;
    double endTime;

    public StopWatch () {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
