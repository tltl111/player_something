package oldStuff;

public class MainValuesVar {
    public static void main(String[] args) {
        ValuesVar listing = new ValuesVar(
                true,
                (byte) 42,
                (short) 1000,
                21651651,
                561313515151L,
                3.14f,
                2.71828,
                'A');

        listing.listVariabels();

        listing.setBoolVar(false);
        listing.setByteVar((byte) 31);
        listing.setShortVar((short) 1111);
        listing.setIntVar(921431);
        listing.setLongVar(462111131);
        listing.setFloatVar(1.14f);
        listing.setDoubleVar(6.71828);
        listing.setCharVar('B');

        listing.listVariabels();
    }
}
