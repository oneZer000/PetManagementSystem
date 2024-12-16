public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, PetType type, String breed) {
        super(name, age, type);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызываем метод родительского класса для вывода общей информации
        System.out.println("Порода: " + breed);
    }
}