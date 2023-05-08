import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

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

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4

    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

    }

}

