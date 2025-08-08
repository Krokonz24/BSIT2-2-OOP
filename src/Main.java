public class Main {
    public static void main(String[] args) {
        book book1 = new book("The Krokonz", "Ralph Teodora", 80);
        book book2 = new book("Dooms Day", "SHOTE CAPINPUYAN", 60);
        book book3 = new book("Bigay Mo Sakin Saber LVL 4 Story", "Rain Bacabis", 100);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}