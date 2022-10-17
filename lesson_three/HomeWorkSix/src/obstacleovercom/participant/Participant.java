package obstacleovercom.participant;

import obstacleovercom.obstacle.Obstacle;

public class Participant {

    private String name;
    private int maxRun;
    private int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run(Obstacle obstacle) {
        System.out.println("Participant runs");
    }

    public void jump(Obstacle obstacle) {
        System.out.println("Participant jumps");
    }

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
