import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return "This is first class compartment";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "This is Ladies compartment";
    }
}
class General extends Compartment{
    public String notice(){
        return "This is General compartment";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "This is Luggage compartment";
    }
}
public class TestCompatment {
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];
        Random r = new Random();
        for(int i = 0; i<10; i++){
            int num = r.nextInt(4) + 1;
            if(num==1) arr[i] = new FirstClass();
            else if(num==2) arr[i] = new Ladies();
            else if(num==3) arr[i] = new General();
            else arr[i] = new Luggage();
        }
        for(int i = 0; i<10; i++){
            System.out.println(arr[i].notice());
        }
    }
}
