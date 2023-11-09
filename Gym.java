import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gym
{
    private List<Workout> workouts;
    public Gym()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your firstName");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your lastName");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person member = new Member(firstName, lastName, age);

        new Gym(member);

    }

    public Gym(Person person)
    {
        workouts = new ArrayList<>();
        workouts.add(new FlexibilityWorkout("Flexibility Workout 1", 60, 10));
        workouts.add(new FlexibilityWorkout("Flexibility Workout 2", 45, 8));
        workouts.add(new EnduranceWorkout("Endurance Workout 1", 45, 10));
        workouts.add(new EnduranceWorkout("Endurance Workout 2", 60, 15));
        workouts.add(new StrengthWorkout("Strength Workout 1", 30, "Weights", 10));
        workouts.add(new StrengthWorkout("Strength Workout 2", 45, "Weights", 15));
        workouts.add(new HighIntensityWorkout("High Intensity Workout 1", 60, "Other", 20));
        workouts.add(new HighIntensityWorkout("High Intensity Workout 2", 45, "Other", 15));
        Scanner scanner = new Scanner(System.in);
        person.introduce();
        while(true)
        {
            System.out.println("Workouts available:");
            int index = 1;
            for (Workout workout : workouts) {
                System.out.println("\t" + index + ": " + workout.getName());
                index++;
            }
            System.out.println();
            System.out.println("Please enter the index of a workout to see the options or 0 to exit");
            int workoutIndex = scanner.nextInt();
            scanner.nextLine();
            if(workoutIndex == 0)
            {
                break;
            }
            else {
                System.out.println("Please further select an option");
                System.out.println("1. Start the workout");
                System.out.println("2. End the workout");
                System.out.println("3. Display the workout details");
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1 -> {
                        try {

                            if (person.getCurrentWorkout() == null) {
                                Workout workout = workouts.get(workoutIndex - 1);
                                person.setCurrentWorkout(workout);
                                workout.start();
                            }
                            else
                            {
                                throw new CustomException("You are already doing a workout");
                            }
                        }
                        catch (CustomException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        try {
                            if (person.getCurrentWorkout() == null) {
                                throw new CustomException("You are not doing a workout");
                            }
                            else
                            {
                                Workout workout = person.getCurrentWorkout();
                                workout.end();
                                person.setCurrentWorkout(null);
                            }
                        }
                        catch (CustomException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 3 -> {
                        System.out.println(workouts.get(workoutIndex - 1).details());
                    }
                    default -> {
                        System.out.println("Invalid option");
                    }
                }

            }

        }
    }

    public static void main(String[] args)
    {
        new Gym();
    }
}
