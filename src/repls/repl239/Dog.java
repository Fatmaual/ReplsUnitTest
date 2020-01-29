package repls.repl239;

public class Dog extends Animal {
    private String breed;
    private int humanYears;
    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    public int getAgeInHumanYears() {
        return humanYears=getAge()<=2?getAge()*11:22+((getAge()-2) * 5);
    }
    @Override
    public String toString(){
        return "Name: "+getName()+"\n" +
                "Breed: "+breed+"\n" +
                "Age in calendar years: "+getAge()+"\n" +
                "Age in human years: "+getAgeInHumanYears();
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public boolean equals(Dog dog){
        return this.getName().equals(dog.getName())&&this.getAge()==dog.getAge()&&this.breed.equals(dog.breed);
    }
}
