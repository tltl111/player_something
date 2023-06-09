package Day21;

public class Arrow {
    
    private String arrowHead;
    private String fletching;
    private double length;
    private float cost = 0.0f;

    public Arrow(String arrowHead, String fletching, double length) {
        this.arrowHead = arrowHead;
        if (arrowHead.equals("steel")) {
            cost += 10;
        } else if (arrowHead.equals("wood")) {
            cost += 3;
        } else {
            cost += 5;
        }

        this.fletching = fletching;
        if (fletching.equals("plastic")) {
            cost += 10;
        } else if (fletching.equals("turkeyFeathers")) {
            cost += 5;
        } else {
            cost += 3;
        }

        this.length = length;
        if (length == 60) {
            cost += (60 * 0.05);
        } else {
            cost += (100 * 0.05);
        }
    }

    public float getCost() {
        return cost;
    }

    public String getArrowHead() {
        return arrowHead;
    }

    public String getFletching() {
        return fletching;
    }

    public double getLength() {
        return length;
    }

    public static Arrow createEliteArrow() {
        Arrow eliteArrow = new Arrow("steel", "plastic", 95);
        return eliteArrow;
    }

    public static Arrow createBeginnerArrow() {
        Arrow beginnerArrow = new Arrow("wood", "gooseFeathers", 75);
        return beginnerArrow;
    }

    public static Arrow createMarksmanArrow() {
        Arrow marksmanArrow = new Arrow("steel", "gooseFeathers", 65);
        return marksmanArrow;
    }


}
