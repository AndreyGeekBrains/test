package homework.lessonpro;

public class People implements Participant {

    private final String name;
    private final int runLength;
    private final int jumpHeight;
    

    public People(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        
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
        return "Человек" + " " + name + ", прыжок " + jumpHeight + ", максимальны бег " + runLength;
    }
}
