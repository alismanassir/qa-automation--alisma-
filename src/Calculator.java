public class Calculator {

    // 1. Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Reverse a string
    public String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // 4. Find the maximum number in an array
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 5. Parse a CSV line into fields
    public String[] parseCSV(String line) {
        return line.split(",");
    }

    // Main method to test everything
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Reverse: " + calc.reverseString("QA Automation"));

        int[] nums = {3, 9, 5, 12, 7};
        System.out.println("Max number: " + calc.findMax(nums));

        String csv = "Ali,25,Tester,Karachi";
        String[] fields = calc.parseCSV(csv);
        System.out.println("CSV Fields:");
        for (String f : fields) {
            System.out.println(" - " + f);
        }
    }
}
// Day 3 - Testing Git branching and workflow