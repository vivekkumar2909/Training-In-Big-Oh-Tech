// package bricksAndWalls;

import java.util.*;

public class Bricks {

    private String bricksId;
    private String caption;
    private String message;
    private User ownerOfBrick;
    private User dedicateToUser;
    private List<String> commentsOnEachBrick = new ArrayList<>();
    private int flagCount = 0;
    private boolean isVisible = true;

    Bricks(String bricksId, String caption, User owner, User Dedicate) {
        this.bricksId = bricksId;
        this.caption = caption;
        this.ownerOfBrick = owner;
        this.dedicateToUser = Dedicate;
    }

    // Setter;
    void addComment(String comment) {
        commentsOnEachBrick.add(comment);
    }

    // setter to increase count
    void addIncreaseCount() {
        this.flagCount++;
        if (flagCount > 10) {
            isVisible = false;
        }
    }

    // Getter Method
    String getIdOfBrick() {
        return this.bricksId;
    }

    User getOwner() {
        return this.ownerOfBrick;
    }

    boolean getIsVisible() {
        return this.isVisible;
    }

    User getDedicatedToUser() {
        return this.dedicateToUser;
    }

    String getCaption() {
        return this.caption;
    }

    void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMessage() {
        return this.message;
    }

}
