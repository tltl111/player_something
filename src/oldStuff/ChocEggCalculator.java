package oldStuff;

public class ChocEggCalculator {
    private int eggAmount;

    public ChocEggCalculator(int eggAmount) {
        this.eggAmount = eggAmount;
    }

    public double getEggAmount() {
        return eggAmount;
    }

    public void setEggAmount(int eggAmount) {
        this.eggAmount = eggAmount;
    }

    public int splittingEggsForDuckbear() {
        return eggAmount % 4;
    }

    public int splittingEggsForEachSister() {
        return eggAmount / 4;
    }

}
