public class magicCannon {
    public static int fireMagicCannon(int number) {
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
        
        int returnType = 0;
        switch (type) {
            case "Combined potent blase":
                returnType = 10;
                break;
            case "Electric blase":
                returnType = 5;
                break;
            case "First blast":
                returnType = 3;
                break;
            default:
                returnType = 1;
                break;
        }
        return returnType;
    }

    public static String whichType(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "Combined potent blast";
        } else if (number % 3 == 0) {
            return "Fire blast";
        } else if (number % 5 == 0) {
            return "Electric blast";
        } else {
            return "Normal blast";
        }
    }

    public static String calculateNextShotDamage(int round) {
        if (round % 3 == 0 && round % 5 == 0) {
            return "10";
        } else if (round % 5 == 0) {
            return "5";
        } else if (round % 3 == 0) {
            return "3";
        } else {
            return "1";
        }
    }
}
