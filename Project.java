// we make a Rent management System 
import java.util.Scanner;


public class Project {
    public static void main(String[] args) {
        // we create a login interface 
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our home");
        System.out.print("Enter Your User: ");
        String username = sc.nextLine();

        System.out.print("Enter Your Password: ");
        String pass = sc.nextLine();

        if (username.equals("mayank") && pass.equals("upes123")) {
            System.out.println("User found");
            System.out.println("Welcome Mayank");

            boolean exit = false;
            while (!exit) {
                // now we set our dashboard 
                System.out.print("Press 1 for rent details || Press 2 for Services || Press 0 to Exit: ");
                int one;
                try {
                    one = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (one) {
                    case 1:
                        // here user can see their rent deposited status information 
                        String[] months = {"jan", "feb", "march", "april", "may", "jun", "july", "august", "sep", "oct", "nov", "dec"};
                        System.out.println("Rent Details");
                        System.out.print("Enter month: ");
                        String choice = sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < months.length; i++) {
                            if (months[i].equalsIgnoreCase(choice)) {
                                System.out.println(choice + " Rent was deposited");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Warning || " + choice + " Rent is not deposited yet");
                        }
                        break;
                    case 2:
                        System.out.println("Welcome to other services");
                        System.out.println("1. Cleaning charge - 100Rs");
                        System.out.println("2. Laundry Cleaning - 30Rs");
                        System.out.println("3. Electricity bill - 10/unit");
                        System.out.print("Enter service number: ");
                        int service;
                        try {
                            service = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            break;
                        } 

                        switch (service) {
                            case 1:
                                System.out.println("Cleaning charge selected. Please pay 100Rs.");
                                break;
                            case 2:
                                System.out.println("Laundry Cleaning selected. Please pay 30Rs.");
                                break;
                            case 3:
                                System.out.print("Enter number of units: ");
                                int units;
                                try {
                                    units = Integer.parseInt(sc.nextLine());
                                    System.out.println("Total Electricity bill: " + (units * 10) + "Rs.");
                                } catch (NumberFormatException e) {
                                    System.out.println("Invalid input for units.");
                                }
                                break;
                            default:
                                System.out.println("Invalid service number.");
                                break;
                        }
                        break;
                    case 0:
                        exit = true;
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        } else {
            System.out.print("Invalid Username or Password");
        }

        sc.close();
    }
}