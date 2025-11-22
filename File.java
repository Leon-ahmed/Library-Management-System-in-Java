import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class File {
    private static final String F_NAME = "books.txt";
    // Saving books info in file
    public static void Savebook(Book book) {  //its Class is Book and book is a variable argument

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(F_NAME, true))) {
            bw.write(book.toFileString());
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }


   // Read all books from file
    public static ArrayList<Book> loadBooks() {
        ArrayList<Book> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(F_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                list.add(Book.fromFileString(line));
            }

        } catch (Exception e) {
            // Ignore if file does not exist
        }

        return list;
    }






    }
 
