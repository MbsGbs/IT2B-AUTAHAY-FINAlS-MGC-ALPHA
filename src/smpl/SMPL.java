package smpl;

import java.util.Scanner;

public class SMPL {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int action;

        do {
            System.out.println("\nWELCOME TO MEDICAL RECORD APP");
            System.out.println("1. Patient Data");
            System.out.println("2. Health Provider");
            System.out.println("3. Medical Record");
            System.out.println("4. Reports");
            System.out.println("5. Exit");

            // Validate user input
            while (true) {
                System.out.print("Enter action (1-5): ");
                if (scanner.hasNextInt()) {  // Check if the input is an integer
                    action = scanner.nextInt();
                    if (action >= 1 && action <= 5) {  // Validate range
                        break;  // Exit loop if valid input
                    } else {
                        System.out.println("Invalid option. Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input
                }
            }

            // Handle actions
            switch (action) {
                case 1:
                    Patient.patientPanel();
                    break;
                case 2:
                    HealthProvider.healthProviderPanel();
                    break;
                case 3:
                    MedicalRecord.medicalRecordPanel();
                    break;
                case 4:
                    Reports.reportPanel();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        } while (action != 5);

        scanner.close();
    }
}
