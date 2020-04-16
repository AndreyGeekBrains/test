package homework.lessonpro;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.println(participant + " пробежал дистанцию " + length);
            return true;
        }
        else {
            System.out.println(participant + " не смог пробежать дистанцию " + length);
            return false;
        }
    }
}
