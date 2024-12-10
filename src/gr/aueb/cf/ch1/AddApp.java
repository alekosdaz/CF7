package gr.aueb.cf.ch1;

public class AddApp {

    public static void main(String[] args) {


        //Δηλωση και Αρχικοποιηση Μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολες
        result = num1 + num2;

        //Εκτυπωση του αποτελεσματος
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.println("Το αθροισμα των " + num1 + ", " + num2 + " ειναι ισο με: " + result );
        System.out.printf("To a8roisma twn %d, %d einai iso me: %d\n", num1, num2, result);
    }
}
