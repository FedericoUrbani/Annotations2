
public class Greetings {

    @DevAnnotation(DevName = "John",DevSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Say welcome");
    }
    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }

    public static void main(String[] args) {
        Greetings a= new Greetings();
        a.sayWelcome();
        a.sayGoodbye();
    }

}
