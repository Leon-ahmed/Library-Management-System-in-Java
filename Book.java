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
    public void set_id(int id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_author(String author) {
        this.author = author;
    }

    public void set_Quantity(int Quantity) {
        this.Quantity = Quantity;
    }

// 4 getter method below

  public int get_id( ) {
       return id;
    }

   public String get_name( ) {
        return name;
    }

    public String get_author( ) {
        return author;
    }

    public int get_Quantity( ) {
        return Quantity;
    }
 
   public String toFileString() {
        return id + "," + name + "," + author + "," + Quantity;
    }

      public static Book fromFileString(String line) {
        String[] data = line.split(",");
        return new Book(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                Integer.parseInt(data[3])
        );
    }
}
