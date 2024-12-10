package gr.aueb.cf.ch4;

public class SpecialFor {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= i; i++ ){
            System.out.println("Once");
        }

        for (int i = 1, j = 10; i < j; i++, j++){
            System.out.println(i + ", " + j);
        }

        for (;;){
            System.out.println("For Ever");
            count++;
            //if (count == 10) break;
        }
    }
}
