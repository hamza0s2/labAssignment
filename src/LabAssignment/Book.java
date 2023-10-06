package LabAssignment;

public class Book extends LibraryItem
{
    private int pageCount;

    public Book(String title, String author, int year, int pageCount)
    {
        super(title, author, year, LibraryItemType.BOOK);
        this.pageCount = pageCount;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }

}
