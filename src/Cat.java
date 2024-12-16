public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, PetType type, String color) {
        super(name, age, type);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызываем метод родительского класса для вывода общей информации
        System.out.println("Цвет: " + color);
    }
}