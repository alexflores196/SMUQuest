import java.util.ArrayList;

public class SMUQuest
{
    private int winningAmount;
    private final Die theDie;
    private final Campus theCampus;
    private final ArrayList<Player> players;

    // Constructor
    public SMUQuest()
    {
        theDie = new Die(); // Create a new Die instance
        theCampus = new Campus(); // Create a new Campus instance
        players = new ArrayList<>(); // Initialize players ArrayList
        this.winningAmount = 0; // Initialize winningAmount to 0
    }

    public int getWinningAmount()
    {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount)
    {
        this.winningAmount = winningAmount;
    }

    public void addPlayer(String playerName, int value)
    {
        Player person = new Player(playerName, value, theCampus.getFirstPlace());
        players.add(person);
    }

    public void playGame()
    {
        boolean gameWon = false;

        // Continue looping until a player wins
        while (!gameWon)
        {
            // Iterate over each player for their turn
            for (Player player : players)
            {
                // Each player takes a turn
                player.takeTurn(theCampus, theDie);

                // Check if the player's money is equal to or exceeds the winning amount
                if (player.getMoney() >= getWinningAmount())
                {
                    System.out.println("GAME OVER..." + player.getName() + " is the winner!!");
                    gameWon = true; // Set gameWon to true
                    break; // Break out of the loop
                }
            }
        }
    }
}
