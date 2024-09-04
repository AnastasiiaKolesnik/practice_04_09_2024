public enum DishType {
    // Определение типов блюд с соответствующим временем приготовления.
    PIZZA(20),      // Пицца готовится 20 минут
    BURGER(10),     // Бургер готовится 10 минут
    SUSHI(15),      // Суши готовятся 15 минут
    PASTA(12);      // Паста готовится 12 минут

    // Поле для хранения времени приготовления.
    private int cookingTime;

    // Конструктор для перечисления, который принимает время приготовления.
    DishType(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    // Метод, возвращающий время приготовления блюда.
    public int getCookingTime() {
        return cookingTime;
    }
}
