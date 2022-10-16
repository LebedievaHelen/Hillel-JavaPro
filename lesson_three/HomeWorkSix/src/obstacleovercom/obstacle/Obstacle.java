package obstacleovercom.obstacle;

import obstacleovercom.participant.Participant;

public abstract class Obstacle {

    private String type;
    private int size;

    public Obstacle(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public abstract boolean overcome(Participant participant);

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
