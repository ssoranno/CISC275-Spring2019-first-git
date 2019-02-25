public class Dog extends Animal{
    String name;

    Dog(String name, int numLegs){
        super(numLegs);
        this.name = name;
    }

    public String toString(){
        return name + " " + super.getLegs();
    }
}