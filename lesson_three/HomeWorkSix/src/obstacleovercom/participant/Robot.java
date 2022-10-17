package obstacleovercom.participant;

import obstacleovercom.obstacle.Obstacle;

public class Robot extends Participant {

    public Robot(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void run(Obstacle obstacle) {
        super.run(obstacle);
    }

    @Override
    public void jump(Obstacle obstacle) {
        super.jump(obstacle);
    }
}
