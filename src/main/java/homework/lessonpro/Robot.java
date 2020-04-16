package homework.lessonpro;

public class Robot implements Participant {

    private final String model;
    private final int jumpHeight;
    private final int runLength;

    public Robot(String model, int jumpHeight, int runLength) {
        this.model = model;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int run() {
        return runLength;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    @Override
    public String toString() {
        return "Робот" + " " + model + ", прыжок " + jumpHeight + ", максимальный бег " + runLength;
    }
}