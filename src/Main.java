import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pie> pies = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("Добавить пирог? (да/нет)");
            String response = in.nextLine();

            if (response.equalsIgnoreCase("да")) {
                Pie pie = new Pie();
                pies.add(pie);
                System.out.println("Пирог добавлен.");
            } else {
                System.out.println("Добавить продукт? (Сыр/Яблоко/нет)");
                String foodResponse = in.nextLine();

                if (foodResponse.equalsIgnoreCase("Сыр")) {
                    foods.add(new Cheese());
                    System.out.println("Сыр добавлен.");
                } else if (foodResponse.equalsIgnoreCase("Яблоко")) {
                    System.out.println("Введите размер яблока:");
                    String size = in.nextLine();
                    foods.add(new Apple(size));
                    System.out.println("Яблоко добавлено.");
                } else {
                    continueAdding = false;
                }
            }
        }

        // Сортировка пирогов по калорийности
        Collections.sort(pies, new PieComparator());

        // Вывод общей калорийности пирогов
        int totalCalories = pies.stream().mapToInt(Pie::CalculateCalories).sum();
        System.out.println("Общая калорийность пирогов: " + totalCalories);

        // Вывод информации о каждом пироге
        for (Pie pie : pies) {
            System.out.println("Пирог с " + pie.CalculateCalories() + " калориями.");
        }

        // Употребление продуктов
        for (Food food : foods) {
            food.consume();
        }

        System.out.println("Всего хорошего!");
    }
}
