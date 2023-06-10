package Day2324252627;

public class Point {
    
    private int xCoordinate;
    private int yCoordinate;

    public Point() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public void setXCoordinate(int x) {
        this.xCoordinate = x;
    }

    public void setYCoordinate(int y) {
        this.yCoordinate = y;
    }

    public void setXAndYCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public void printCoordinates() {
        System.out.println("(" + getXCoordinate() + ", " + getYCoordinate() + ")");
    }



}
