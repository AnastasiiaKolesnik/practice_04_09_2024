public class Order {
    // Поля класса Order: идентификатор заказа, имя клиента, тип блюда и статус заказа.
    private int id;
    private String customerName;
    private DishType dishType;
    private OrderStatus status;

    // Конструктор, инициализирующий поля заказа.
    public Order(int id, String customerName, DishType dishType, OrderStatus status) {
        this.id = id;
        this.customerName = customerName;
        this.dishType = dishType;
        this.status = status;
    }

    // Метод для изменения статуса заказа. Проверяет возможность изменения статуса с помощью метода canChangeTo.
    public void changeStatus(OrderStatus newStatus) {

        if (status.canChangeTo(newStatus)) {  // Если изменение возможно
            this.status = newStatus;          // Обновляем статус заказа
            System.out.println("Order " + id + " status changed to " + newStatus);  // Выводим сообщение об изменении
        } else {
            System.out.println("Cannot change status from " + status + " to " + newStatus);  // Сообщаем об ошибке изменения статуса
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", dishType=" + dishType + "time" + dishType.getCookingTime() +
                ", status=" + status +
                '}';
    }
}
