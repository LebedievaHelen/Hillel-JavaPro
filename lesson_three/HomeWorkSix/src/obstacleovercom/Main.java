package obstacleovercom;

import obstacleovercom.obstacle.Obstacle;
import obstacleovercom.obstacle.RunningTrack;
import obstacleovercom.obstacle.Wall;
import obstacleovercom.participant.Cat;
import obstacleovercom.participant.Human;
import obstacleovercom.participant.Participant;
import obstacleovercom.participant.Robot;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Human", 1000, 2);
        Cat cat = new Cat("Cat", 300, 5);
        Robot robot = new Robot("Robot", 3000, 15);

        Participant[] participants = {human, cat, robot};

        RunningTrack runningTrack = new RunningTrack("Running Track", 800);
        Wall wall = new Wall("Wall", 7);

        Obstacle[] obstacles = {runningTrack, wall};

        for (int i = 0; i < participants.length; i++) {
            Participant participant = participants[i];
            for (int j = 0; j < obstacles.length; j++) {
                Obstacle obstacle = obstacles[j];
                if (obstacles[j].overcome(participants[i])) {
                    System.out.println("The participant " + participant.getName() +
                            " overcame an obstacle " + obstacle.getType() + " on distance " + obstacle.getSize() + " meters");
                } else {
                    System.out.println("The participant " + participant.getName() +
                            " haven't overcame an obstacle " + obstacle.getType());
                    break;
                }
            }
        }
    }
}
