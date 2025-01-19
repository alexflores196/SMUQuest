import java.util.Random;

public class Die
{
    private int value;
    private final Random rand;

    public Die()
    {
        rand = new Random();
    }

    // Method to simulate rolling the die, returns a random value between 1 and 6
    public int roll()
    {
        value = rand.nextInt(6) + 1;
        return value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Die shows: " + value;
    }
}