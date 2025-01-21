package Question2024;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class OAIRecord {

    private String doi;
    private String title;
    private String subject;
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private String author5;
    private String author6;
    private String author7;
    private String author8;
    private String keyword;
    private String status;

    public OAIRecord(String doi, String title, String subject, String author1, String author2, String author3, String author4, String author5, String author6, String author7, String author8, String keyword, String status) {
        this.doi = doi;
        this.title = title;
        this.subject = subject;
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.author5 = author5;
        this.author6 = author6;
        this.author7 = author7;
        this.author8 = author8;
        this.keyword = keyword;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String[] getAuthors() {
        return new String[]{author1, author2, author3, author4, author5, author6, author7, author8};
    }

    @Override
    public String toString() {
        return String.format("%-20s\"%-20s\"%-20s{%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s}%-20s%-20s", doi, title, subject, author1, author2, author3, author4, author5, author6, author7, author8, keyword, status);
    }
}
public class Report {
    public static void main(String[] args) {
        String inputFile = "oaiset.csv";

        OAIRecord[] data = new OAIRecord[50];
        System.out.println("Loading Dataset...");
        loadRecord(inputFile, data);

        // Printing curated records without headers
        System.out.println("The curated record is as follows:");
        OAIRecord[] curatedRecords = cleanRecord(data);
        printRecord(curatedRecords);

        // Generating and printing the summary report
        System.out.println("\nThe summary report is as follows:");
        reportData(curatedRecords);
    }

    public static void loadRecord(String file, OAIRecord[] data) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int i = 0;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(",");
                data[i] = new OAIRecord(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], info[9], info[10], info[11], info[12]);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.print("\nFile Not Found");
        } catch (IOException e) {
            System.out.print("\nError in reading the file");
        }
    }

    public static OAIRecord[] cleanRecord(OAIRecord[] data) {
        int clear = 0;
        for (OAIRecord record : data) {
            if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
                clear++;
            }
        }

        OAIRecord[] clearData = new OAIRecord[clear];
        int count = 0;
        for (OAIRecord record : data) {
            if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
                clearData[count] = record;
                count++;
            }
        }
        return clearData;
    }

    public static void printRecord(OAIRecord[] cleanRecord) {
        for (OAIRecord record : cleanRecord) {
            System.out.println(record.toString());
        }
    }

    public static void reportData(OAIRecord[] cleanRecord) {
    String[] allAuthors = new String[cleanRecord.length * 8];
    int authorCount = 0;

    for (OAIRecord record : cleanRecord) {
        for (String author : record.getAuthors()) {
            if (author != null && !author.trim().isEmpty() && !author.startsWith("Author")) {
                allAuthors[authorCount] = author.trim();
                authorCount++;
            }
        }
    }

    String[] authors = Arrays.copyOf(allAuthors, authorCount);
    Arrays.sort(authors);

    System.out.println("The summary report is as follows:");
    String previousAuthor = "";
    int count = 0;

    for (String author : authors) {
        if (!author.equals(previousAuthor)) {
            if (!previousAuthor.isEmpty()) {
                System.out.println(previousAuthor + ": " + count);
            }
            previousAuthor = author;
            count = 1;
        } else {
            count++;
        }
    }

    // Print the last author
    if (!previousAuthor.isEmpty()) {
        System.out.println(previousAuthor + ": " + count);
    }
}
}
*/