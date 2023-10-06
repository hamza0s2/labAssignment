package LabAssignment;

public class Library {
    private LibraryItem[] libraryItems = new LibraryItem[20];
    private static int itemCounter = 0;


    public void addItem(LibraryItem libraryItem) {
        if (itemCounter < libraryItems.length) {
            libraryItems[itemCounter++] = libraryItem;
        } else {
            System.out.println("Library has not enough space.");
        }
    }

    public void borrowItem(LibraryItem libraryItem) {
        libraryItem.setBorrowed(true);
    }

    public void returnItem(LibraryItem libraryItem) {
        libraryItem.setBorrowed(false);
    }


    public void displayAvailableItems() {

        for (LibraryItem item : libraryItems) {
            if (item != null) {
                if (item.getBorrowed() == false) {
                    System.out.println(item);
                }
            }
        }
    }

    public void displayBorrowedItems()
    {
        for (LibraryItem item : libraryItems) {
            if (item != null) {
                if (item.getBorrowed() == true) {
                    System.out.println(item);
                    System.out.println("\n");
                }
            }
        }
    }
}


