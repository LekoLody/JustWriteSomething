import java.util.ArrayList;
import java.util.Random;

public enum Side {
    RADIANT,
    DIRE,
    NEUTRAL;

    private static ArrayList<Player> direPlayers = new ArrayList<>(5);

    private static ArrayList<Player> radiantPlayers = new ArrayList<>(5);

    public static ArrayList<Player> getDirePlayers() {
        return direPlayers;
    }

    public static ArrayList<Player> getRadiantPlayers() {
        return radiantPlayers;
    }

    public static Side getRandomSide() {
        Random random = new Random();
        return values()[random.nextInt(values().length - 1)];
    }

    private static void addPlayerToContainer(Player player){
        if (player.getSide().equals(RADIANT)){
            Side.getRadiantPlayers().add(player);
        }

    }
}