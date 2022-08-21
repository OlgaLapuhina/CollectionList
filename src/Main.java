import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void showShoppingList(ArrayList<String> shoppingList) {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Добавить товар в список покупок");
            System.out.println("2. Показать список покупок");
            System.out.println("3. Удалить покупку");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("1. Какую покупку хотите добавить? ");
                    String product = scanner.next();
                    shoppingList.add(product);
                    System.out.println("Итого количество в списке покупок: " + shoppingList.size());
                    break;
                case 2:
                    System.out.println("Список покупок: ");
                    showShoppingList(shoppingList);
                    break;
                case 3:
                    System.out.println("Список покупок: ");
                    showShoppingList(shoppingList);
                    System.out.println("Какую хотите удалить? введите номер или название");
                    String productNumberOrName = scanner.next();
                    try {
                        int number = Integer.parseInt(productNumberOrName);
                        System.out.println("Покупка " + shoppingList.get(number - 1) + " удалена, список покупок:");
                        shoppingList.remove(number - 1);
                        showShoppingList(shoppingList);
                    } catch (NumberFormatException e) {
                        String name = productNumberOrName;
                        System.out.println("Покупка " + name + " удалена, список покупок:");
                        shoppingList.remove(name);
                        showShoppingList(shoppingList);
                    }
                default:
                    System.out.println("Такого номера нет в списке!");
            }
        }
    }
}
