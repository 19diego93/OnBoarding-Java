package day_3;

public class Main {
    public static void main(String[] args) {

        Pet pet1=new Pet("Donna",PetType.CAT,6);
        Pet pet2=new Pet("Maia",PetType.DOG,9);
        Pet pet3=new Pet("Hitachi",PetType.FISH,139);


        Person person1 = new Person("Diego", "Vallejo", "37238398", 31, 173, false);
        person1.addPet(pet1);
        person1.addPet(pet2);
        Person person2 = new Person("Pedrito", "Grande", "00000001", 89, 184, true);
        person2.addPet(pet3);


     person1.presentation();
     person2.presentation();

    }
}