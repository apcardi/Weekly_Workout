public class StrengthWorkout extends AdvancedWorkout {

    private int weightLifted;  // An additional attribute specific to strength workout, e.g., weight lifted in kilograms

    // Constructor with no arguments
    public StrengthWorkout() {
    }

    // Constructor with name, duration, equipment, and weightLifted arguments
    public StrengthWorkout(String name, int duration, String equipment, int weightLifted) {
        super(name, duration, equipment);
        this.weightLifted = weightLifted;
    }

    public int getWeightLifted() {
        return weightLifted;
    }

    public void setWeightLifted(int weightLifted) {
        this.weightLifted = weightLifted;
    }

    @Override
    public void start() {
        System.out.println("Starting strength workout named: " + getName() + ", lifting: " + weightLifted + "kg using equipment: " + getEquipment());
    }

    @Override
    public void end() {
        System.out.println("Ending strength workout named: " + getName());
    }
}
