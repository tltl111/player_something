import java.util.Random;


public class Day18BossBattle {
    
    int manticoreHealth = 10;
    int cityHealth = 15;
    int manticoreDistance = 0;
    int round = 1;
    int distanceToFire = 0;
    int lowestNumber = 1;
    int highestNumber = 100;

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
                Boolean startNewGame = askForInput.askForNewGame();
                if (startNewGame) {
                    resetGame();
                    gameStart();
                } else {
                    endGame();
                }
            }
        }
    }

    public void setManticoreDistance() {
        while (manticoreDistance < 1 || manticoreDistance > 100){
            int setManticoreDistance = askForInput.numberInput(
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
            distanceToFire = askForInput.numberInput(
            "Enter desired cannon range between " + lowestNumber +
            " and " + highestNumber + ": ");
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
            lowestNumber = fireDistance;
            highestNumber = fireDistance;
            if (manticoreHealth < 1) {
                System.out.println("The Manticore has been destroyed!\n" +
                "The defenders have won!\nThe city is saved!\n\nYOU WON!");
                Boolean startNewGame = askForInput.askForNewGame();
                if (startNewGame) {
                    resetGame();
                    gameStart();
                } else {
                    endGame();
                }
            } else {
                System.out.println("The Manticore has been hit!\n" +
                "Manticore remaining health: " + manticoreHealth);
            }
        } else if (fireDistance < manticoreDistance) {
            lowestNumber = fireDistance;
            System.out.println("That round FELL SHORT of the target.");
        } else {
            highestNumber = fireDistance;
            System.out.println("That round OVERSHOT the target.");
        }
    }
    
    public void resetGame() {
        manticoreHealth = 10;
        cityHealth = 15;
        round = 1;
        distanceToFire = 0;
        lowestNumber = 1;
        highestNumber = 100;
    }

    public void endGame() {
        System.exit(0);
    }
}
