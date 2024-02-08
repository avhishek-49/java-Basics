public class Distance {
    private int feet;
    private double inches;

    // Constructor to initialize feet and inches
    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two Distance objects
    public Distance add(Distance other) {
        int totalFeet = this.feet + other.feet;
        double totalInches = this.inches + other.inches;

        // If total inches exceed 12, convert excess inches to feet
        if (totalInches >= 12) {
            totalFeet += (int) (totalInches / 12);
            totalInches %= 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    // Method to compare two Distance objects
    public int compare(Distance other) {
        // Convert both distances to inches and compare
        double thisTotalInches = this.feet * 12 + this.inches;
        double otherTotalInches = other.feet * 12 + other.inches;

        if (thisTotalInches < otherTotalInches)
            return -1;
        else if (thisTotalInches > otherTotalInches)
            return 1;
        else
            return 0;
    }

    // Method to display the distance
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create two Distance objects
        Distance d1 = new Distance(5, 6.5);
        Distance d2 = new Distance(3, 10.0);

        // Add the distances and display the result
        Distance sum = d1.add(d2);
        System.out.print("Sum of distances: ");
        sum.display();

        // Compare the distances and display the result
        int comparison = d1.compare(d2);
        System.out.println("Comparison result: " + comparison);
    }
}
