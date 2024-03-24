package az.edu.turing.module02.miniproject;

public class Man extends Human{
    @Override
    public void greetPet() {
        System.out.println("Hello, dear" + getPet().getNickname() + " I love you" );
    }
    public void beingInStreet(){
        System.out.println("Qaqa, zajqalkan olmaz???");
    }
}
