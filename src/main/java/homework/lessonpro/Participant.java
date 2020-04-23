package homework.lessonpro;

public interface Participant {

    int run();

    int jump();

    default boolean doAction(Obstacle obstacle) {
        return obstacle.passObstacleBy(this);
    };
}