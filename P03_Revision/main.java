package P03_Revision;
// packages are containers for classes, a way to organise classes
// optional if not using folders

public class main {
    private String title;
    private int yearPublished;
    private double cost;
    private String isbn;
    private boolean isRef;
    // usually double for decimal values
    // protected: child classes can access
    // super() calls 1st lvl parent class

    public books() {
        title = "NA";
        yearPublished = -1;
        cost = 0;
        isbn = "NA";
        isRef = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
