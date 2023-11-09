public class FlexibilityWorkout extends BasicWorkout {

    private int stretchesCount;  // An additional attribute specific to flexibility workout, e.g., number of stretches

    // Constructor with no arguments
    public FlexibilityWorkout() {
    }

    // Constructor with name, duration, and stretchesCount arguments
    public FlexibilityWorkout(String name, int duration, int stretchesCount) {
        super(name, duration);
        this.stretchesCount = stretchesCount;
    }

    public int getStretchesCount() {
        return stretchesCount;
    }

    public void setStretchesCount(int stretchesCount) {
        this.stretchesCount = stretchesCount;
    }

    @Override
    public void start() {
        System.out.println("Starting flexibility workout named: " + getName() + ", performing: " + stretchesCount + " stretches");
    }

    @Override
    public void end() {
        System.out.println("Ending flexibility workout named: " + getName());
    }
}
