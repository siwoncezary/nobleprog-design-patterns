package solid.d;

public class PostBoxDemo {
    public static void main(String[] args) {
        Book book = new Book();
        boolean valid = PostalBox.BOX_A.isValid(book);
        System.out.println("Czy można wysłać paczką A? " + valid);
        valid = PostalBox.BOX_B.isValid(book);
        System.out.println("Czy można wysłać paczką B? " + valid);
    }
}
