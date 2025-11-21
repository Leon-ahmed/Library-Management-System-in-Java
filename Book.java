// Creating Book info Structure

public class Book {
    private int id;
    private String name;
    private String author;
    private int Quantity;



    // Book constructor
    public Book(int id, String name, String author, int Quantity) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.Quantity = Quantity;

    }
// 4 setter method below
    void set_id(int id) {
        this.id = id;
    }

    void set_name(String name) {
        this.name = name;
    }

    void set_author(String author) {
        this.author = author;
    }

    void set_Quantity(int Quantity) {
        this.Quantity = Quantity;
    }

// 4 getter method below

  int get_id(int id) {
       return id;
    }

    String get_name(String name) {
        return name;
    }

    String get_author(String author) {
        return author;
    }

    int get_Quantity(int Quantity) {
        return Quantity;
    }
 

}
