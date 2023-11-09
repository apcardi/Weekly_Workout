public class EnduranceWorkout extends BasicWorkout {

    private int distance;  // An additional attribute specific to endurance workout, e.g., distance covered in kilometers

    // Constructor with no arguments
    public EnduranceWorkout() {
    }

    // Constructor with name, duration, and distance arguments
    public EnduranceWorkout(String name, int duration, int distance) {
        super(name, duration);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void start() {
        System.out.println("Starting endurance workout named: " + getName() + ", covering distance: " + distance + "km");
    }

    @Override
    public void end() {
        System.out.println("Ending endurance workout named: " + getName());
    }
}
