package subclass;

public class MyLine {
    public int x;
    public int y;
    public PointStart pointStart;
    public PointEnd pointEnd;

    public MyLine(int xPoinStart, int yPointStart, int xPointEnd, int yPointEnd) {
        this.pointStart = new PointStart(xPoinStart, yPointStart);
        this.pointEnd = new PointEnd(xPointEnd, yPointEnd);
    }

    class PointStart {
        public int x;
        public int y;

        public PointStart(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println("Start point ("+x+", "+y+")");
        }

    }

    class PointEnd {
        public int x;
        public int y;

        public PointEnd(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println("End point ("+x+", "+y+")");

        }

    }
}