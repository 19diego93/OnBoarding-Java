package day_3;

import java.util.HashSet;
import java.util.Set;

public class Person {
    //atributos
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private Set<Pet> pets = new HashSet<>();

    //construtores
    public Person() {
    }

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    // metodos accesores
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }



    //metodo propio
    @Override
    public String toString() {
        return "Hello my name is " + firstName + " " + lastName +
                ". I'm " + age + " and I'm " + height + " cm tall. " +
                marriedPerson(married) +" "+petsString(pets)+".";
    }
    public void  presentation(){
        System.out.println(this);
    }

    public static String marriedPerson(boolean status) {
        if (status) {
            return "I'm married.";
        } else {
            return "I'm not married.";
        }
    }
    public static String petsString(Set<Pet> mascotas){
        if(0 != mascotas.size()){
            String aux ="";
            for (Pet pet : mascotas){
    aux += " * "+pet.getName()+" it is my "+pet.getType().toString().toLowerCase();
            }
    return "I have pets:"+ aux;
        }else{ return "I don't have pets!";}
    }
    public void addPet(Pet pet){
        pet.setPerson(this);
        this.pets.add(pet);
    }
}
