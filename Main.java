import java.util.Random;

public class Main {
    public static void main(String[] args) {
        testSortedListOperations();
    }

    private static void testSortedListOperations() {
        Random rand = new Random();
        List<Integer> numbers = new SortedList<>();

        System.out.println("INSERT TEST:");
        for (int i = 0; i < 8; i++) {
            int value = rand.nextInt(50);
            numbers.insert(value);
            printListContents(numbers);
        }

        System.out.println("\nSEARCH TEST:");
        for (int i = 0; i < 4; i++) {
            int target = rand.nextInt(50);
            System.out.println(target + ": " + numbers.search(target));
        }

        System.out.println("\nRETRIEVE TEST:");
        for (int i = -1; i <= 10; i++) {
            System.out.println("Index " + i + ": " + numbers.retrieve(i));
        }

        System.out.println("\nREMOVE TEST:");
        for (int i = 0; i < 4; i++) {
            int target = rand.nextInt(50);
            numbers.remove(target);
            printListContents(numbers);
        }
    }

    private static void printListContents(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}