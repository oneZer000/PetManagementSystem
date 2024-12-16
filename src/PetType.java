public enum PetType {
    DOG("Собака"),
    CAT("Кошка"),
    BIRD("Птица"),
    FISH("Рыбка"),
    REPTILE("Рептилия"),
    RODENT("Грызун");

    private final String displayName;

    PetType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}