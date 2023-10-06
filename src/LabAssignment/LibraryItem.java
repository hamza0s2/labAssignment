package LabAssignment;

import java.util.Objects;

public class LibraryItem
{
    private String title;
    private String author;
    private int year;
    private Boolean isBorrowed;
    private LibraryItemType itemType;


    public LibraryItem(String title, String author, int year, LibraryItemType itemType)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
        this.itemType = itemType;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public Boolean getBorrowed()
    {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed)
    {
        this.isBorrowed = borrowed;
    }

    public LibraryItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType)
    {
        this.itemType = itemType;
    }

    @Override
    public boolean equals(Object o) {
        LibraryItem libraryItem = (LibraryItem) o;
        if (o == null) {
            return false;
        }
        if ((libraryItem.getTitle().equals(this.title)) &&
                (libraryItem.getItemType().equals(this.itemType)) && libraryItem.getAuthor().equals(this.author)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "title=" + title + ", author=" + author + ", Year=" + year + ", isBorrowed=" + isBorrowed + ", itemType=" + itemType;
    }

}
