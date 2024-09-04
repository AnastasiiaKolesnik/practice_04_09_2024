public enum OrderStatus {
    // Определение возможных статусов заказа.
    NEW,         // Новый заказ
    COOKING,     // Заказ готовится
    READY,       // Заказ готов
    DELIVERED;   // Заказ доставлен

    // Метод, проверяющий, можно ли изменить текущий статус на новый.
    public boolean canChangeTo(OrderStatus newStatus) {
        // Логика изменения статусов
        return !OrderStatus.DELIVERED.equals(newStatus);

    }
}
