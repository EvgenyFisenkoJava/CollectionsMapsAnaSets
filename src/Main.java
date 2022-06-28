import java.util.*;


public class Main {


    public static void main(String[] args) {
        // write your code here
        System.out.println("задание 1");

        List<Integer> numsOdd = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : numsOdd) {
            if (num % 2 != 0) {

                System.out.print(num);
            }
        }

        System.out.println();
        System.out.println("задание 2");

        List<Integer> numsEven = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new LinkedHashSet<>(numsEven);
        numsEven = new ArrayList<>(set);

        System.out.print(numsEven);

        System.out.println();
        System.out.println("задание 3");

        List<String> words = new ArrayList<>(List.of("java", "python", "c##", "java", "javascript", "kotlin", "c##"));
        Set<String> uniqueWords = new LinkedHashSet<>(words);

        System.out.print(uniqueWords);

        System.out.println();
        System.out.println("задание 4");

        List<String> repeatedWords = new ArrayList<>(List.of("java", "python", "c##", "java", "javascript", "kotlin", "c##"));
        Map<String, Integer> count = new HashMap<String, Integer>();
        for (int i = 0; i < repeatedWords.size(); i++) {
            String a = repeatedWords.get(i);
            if (!count.containsKey(a)) {
                count.put(a, 1);
            } else {
                count.put(a, count.get(a) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            int value = entry.getValue();
            if (value > 1)
                System.out.println(value);
        }
    }
}