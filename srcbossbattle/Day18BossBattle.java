import java.util.Random;


public class Day18BossBattle {
    
    int manticoreHealth = 10;
    int cityHealth = 15;
    int manticoreDistance = 0;
    int round = 1;
    int distanceToFire = 0;

    public void gameStart() {
        // setManticoreDistance();
        setManticoreDistanceRandom();
        while (manticoreHealth > 0 && cityHealth > 0) {
            String damageColor = magicCannon.calculateNextShotDamage(round);
            if (damageColor == "10") {
                System.out.println("\nSTATUS: City : " + cityHealth + "/15 Manticore: " +
                manticoreHealth + "/10. The cannon is expected to deal \u001B[31m" +
                magicCannon.calculateNextShotDamage(round) + " damage\u001B[0m this round.");
                fireAtManticore();
            } else if (damageColor == "5") {
                System.out.println("\nSTATUS: City : " + cityHealth + "/15 Manticore: " +
                manticoreHealth + "/10. The cannon is expected to deal \u001B[33m" +
                magicCannon.calculateNextShotDamage(round) + " damage\u001B[0m this round.");
                fireAtManticore();
            } else if (damageColor == "3") {
                System.out.println("\nSTATUS: City : " + cityHealth + "/15 Manticore: " +
                manticoreHealth + "/10. The cannon is expected to deal \u001B[38;5;208m" +
                magicCannon.calculateNextShotDamage(round) + " damage\u001B[0m this round.");
                fireAtManticore();
            } else {
                System.out.println("\nSTATUS: City : " + cityHealth + "/15 Manticore: " +
                manticoreHealth + "/10. The cannon is expected to deal " +
                magicCannon.calculateNextShotDamage(round) + " damage this round.");
                fireAtManticore();
            }
            
            if (cityHealth < 1) {
                System.out.println("The city has been destroyed!\nAll hope is lost!\n\nYOU LOST!");
                break;
            }
        }
    }

    public void setManticoreDistance() {
        while (manticoreDistance < 1 || manticoreDistance > 100){
            int setManticoreDistance = askForNumber.numberInput(
            "Player 1. How far away from the city do you want to station the Manticore? (1-100)");
            System.out.print("\033c");
            manticoreDistance = setManticoreDistance;
        }        
    }
    public void setManticoreDistanceRandom() {
        Random random = new Random();
        manticoreDistance = random.nextInt(100) + 1;
    }

    public void fireAtManticore() {      
        while (distanceToFire < 1 || distanceToFire > 100) {
            distanceToFire = askForNumber.numberInput(
            "Enter desired cannon range between 0-100: ");
        }
        fireResult(distanceToFire);
        distanceToFire = 0;
        round += 1;
        cityHealth -= 1;
    }

    public void fireResult(int fireDistance) {
        if (fireDistance == manticoreDistance) {
            String stringDamage = magicCannon.calculateNextShotDamage(round);
            int damage = Integer.parseInt(stringDamage);
            manticoreHealth -= damage;
            if (manticoreHealth < 1) {
                System.out.println("The Manticore has been destroyed!\n" +
                "The defenders have won!\nThe city is saved!");
            } else {
                System.out.println("The Manticore has been hit!\n" +
                "Manticore remaining health: " + manticoreHealth);
            }
        } else if (fireDistance < manticoreDistance) {
            System.out.println("That round FELL SHORT of the target.");
        } else {
            System.out.println("That round OVERSHOT the target.");
        }
    }
}
