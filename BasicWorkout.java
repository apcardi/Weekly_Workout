// BasicWorkout class
public class BasicWorkout extends Workout {

    // Constructor with no arguments
    public BasicWorkout() {
    }

    // Constructor with name and duration arguments
    public BasicWorkout(String name, int duration) {
        super(name, duration);
    }

    @Override
    public void start() {
        System.out.println("Starting basic workout named: " + getName());
    }

    @Override
    public void end() {
        System.out.println("Ending basic workout named: " + getName());
    }

    @Override
    public String details() {
        return "Basic workout named: " + getName();
    }
}
