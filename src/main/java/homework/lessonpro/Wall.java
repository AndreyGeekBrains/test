package homework.lessonpro;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.println(participant + " перепрыгнул стену " + height);
            return true;
        }
        else {
            System.out.println(participant + " не смог перепрыгнуть стену " + height);
            return false;
        }
    }
}