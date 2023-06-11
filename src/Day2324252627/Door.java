package Day2324252627;

public class Door {
    private doorStateEnum doorState;
    private int passCode;

    public Door(doorStateEnum doorState, int passCode) {
        this.doorState = doorState;
        this.passCode = passCode;
    }

    public doorStateEnum getDoorState() {
        return doorState;
    }

    private int getPassCode() {
        return passCode;
    }

    public void setDoorState(doorStateEnum doorState) {
        this.doorState = doorState;
    }

    public void setPassCode(int oldPassCode, int newPassCode) {
        if (oldPassCode == getPassCode()) {
            newPassCode = passCode;
            System.out.println("Passcode changed.");
        } else {
            System.out.println("Old passcode incorrect, didnt change the password.");
        }
    }

    public void openDoor() {
        if (getDoorState() != doorStateEnum.CLOSED) {
            System.out.println("Can't open door.");
        } else {
            System.out.println("Opened the door.");
            setDoorState(doorStateEnum.OPEN);
        }
    }

    public void closeDoor() {
        if (getDoorState() != doorStateEnum.OPEN) {
            System.out.println("Can't close door.");
        } else {
            System.out.println("Closed the door.");
            setDoorState(doorStateEnum.CLOSED);
        }
    }

    public void lockDoor() {
        if (getDoorState() != doorStateEnum.CLOSED) {
            System.out.println("Can't lock door.");
        } else {
            System.out.println("Locked the door.");
            setDoorState(doorStateEnum.LOCKED);
        }
    }

    public void unlockDoor(int passCode) {
        if (getDoorState() != doorStateEnum.LOCKED) {
            System.out.println("Can't unlock door.");
        } else if (getPassCode() != passCode) {
            System.out.println("Wrong passcode can't unlock the door.");
        } else {
            System.out.println("Unlocked the door.");
            setDoorState(doorStateEnum.CLOSED);
        }
    }
}
