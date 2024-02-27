package interfaces;

public class Rabbit implements prey {
    @Override
    public void flee(){
        System.out.println("i am fleeing from Lion");
    }
}
