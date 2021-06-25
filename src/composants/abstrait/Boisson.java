package composants.abstrait;

public abstract class Boisson {
    private String description;
    public String getDescription() {
        return description;
    }
    public abstract double cout();
}
