public class BillingSystem {

    // Method to calculate the total cost
    public double calculateTotalCost(double serviceCost, double medicationCost) {
        return serviceCost + medicationCost;
    }

    // Method to validate inputs
    public boolean validateInputs(String serviceCost, String medicationCost) {
        try {
            Double.parseDouble(serviceCost);
            Double.parseDouble(medicationCost);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Example of using BillingSystem class
        BillingSystem billingSystem = new BillingSystem();

        // Example inputs
        String serviceCostInput = "500";
        String medicationCostInput = "300";

        if (billingSystem.validateInputs(serviceCostInput, medicationCostInput)) {
            double serviceCost = Double.parseDouble(serviceCostInput);
            double medicationCost = Double.parseDouble(medicationCostInput);
            double totalCost = billingSystem.calculateTotalCost(serviceCost, medicationCost);
            System.out.printf("Total Cost: PKR %.2f\n", totalCost);
        } else {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
