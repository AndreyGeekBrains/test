package homework.lessonpro;

public class Cat implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Cat(String name, int jumpHeight, int runLength) {
        this.name = name;
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
        return "Кот" + " " + name + ", прыжок " + jumpHeight + ", максимальны бег " + runLength;
    }
}