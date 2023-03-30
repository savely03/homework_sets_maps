import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание (Сеты и Мапы)");
        final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        final List<String> words = new ArrayList<>(List.of("Car", "Motorbike", "Plane", "Bicycle", "Car", "Plane"));
        printOddNumbers(nums);
        printUniqueEvenNumbers(nums);
        printUniqueWords(words);
        printNumberOfDuplicates(words);
    }

    public static void printOddNumbers(List<Integer> nums) {
        System.out.println("Task1:");
        Collections.sort(nums);
        nums.forEach(n -> {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        });
        System.out.println();
    }

    public static void printUniqueEvenNumbers(List<Integer> nums) {
        System.out.println("Task2:");
        Set<Integer> uniqueNums = new HashSet<>(nums);
        uniqueNums.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
        System.out.println();
    }

    public static void printUniqueWords(List<String> words) {
        System.out.println("Task3:");
        Set<String> uniqueWords = new HashSet<>(words);
        uniqueWords.forEach(System.out::println);
        System.out.println();
    }

    public static void printNumberOfDuplicates(List<String> words) {
        System.out.println("Task3:");
        Map<String, Integer> map = new HashMap<>();
        words.forEach(word -> map.merge(word, 1, Integer::sum));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}