public class AdvancedPrinter {
    private Printer printer = new Printer();
    private Scanner scanner = new Scanner();

    void print(String txt)
    {
        printer.print(txt);
    }

    void scan(String text) {
        scanner.scan(text);    // Delegation
    }
}
