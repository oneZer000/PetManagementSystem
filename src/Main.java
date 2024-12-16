public class Main {
    public static void main(String[] args) {
        // Создаем объекты питомцев
        Dog dog = new Dog("Шарик", 5, PetType.DOG, "Сибирский хаски");
        Cat cat = new Cat("Марсик", 3, PetType.CAT, "Рыжий");

        // Создаем ветеринарную клинику
        PetClinic clinic = new PetClinic();

        // Добавляем питомцев в клинику
        clinic.addPet(dog);
        clinic.addPet(cat);

        // Выводим информацию о всех питомцах в клинике
        clinic.displayPets();
    }
}