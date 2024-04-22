package day_3;

public class Main {
    public static void main(String[] args) {

        Pet pet1=new Pet("Donna",PetType.CAT,6);
        Pet pet2=new Pet("Maia",PetType.DOG,9);


        Person Diego = new Person("Diego", "Vallejo", "37238398", 31, 173, false);
        Diego.addPet(pet1);
        Diego.addPet(pet2);

        System.out.println(Diego);

    }
}