public class PremiumMember implements Person
{
    private String firstName;
    private String lastName;
    private int age;
    private Workout currentWorkout;

    public PremiumMember()
    {
        firstName = "PremiumDummy";
        lastName = "Account";
        age = 0;
    }

    public PremiumMember(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        try
        {
            setAge(age);
        }
        catch(CustomException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    private void setAge(int age) throws CustomException {
        if(age < 0)
        {
            throw new CustomException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void introduce()
    {
        System.out.println("Hello " + getFullName() + ", welcome to the gym!");
        System.out.println("Since you are a premium member, you got access to the pool and sauna!");
    }

    public void setCurrentWorkout(Workout workout)
    {
        currentWorkout = workout;
    }

    public Workout getCurrentWorkout()
    {
        return currentWorkout;
    }
}
