import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words =
            new ArrayList<>(List.of("Car", "Motorbike", "Plane", "Bicycle", "Car", "Plane"));

    public static void main(String[] args) {
        System.out.println("Домашнее задание (Сеты и Мапы)");
        printOddNumbers();
        printUniqueEvenNumbers();
        printUniqueWords();
        printNumberOfDuplicates();
    }

    public static void printOddNumbers() {
        System.out.println("Task1:");
        nums.forEach(n -> {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        });
        System.out.println();
    }

    public static void printUniqueEvenNumbers() {
        System.out.println("Task2:");
        Set<Integer> uniqueNums = new HashSet<>(nums);
        uniqueNums.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
        System.out.println();
    }

    public static void printUniqueWords() {
        System.out.println("Task3:");
        Set<String> uniqueWords = new HashSet<>(words);
        uniqueWords.forEach(System.out::println);
        System.out.println();
    }

    public static void printNumberOfDuplicates() {
        System.out.println("Task3:");
        Map<String, Integer> map = new HashMap<>();
        words.forEach(word -> map.merge(word, 1, Integer::sum));
        int numberOfDuplicates = 0;
        for (int val : map.values()) {
            if (val > 1) {
                numberOfDuplicates += val;
            }
        }
        System.out.println(numberOfDuplicates);
        System.out.println();
    }
}