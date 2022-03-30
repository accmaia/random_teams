import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> pools = new ArrayList<>();
        ArrayList<String> poolA = new ArrayList<>();
        poolA.add("André Maia");
        poolA.add("João Faria");
        poolA.add("Hugo");
        poolA.add("Jonas");
        ArrayList<String> poolB = new ArrayList<>();
        poolB.add("André Videira");
        poolB.add("João Basílio");
        poolB.add("Pedro");
        poolB.add("Sílvio");
        ArrayList<String> poolC = new ArrayList<>();
        poolC.add("Ana");
        poolC.add("Amândio");
        poolC.add("Catarina");
        poolC.add("Miguel");

        pools.add(poolA);
        pools.add(poolB);
        pools.add(poolC);

        for (int i = 1; i < 5; i++) {
            System.out.println("\nGroup " + i + ":");

            for (ArrayList<String> pool : pools) {
                int rand = new Random().nextInt(pool.size());
                System.out.println(pool.get(rand));
                pool.remove(rand);
            }
        }
    }
}
