import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        while (true) {

            /*  Used for design the box shape
            ╔ : Unicode   Alt+201
            ╗ : Unicode   Alt+187
            ╚ : Unicode   Alt+200
            ╝ : Unicode   Alt+188
            ═ : Unicode   Alt+205
            ║ : Unicode   Alt+186
            ╠ : Unicode   Alt+204
            ╣ : Unicode   Alt+185
            ╦ : Unicode   Alt+203
            ╩ : Unicode   Alt+202
            */

            // Clear console===
            System.out.print("\033[H\033[2J");
            System.out.flush();
            // ========

            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                      Library Management System                     ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  Admin Panel:                                                      ║");
            System.out.println("║                                                                    ║");
            System.out.println("║  1. Add Book                        5. Borrow Book                 ║");
            System.out.println("║                                                                    ║");
            System.out.println("║  2. Display All Books               6. Delete Book                 ║");
            System.out.println("║                                                                    ║");
            System.out.println("║  3. Search Book                     7. Exit                        ║");
            System.out.println("║                                                                    ║");
            System.out.println("║  4. Edit Book Information                                          ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine();

        }

    }
}
