public abstract class Team {
    private String name;
    private int maxRange;
    private int maxJump;

    public Team(String name, int maxRange, int maxJump) {
        this.maxRange = maxRange;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public abstract void runTreadmill(Treadmill treadmill);
    public abstract void jumpWall(Wall wall);
}