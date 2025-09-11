package bricksAndWalls;

import java.util.*;

public class User {
    // private String UserId;
    private String name;
    // private boolean isAdmin;

    private int receiptName = 0;

    private List<Bricks> ownBrick = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    void incrementReceiptName() {
        receiptName++;
    }

    int getReceiptName() {
        return this.receiptName;
    }

    void addOwnBrick(Bricks brick) {
        ownBrick.add(brick);
    }

    public List<Bricks> getOwnBrick() {
        return this.ownBrick;
    }

    public String getName() {
        return this.name;
    }

}
