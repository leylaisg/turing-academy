package az.edu.turing.module02.miniproject;

public class Woman extends Human{
    @Override
    public void greetPet() {
        System.out.println("Hello, dear" + getPet().getNickname() + " I missed you" );
    }
    public void beingInMetro(){
        System.out.println("Bu nedieeeee metroda cekirsiz metroda???");
    }
}
