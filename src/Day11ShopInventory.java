public class Day11ShopInventory {
    private int rope;
    private int torches;
    private int climbingEquipment;
    private int cleanWater;
    private int machette;
    private int canoe;
    private int foodSupplies;

    public Day11ShopInventory(
        int rope,
        int torches,
        int climbingEquipment,
        int cleanWater,
        int machette,
        int canoe,
        int foodSupplies
    ) {
        this.rope = rope;
        this.torches = torches;
        this.climbingEquipment = climbingEquipment;
        this.cleanWater = cleanWater;
        this.machette = machette;
        this.canoe = canoe;
        this.foodSupplies = foodSupplies;
    }

    public int getRope() {
        return rope;
    }
    public int getTorches() {
        return torches;
    }
    public int getClimbingEquipment() {
        return climbingEquipment;
    }
    public int getCleanWater() {
        return cleanWater;
    }
    public int getMachette() {
        return machette;
    }
    public int getCanoe() {
        return canoe;
    }
    public int getFoodSupplies() {
        return foodSupplies;
    }

    public int displayPrice(int choice) {
        switch(choice){
            case 1:
                return getRope();
            case 2:
                return getTorches();
            case 3:
                return getClimbingEquipment();
            case 4:
                return getCleanWater();
            case 5:
                return getMachette();
            case 6:
                return getCanoe();
            case 7:
                return getFoodSupplies();
            default:
                throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }
}
