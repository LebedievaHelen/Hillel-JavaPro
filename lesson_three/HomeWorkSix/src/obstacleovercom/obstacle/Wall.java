package obstacleovercom.obstacle;

import obstacleovercom.participant.Participant;

public class Wall extends Obstacle {

    public Wall(String type, int size) {
        super(type, size);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxJump() >= getSize();
    }
}
