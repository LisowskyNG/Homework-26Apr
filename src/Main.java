import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
    }
//______________________________________________________________________________________________________________________

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> sortedList = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!sortedList.contains(num)) {
                    sortedList.add(num);
                }
            }
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println();
    }
//______________________________________________________________________________________________________________________

    public static void task3() {
        System.out.println("Задача 3");
        List<String> text = new ArrayList<>(Arrays.asList("Наташа", "Виктор", "Андрей", "Наташа", "Сергей", "Катя",
                 "Елена", "Андрей", "Татьяна", "Сергей"));
        Set<String> newText = new HashSet<>(text);
        System.out.println(newText);
        System.out.println();
    }
//______________________________________________________________________________________________________________________
    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        HashMap<String, Integer> stringToCount = new HashMap<>();
        for (String string : strings) {
            if (!stringToCount.containsKey(string)) {
                stringToCount.put(string, 0);
            }
            stringToCount.put(string, stringToCount.get(string) + 1);
        }
        for (String string : stringToCount.keySet())
        {
            System.out.println(string + " содержится " + stringToCount.get(string) + " раз(а)");
        }

    }
//______________________________________________________________________________________________________________________
}

