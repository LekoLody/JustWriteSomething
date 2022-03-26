import java.util.ArrayList;

public class Player {

    private Side side;

    public Side getSide() {
        return side;
    }

    private static ArrayList<Player> players = new ArrayList<>(10);

    public Player(Side side) {
        if (players.size() < 10) {
            this.side = side;
            players.add(this);
            assignSideContainer(this);
        } else throw new RuntimeException();
    }

    public Player() {
        if (players.size() < 10) {
            this.side = Side.getRandomSide();
            players.add(this);
            assignSideContainer(this);
        } else throw new RuntimeException();
    }

    private void assignSideContainer(Player player) {
        if (player.getSide().equals(Side.RADIANT) & Side.getRadiantPlayers().size() < 5) {
            Side.getRadiantPlayers().add(player);
        }
        else Side.getDirePlayers().add(player);
        }
    }