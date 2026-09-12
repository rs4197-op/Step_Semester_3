public class ProductInventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {
        String[] parts = csvLine.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println(
            "Product: " + parts[0] +
            " | SKU: " + parts[1] +
            " | Qty: " + parts[2]
        );
    }

    public static void main(String[] args) {
        String csvLine = "Wireless Mouse,WM-2201,150";

        parseInventoryRecord(csvLine);
    }
}
