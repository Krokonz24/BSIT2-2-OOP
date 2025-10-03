public abstract class LibraryItem {
    protected String itemId, title, author, borrowerName;
    protected boolean isCheckedOut;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getItemInfo() {
        return String.format("ID: %s | Title: %s | Author: %s | Checked Out: %b", itemId, title, author, isCheckedOut);
    }

    public void checkOut(String borrowerName) {
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.borrowerName = null;
    }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);
}
