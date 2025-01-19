import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Create a new game
        SMUQuest game = new SMUQuest();

        // Prompt for winningAmount and send to the game
        System.out.print("How much is needed to win? $ ");
        int amt = input.nextInt();
        game.setWinningAmount(amt);

        // Prompt for total number of players
        System.out.print("How many players? ");
        int playerCount = input.nextInt();

        // Create Players
        for (int x = 1; x <= playerCount; x++)
        {
            System.out.printf("Player #%d name: ", x);
            String name = input.next();
            game.addPlayer(name, 500);
        }

        // Start the game
        game.playGame();
    }
}
