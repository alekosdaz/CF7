//package gr.aueb.cf.exersises.Tzoker;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//
//
//public class ResultReader {
//
//
//
//        public static void main(String[] args) {
//            // URL της ιστοσελίδας που περιέχει τις κληρώσεις του Τζόκερ
//            String url = "https://www.opap.gr/el/lotto/joker/lotto-joker-results"; // Αντικατάστησε με την σωστή URL
//            // Το όνομα του αρχείου στο οποίο θα αποθηκευτούν τα αποτελέσματα
//            String fileName = "joker_results.txt";
//
//            try {
//                // Ανάκτηση της σελίδας με τα αποτελέσματα
//                Document doc = Jsoup.connect(url).get();
//
//                // Άνοιγμα αρχείου για εγγραφή
//                File file = new File(fileName);
//                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); // Εγγραφή στο τέλος του αρχείου
//
//                // Εξαγωγή των κληρώσεων
//                for (Element draw : doc.select(".results")) { // Προσαρμόστε τον CSS selector αν χρειάζεται
//                    String result = draw.text(); // Παίρνουμε το κείμενο της κλήρωσης
//                    System.out.println("Αποτέλεσμα Κλήρωσης: " + result); // Εκτυπώνουμε στην κονσόλα για επιβεβαίωση
//                    writer.write(result);  // Εγγράφουμε το αποτέλεσμα στο αρχείο
//                    writer.newLine();  // Νέα γραμμή στο αρχείο για την επόμενη κλήρωση
//                }
//
//                // Κλείσιμο του αρχείου
//                writer.close();
//                System.out.println("Τα αποτελέσματα αποθηκεύτηκαν στο αρχείο: " + fileName);
//
//            } catch (IOException e) {
//                System.err.println("Σφάλμα κατά την ανάκτηση των δεδομένων ή την αποθήκευση: " + e.getMessage());
//            }
//        }
//
//}
