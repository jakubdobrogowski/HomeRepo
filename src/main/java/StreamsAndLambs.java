import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAndLambs {

    public static void main(String[] args) {

        pierwszaPróba();


        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        kodZeStrony(games);


    }

    private static void kodZeStrony(List<BoardGame> games) {

        Stream<BoardGame> gamesStream = games.stream(); //tworzymy stream

        games.stream()
                .filter(g -> g.getMaxPlayers() > 4)
                .filter(g -> g.getRating() > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.getPrice()) > 0)
                .map(g -> g.getName().toUpperCase())
                .forEach(System.out::println);
    }

    private static void pierwszaPróba() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> listStream = list.stream(); //tak to się robi
        listStream
                .forEach(e -> {
                            e++;
                            System.out.println(e);
                        }
                );
    }
}
