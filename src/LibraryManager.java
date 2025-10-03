import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items = new ArrayList<>();

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            System.out.println(((LibraryItem) item).getItemInfo());
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            LibraryItem libItem = (LibraryItem) item;
            if (libItem.itemId.equals(itemId) && item.isAvailable()) {
                item.borrowItem(borrowerName);
                System.out.println("Item borrowed: " + libItem.title);
                return;
            }
        }
        System.out.println("Item not available or not found.");
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            LibraryItem libItem = (LibraryItem) item;
            if (libItem.itemId.equals(itemId) && !item.isAvailable()) {
                item.returnItem();
                System.out.println("Item returned: " + libItem.title);
                return;
            }
        }
        System.out.println("Item not found or already returned.");
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            System.out.println(((LibraryItem) item).getItemInfo());
        }
    }
}
