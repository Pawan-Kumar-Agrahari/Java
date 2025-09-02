package encapulation;

public class Test {
    public static void main(String[] args) {
        Library l1=new Library();
        l1.borrowBook();
        l1.borrowBook();
        l1.borrowBook();
        l1.borrowBook();
        l1.borrowBook();
        l1.borrowBook();

        l1.returnBook();
        l1.returnBook();
        l1.returnBook();
        l1.returnBook();
        l1.returnBook();
        l1.returnBook();
    }
}
