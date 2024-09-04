public class Main {
    public static void main(String[] args) {
        // Создаем объект ресторана с максимальным количеством заказов 5.
        Restaurant restaurant = new Restaurant(5);
        Order order = new Order(1, "John Doe", DishType.PIZZA, OrderStatus.NEW);

        restaurant.addOrder(order);
        // Создаем два заказа с различными типами блюд и статусом NEW.
        Order order1 = new Order(1, "John Doe", DishType.PIZZA, OrderStatus.NEW);
        Order order2 = new Order(2, "Jane Smith", DishType.SUSHI, OrderStatus.NEW);

        // Добавляем эти заказы в ресторан.
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        //вывод всех типов блюд в ресторане
        restaurant.printAllDishTypes();

        // Изменяем статусы заказов с NEW на COOKING.
        order1.changeStatus(OrderStatus.COOKING);
        order2.changeStatus(OrderStatus.COOKING);

        // Печатаем информацию обо всех заказах.
        restaurant.printOrders();

        // Выводим общее количество заказов.
        System.out.println("Total orders: " + Restaurant.getTotalOrders());

        // Дополнительно изменяем статус первого заказа на READY и затем на DELIVERED.
        order1.changeStatus(OrderStatus.READY);
        order1.changeStatus(OrderStatus.DELIVERED);

        // Повторно выводим информацию обо всех заказах.
        restaurant.printOrders();
    }
}
