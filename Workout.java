public abstract class Workout {
    private String name; // Name of the workout
    private int duration; // Duration in minutes

    // Constructor with no arguments
    public Workout() {
    }

    // Constructor with name and duration arguments
    public Workout(String name, int duration) {
        this.name = name;
        try
        {
            setDuration(duration);
        }
        catch (CustomException e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Getter and setter methods for the name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for the duration attribute
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) throws CustomException {
        if (duration < 0)
        {
            throw new CustomException("Duration cannot be negative");
        }
        this.duration = duration;
    }

    // Abstract methods for the Workout class
    public abstract void start(); // Start the workout

    public abstract void end(); // End the workout
    public abstract String details();
}
