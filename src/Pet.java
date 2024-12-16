public class Pet {
    private String name;
    private int age;
    private PetType type;

    // Конструктор для инициализации полей
    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    // Метод для вывода информации о питомце
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Тип: " + type);
    }
}