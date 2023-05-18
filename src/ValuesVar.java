public class ValuesVar {
    
    private boolean boolVar;
    private byte byteVar;
    private short shortVar;
    private int intVar;
    private long longVar;
    private float floatVar;
    private double doubleVar;
    private char charVar;

    public ValuesVar(
        boolean boolVar,
        byte byteVar,
        short shortVar,
        int intVar,
        long longVar,
        float floatVar,
        double doubleVar,
        char charVar
        ) {
            this.boolVar = boolVar;
            this.byteVar = byteVar;
            this.shortVar = shortVar;
            this.intVar = intVar;
            this.longVar = longVar;
            this.floatVar = floatVar;
            this.doubleVar = doubleVar;
            this.charVar = charVar;
        }

    public boolean getBoolVar() {
        return boolVar;
    }
    public void setBoolVar(Boolean boolVar) {
        this.boolVar = boolVar;
    }

    public byte getByteVar() {
        return byteVar;
    }
    public void setByteVar(Byte byteVar) {
        this.byteVar = byteVar;
    }

    public short getShortVar() {
        return shortVar;
    }
    public void setShortVar(Short shortVar) {
        this.shortVar = shortVar;
    }

    public int getIntVar() {
        return intVar;
    }
    public void setIntVar(int intVar) {
        this.intVar = intVar;
    }

    public long getLongVar() {
        return longVar;
    }
    public void setLongVar(long longVar) {
        this.longVar = longVar;
    }

    public float getFloatVar() {
        return floatVar;
    }
    public void setFloatVar(float floatVar) {
        this.floatVar = floatVar;
    }

    public double getDoubleVar() {
        return doubleVar;
    }
    public void setDoubleVar(double doubleVar) {
        this.doubleVar = doubleVar;
    }

    public char getCharVar() {
        return charVar;
    }
    public void setCharVar(char charVar) {
        this.charVar = charVar;
    }

    public void listVariabels() {
        System.out.println(boolVar);
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
    }
}
