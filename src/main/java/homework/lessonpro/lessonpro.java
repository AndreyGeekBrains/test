package homework.lessonpro;

import java.util.Random;

public class lessonpro {

    public static void main(String[] args) {
        Competition competition = createAndPrepareCompetition();
        System.out.println("Старт!");
        competition.startCompetition();
        System.out.println("Финиш:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }
    private static Competition createAndPrepareCompetition() {
        Participant robot = new Robot("Железяка", 100, 1000);
        Participant people = new People("Дмитрий", 10, 5000);
        Participant cat = new Cat("Васька", 3, 500);

        Random random = new Random();
        Wall wall = new Wall(random.nextInt(10));
        Track track = new Track(random.nextInt(1000));
        Competition competition = new Competition("Infinity War");

        competition.setParticipants(people, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }
}