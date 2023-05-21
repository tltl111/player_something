public class Day13MagicCannon {
    public static String displayType(int number) {
        String type = whichType(number);

        String colorCode = "";
        if(type.equals("Fire blast")) {
            colorCode = "\u001B[38;5;208m";
        } else if(type.equals("Electric blast")) {
            colorCode = "\u001B[33m";
        } else if(type.equals("Combined potent blast")) {
            colorCode = "\u001B[31m";
        }

        System.out.println(number + ": " + colorCode + type + "\u001B[0m");
        return "Type";
    }

    public static String whichType(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "Combined potent blast";
        } else if(number % 3 == 0) {
            return "Fire blast";
        } else if(number % 5 == 0) {
            return "Electric blast";
        } else {
            return "Normal blast";
        }
    }
}
