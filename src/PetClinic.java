import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    private List<Pet> pets;

    public PetClinic() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        if (pets.contains(pet)) {
            throw new IllegalArgumentException("Питомец уже есть в клинике");
        }
        pets.add(pet);
    }

    public void displayPets() {
        for (Pet pet : pets) {
            pet.displayInfo();
            System.out.println("------------------");
        }
    }
}