package LabAssignment;

public class Magazine extends LibraryItem
{
    private int issueNumber;


    public Magazine(String title, String author, int year, int issueNumber)
    {
        super(title, author, year, LibraryItemType.MAGAZINE);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber()
    {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber)
    {
        this.issueNumber = issueNumber;
    }

}
