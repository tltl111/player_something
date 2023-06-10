package Day2324252627;

public class Color {
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private String color;

    public Color(String color) {
        this.color = color;
        switch (color) {
            case "White":
                setColor(255, 255, 255);
                break;
            case "Black":
                setColor(0, 0, 0);
                break;
            case "Red":
                setColor(255, 0, 0);
                break;
            case "Orange":
                setColor(255, 165, 0);
                break;
            case "Green":
                setColor(0, 128, 0);
                break;
            case "Yellow":
                setColor(255, 255, 0);
                break;
            case "Blue":
                setColor(0, 0, 255);
                break;
            case "Purple":
                setColor(128, 0, 128);
                break;
        }
    }

    public void listCommonColors() {
        System.out.println("White (255, 255, 255)");
        System.out.println("Black (0, 0, 0)");
        System.out.println("Red (255, 0, 0)");
        System.out.println("Orange (255,165, 0)");
        System.out.println("Green (0, 128, 0)");
        System.out.println("Yellow (255, 255, 0)");
        System.out.println("Blue (0, 0, 255)");
        System.out.println("Purple (128, 0, 128)");
    }

    public int getRed() {
        return red;
    }
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }
    public String getColor() {
        return color;
    }

    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void showRGBValues() {
        System.out.println(getColor() + ": (" + getRed() + ", " + getGreen() + ", " + getBlue() + ")");
    }

}
