public class AdvancedWorkout extends Workout {

    private String equipment; // additional attribute specific to AdvancedWorkout

    // Constructor with no arguments
    public AdvancedWorkout() {
    }

    // Constructor with name, duration, and equipment arguments
    public AdvancedWorkout(String name, int duration, String equipment) {
        super(name, duration);
        this.equipment = equipment;
    }

    // Getter and setter for the equipment attribute
    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public void start() {
        System.out.println("Starting advanced workout named: " + getName() + " using equipment: " + equipment);
    }

    @Override
    public void end() {
        System.out.println("Ending advanced workout named: " + getName());
    }

    @Override
    public String details()
    {
        return "Advanced workout named: " + getName() + " using equipment: " + equipment;
    }
}
