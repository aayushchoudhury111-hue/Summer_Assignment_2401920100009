
interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    KidUsers(int age){
        this.age = age;
    }
    KidUsers(String bookType){
        this.bookType = bookType;
    }
    @Override
    public void registerAccount(){
        if(age<12) System.out.println("You have successfull registered under a Kids Account");
        else System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids")) System.out.println("Book issued Successfully, please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");
    }
}
class AdultUsers implements LibraryUser{
    int age;
    String bookType;
    AdultUsers(int age){
        this.age = age;
    }
    AdultUsers(String bookType){
        this.bookType = bookType;
    }
    public void registerAccount(){
        if(age>12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction")) System.out.println("Book Issued successfully, please return the book within 7 days");
        else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUsers k = new KidUsers(10);
        KidUsers k2 = new KidUsers(18);

        k.registerAccount();
        k2.registerAccount();

        KidUsers k3 = new KidUsers("Kids");
        KidUsers k4 = new KidUsers("Fiction");

        k3.requestBook();
        k4.requestBook();

        AdultUsers a1 = new AdultUsers(5);
        AdultUsers a2 = new AdultUsers(23);

        a1.registerAccount();
        a2.registerAccount();

        AdultUsers a3 = new AdultUsers("Kids");
        AdultUsers a4 = new AdultUsers("Fiction");

        a3.requestBook();
        a4.requestBook();
    }
}
