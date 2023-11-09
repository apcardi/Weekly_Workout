public class HighIntensityWorkout extends AdvancedWorkout {

    private int intervalCount;  // An additional attribute specific to high-intensity workouts, e.g., number of high-intensity intervals

    // Constructor with no arguments
    public HighIntensityWorkout() {
    }

    // Constructor with name, duration, equipment, and intervalCount arguments
    public HighIntensityWorkout(String name, int duration, String equipment, int intervalCount) {
        super(name, duration, equipment);
        this.intervalCount = intervalCount;
    }

    public int getIntervalCount() {
        return intervalCount;
    }

    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    @Override
    public void start() {
        System.out.println("Starting high-intensity workout named: " + getName() + ", with: " + intervalCount + " intervals using equipment: " + getEquipment());
    }

    @Override
    public void end() {
        System.out.println("Ending high-intensity workout named: " + getName());
    }
}
