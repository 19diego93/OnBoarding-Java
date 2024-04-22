package day_2;

public class Person {
    //atributos
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private String[] petsNames;

    //construtores
    public Person() {
    }

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
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

    public String[] getPetsNames() {
        return petsNames;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }

    //metodo propio
    @Override
    public String toString() {
        return "Persona{" +
                "Hello my name is " + firstName + " " + lastName +
                ". I'm " + age + " and I'm " + height + " cm tall. " +
                marriedPerson(married) +" " +petsString(petsNames);
    }

    static String marriedPerson(boolean status) {
        if (status) {
            return "I'm married.";
        } else {
            return "I'm not married.";
        }
    }
    static String petsString(String[] pets){
        if(pets.length != 0){
            String aux ="";
            for (int i = 0; i< pets.length; i++){
    aux += " * "+pets[i];
            }
    return "I have pets:"+ aux;
        }else{ return "I don't have pets!";}
    }

}
