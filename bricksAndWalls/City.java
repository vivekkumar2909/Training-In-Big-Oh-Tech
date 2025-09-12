// package bricksAndWalls;

import java.util.*;

public class City {
    private String name;
    private List<Walls> wall = new ArrayList<>();

    // @Override
    // public void setName(String name) {
    // this.name = name;
    // System.out.println("Name is set and working on the city " + this.name);
    // }
    City(String name) {
        this.name = name;
    }

    Walls getAvailableWalls() {
        if (wall.isEmpty()) {
            Walls newWall = new Walls(1);
            wall.add(newWall);
            return newWall;
        }
        Walls lastWall = wall.get(wall.size() - 1);

        if (lastWall.getIsWallBrickIsFull()) {
            Walls newWall = new Walls(wall.size() + 1);
            wall.add(newWall);
            return newWall;
        }

        return lastWall;
    }

    public int getTotalWallInCity() {
        return wall.size();
    }

    public String getName() {
        return name;
    }

    public List<Walls> getWalls() {
        return wall;
    }
}
