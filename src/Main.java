public class Main {
    public static void main(String[] args) {
        // Create Library Items
        Book book1 = new Book("B001", "1984", "George Orwell", "1234567890", 328, "Dystopian");
        Book book2 = new Book("B002", "The Hobbit", "J.R.R. Tolkien", "0987654321", 310, "Fantasy");

        Magazine mag1 = new Magazine("M001", "Time", "Various", 101, "October", true);
        Magazine mag2 = new Magazine("M002", "National Geographic", "Various", 202, "September", false);

        DVD dvd1 = new DVD("D001", "Inception", "Christopher Nolan", 148, "PG-13", "Sci-Fi");
        DVD dvd2 = new DVD("D002", "The Godfather", "Francis Ford Coppola", 175, "R", "Crime");


        Student student = new Student("U001", "Alice", "alice@example.com", "S123", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Bob", "bob@example.com", "Physics", "Professor");


        LibraryManager manager = new LibraryManager();


        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);


        System.out.println("All Library Items:");
        manager.displayAllItems();


        manager.borrowItem("B001", student.getName());
        student.addBorrowedItem(book1);

        manager.borrowItem("D001", faculty.getName());
        faculty.addBorrowedItem(dvd1);


        System.out.println("\n Student Borrowed Items:");
        student.displayBorrowedItems();

        System.out.println("\n Faculty Borrowed Items:");
        faculty.displayBorrowedItems();

        manager.returnItem("B001");
        student.removeBorrowedItem(book1);


        System.out.println("\n Available Items:");
        manager.displayAvailableItems();


        System.out.println("\n Late Fees:");
        System.out.println("Book1 Late Fee (3 days): $" + book1.calculateLateFee(3));
        System.out.println("DVD1 Late Fee (2 days): $" + dvd1.calculateLateFee(2));
        System.out.println("Total Late Fees (5 days): $" + manager.calculateTotalLateFees(5));


        System.out.println("\n Borrowing Status:");
        System.out.println(book2.getBorrowingStatus());
        System.out.println(dvd1.getBorrowingStatus()); // overridden
    }
}
