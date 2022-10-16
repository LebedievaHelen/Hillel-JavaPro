package obstacleovercom.participant;

import obstacleovercom.obstacle.Obstacle;

public abstract class Participant {

    private String name;
    private int maxRun;
    private int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public abstract void run(Obstacle obstacle);

    public abstract void jump(Obstacle obstacle);

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
