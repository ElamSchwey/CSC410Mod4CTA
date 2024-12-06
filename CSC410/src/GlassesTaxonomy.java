import java.util.Scanner;

public class GlassesTaxonomy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display categories
        System.out.println("Select a category of glasses:");
        System.out.println("1. Prescription Glasses");
        System.out.println("2. Sunglasses");
        System.out.println("3. Safety Glasses");

        int choice = scanner.nextInt();

        // Selecting a category
        switch(choice) {
            case 1: // Prescription Glasses
                System.out.println("You selected Prescription Glasses.");
                displayPrescriptionGlasses(scanner);
                break;
            case 2: // Sunglasses
                System.out.println("You selected Sunglasses.");
                displaySunglasses(scanner);
                break;
            case 3: // Safety Glasses
                System.out.println("You selected Safety Glasses.");
                displaySafetyGlasses(scanner);
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }

    // Method for display PrescriptionGlasses
    public static void displayPrescriptionGlasses(Scanner scanner){
        System.out.println("Select a type of Prescription Glasses:");
        System.out.println("1. Bifocals");
        System.out.println("2. Single Vision");
        System.out.println("3. Progressive Lenses");

        int choice = scanner.nextInt();

        // Selecting and display Prescription Glasses
            switch(choice) {
            case 1:
                System.out.println("You selected Bifocals.");
                displayBifocalsFrame();
                break;
            case 2:
                System.out.println("You selected Single Vision.");
                displaySingleVisionFrame();
                break;
            case 3:
                System.out.println("You selected Progressive lenses.");
                displayProgressiveLensesFrame();
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }

    // Method for displaying BifocalsFrame
    public static void displayBifocalsFrame() {
        System.out.println("N/A");
    }

    // Method for displaying SingleVisionFrame
    public static void displaySingleVisionFrame() {
        System.out.println("N/A");
    }

    // Method for displaying ProgressiveLensesFrame
    public static void displayProgressiveLensesFrame() {
        System.out.println("N/A");
    }

    // Method for display Sunglasses
    public static void displaySunglasses(Scanner scanner) {
        System.out.println("Select a type of Sunglasses:");
        System.out.println("1. Polarized");
        System.out.println("2. Mirrored");
        System.out.println("3. Transition");

        int choice = scanner.nextInt();

            // Selecting and display Sunglasses
            switch(choice) {
            case 1:
                System.out.println("You selected Polarized.");
                displayPolarizedFrame();
                break;
            case 2:
                System.out.println("You selected Mirrored.");
                displayMirroredFrame();
                break;
            case 3:
                System.out.println("You selected Transition.");
                displayTransitionFrame();
                break;
            default:
                System.out.println("Invalid selection.");
            }
    }

    // Method for displaying PolarizedFrame
    public static void displayPolarizedFrame() {
        System.out.println("N/A");
    }

    // Method for displaying MirroredFrame
    public static void displayMirroredFrame() {
        System.out.println("N/A");
    }

    // Method for displaying TransitionFrame
    public static void displayTransitionFrame() {
        System.out.println("N/A");
    }

    // Method for display Safety Glasses
    public static void displaySafetyGlasses(Scanner scanner) {
        System.out.println("Select a type of Safety Glasses:");
        System.out.println("1. Welding Mask");
        System.out.println("2. Impact Resistant");
        System.out.println("3. Chemical Protection");

        int choice = scanner.nextInt();

        // Selecting and display Safety Glasses
        switch(choice) {
            case 1:
                System.out.println("You selected Welding Mask.");
                displayWeldingMaskFrame();
                break;
            case 2:
                System.out.println("You selected Impact Resistant.");
                displayImpactResistantFrame();
                break;
            case 3:
                System.out.println("You selected Chemical Protection.");
                displayChemicalProtectionFrame();
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }

    // Method for displaying WeldingMaskFrame
    public static void displayWeldingMaskFrame() {
        System.out.println("Frame for Welding Mask:");
        System.out.println("Category: Safety Glasses");
        System.out.println("Primary Use: Protect eyes during welding");
        System.out.println("Material: High-impact polycarbonate");
        System.out.println("Features: Adjustable straps, Auto-darkening filter, UV/IR protection");
        System.out.println("Parent Category: Safety Glasses");
        System.out.println("Related Items: Impact, Chemical");
    }

    // Method for displaying ImpactResistantFrame
    public static void displayImpactResistantFrame() {
        System.out.println("N/A");
    }

    // Method for displaying ChemicalProtectionFrame
    public static void displayChemicalProtectionFrame() {
        System.out.println("N/A");
    }
}
