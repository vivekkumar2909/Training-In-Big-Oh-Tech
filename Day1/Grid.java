public class Grid {
    private boolean enabled;

    public Grid(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void sellPower(String inverterName) {
        if (enabled) {
            System.out.println(inverterName + " : Selling extra energy to grid.");
        } else {
            System.out.println(inverterName + " : GRID feature not available.");
        }
    }
}
