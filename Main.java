import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Typewriter title animation
        String title = "  L I B R A R Y     M A N A G E M E N T     S Y S T E M    L O A D I N G .. ... ....";
       

        clearConsole();

        for (int i = 0; i < title.length(); i++) {
            System.out.print(title.charAt(i));
            Thread.sleep(60); // typing speed
        }
        System.out.println();
       
        // Thread.sleep(300); // keep title visible for 2 seconds

        // Main menu loop
        while (true) {
            clearConsole();

            // Display menu
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                      L i b r a r y      M a n a g e m e n t      S y s t e m                             ║");
            System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  Admin  Panel:                                                                                           ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║  1. Add Book                                                        5. Borrow Book                       ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║  2. Display All Books                                               6. Delete Book                       ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║  3. Search Book                                                     7. Exit                              ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("║  4. Edit Book Information                                                                                ║");
            System.out.println("║                                                                                                          ║");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("Choose: ");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            // Handle menu choices
            switch (choice) {
                case 1 -> System.out.println("Add Book selected...");
                case 2 -> System.out.println("Display All Books selected...");
                case 3 -> System.out.println("Search Book selected...");
                case 4 -> System.out.println("Edit Book Information selected...");
                case 5 -> System.out.println("Borrow Book selected...");
                case 6 -> System.out.println("Delete Book selected...");
                case 7 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

            System.out.println("\nPress Enter to continue...");
            input.nextLine(); // wait for user to press Enter
        }
    }

    // Clear terminal method
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
