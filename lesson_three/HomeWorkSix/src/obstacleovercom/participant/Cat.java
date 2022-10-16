package obstacleovercom.participant;

import obstacleovercom.obstacle.Obstacle;

public class Cat extends Participant {

    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    @Override
    public void run(Obstacle obstacle) {
    }

    @Override
    public void jump(Obstacle obstacle) {
    }
}


