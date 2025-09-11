package bricksAndWalls;

import java.util.*;

public class Walls {
    private final int maximumBricksInEachWall = 90;
    private List<Bricks> bricks = new ArrayList<>();

    public boolean getIsWallBrickIsFull() {
        return (bricks.size() > maximumBricksInEachWall);
    }

    public boolean addBricks(Bricks brick) {
        if (!getIsWallBrickIsFull()) {
            bricks.add(brick);
            return true;
        }

        return false;
    }

    public List<Bricks> getBricks() {
        return this.bricks;
    }

    public int getBrickCount() {
        return bricks.size();
    }
}
