public class Player
{
    private String name;
    private int money;
    private Place space;

    public Player(String name, int money, Place space)
    {
        this.name = name;
        this.money = money;
        this.space = space;
    }

    public void takeTurn(Campus campus, Die die)
    {
        // Step 1: Roll the die to get the roll value
        int rollValue = die.roll();

        // Step 2: Update the player's current location
        space = campus.getNextPlace(space, rollValue);

        // Step 3: Update Player's money value
        updateMoney(space.getValue());

        // Step 4: Print the result of the turn

        System.out.println(name + " rolled a " + rollValue + " and stopped at " + space.getName() + " to " + space.getActivity() + " and now has $" + money);
    }

    public void updateMoney(int value)
    {
        money += value;  // Add the value to the player's current money
    }

    @Override
    public String toString()
    {
        return "Name " + this.name + " Money " + money + " Space " + space;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
