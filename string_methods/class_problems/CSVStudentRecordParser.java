import java.util.*;

public class CSVStudentRecordParser {

    static void parseStudentRecord(String csvLine) {
        String[] parts = csvLine.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + parts[0] +
                " | Roll No: " + parts[1] +
                " | Dept: " + parts[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV record: ");
        String csvLine = sc.nextLine();

        parseStudentRecord(csvLine);
    }
}
