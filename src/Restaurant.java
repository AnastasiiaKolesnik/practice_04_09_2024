public class Restaurant {
    // Статическое поле для хранения общего количества заказов.
    private static int totalOrders = 0;

    // Поле для хранения массива всех заказов в ресторане.
    private Order[] orders;

    // Поле для отслеживания текущего количества заказов.
    private int currentOrderIndex = 0;

    // Конструктор, который принимает размер массива заказов (максимальное количество заказов).
    public Restaurant(int maxOrders) {
        orders = new Order[maxOrders];  // Инициализация массива заказов заданного размера
    }

    // Метод для добавления нового заказа в массив заказов.
    public void addOrder(Order order) {
        if (currentOrderIndex < orders.length) {  // Проверяем, не превышен ли лимит заказов
            orders[currentOrderIndex] = order;  // Добавляем заказ в массив
            currentOrderIndex++;  // Увеличиваем индекс для следующего заказа
            totalOrders++;  // Увеличиваем счетчик заказов
        } else {
            System.out.println("Cannot add more orders. Maximum capacity reached.");  // Сообщаем, что добавление невозможно
        }
    }

    // Статический метод для получения общего числа заказов.
    public static int getTotalOrders() {
        return totalOrders;
    }

    // Метод для печати всех заказов в ресторане.
    public void printOrders() {
        for (int i = 0; i < currentOrderIndex; i++) {  // Проходим по всем добавленным заказам
            System.out.println(orders[i]);  // Выводим информацию о каждом заказе
        }
    }

    // Метод для вывода всех возможных типов блюд
    public void printAllDishTypes() {
        System.out.println("Available dish types:");
        for (DishType dishType : DishType.values()) {  // Используем values() для вывода всех типов блюд
            System.out.println(dishType + " (Cooking time: " + dishType.getCookingTime() + " mins)");
        }
    }
}
