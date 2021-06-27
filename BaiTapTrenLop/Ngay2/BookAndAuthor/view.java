package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay2.BookAndAuthor;

public class view {
    public static void main(String[] args) {
        Author author = new Author("Nam Cao", "namcaovippro", 'N');
        Book book = new Book("CauVang", author, 1500, 0);
        System.out.println(book);
    }
}
