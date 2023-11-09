import java.util.LinkedList;

public class TestProject
{
    public static void main(String[] args) {
        Member member = new Member("Anthony", "Cardi", 25);
        new PremiumMember("Ant", "Cardi", 25);
        new AdvancedWorkout("Advanced Workout", 60, "Barbell");
        Workout wk1 = new BasicWorkout("Basic Workout", 30);
        Workout wk2 = new FlexibilityWorkout("Flexibility Workout 1", 60, 10);
        Workout wk3 = new FlexibilityWorkout("Flexibility Workout 2", 45, 8);
        Workout wk4 = new EnduranceWorkout("Endurance Workout 1", 45, 10);
        Workout wk5 = new EnduranceWorkout("Endurance Workout 2", 60, 15);
        Workout wk6 = new StrengthWorkout("Strength Workout 1", 30, "Weights", 10);
        Workout wk7 = new StrengthWorkout("Strength Workout 2", 45, "Weights", 15);
        Workout wk8 = new HighIntensityWorkout("High Intensity Workout 1", 60, "Other", 20);
        Workout wk9 = new HighIntensityWorkout("High Intensity Workout 2", 45, "Other", 15);
        //new Gym(); //would need input from user
        member.getFullName();
        wk1.getDuration();
        wk1.getName();
        wk1.start();
        wk1.end();

        try {
            member.setAge(30);
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        LinkedList<Workout> workouts = new LinkedList<>();
        workouts.add(wk1);
        workouts.add(wk2);
        workouts.add(wk3);
        workouts.add(wk4);
        workouts.add(wk5);

        workouts.add(2, wk6);

        workouts.remove(wk2); // remove by object

        // Search the LinkedList for an object
        boolean isPresent = workouts.contains(wk6);
        System.out.println("Is wk6 present in the list? " + isPresent);



    }
}
