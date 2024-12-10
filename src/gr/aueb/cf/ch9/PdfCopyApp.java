package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192];

        try (FileInputStream fis = new FileInputStream("C:/Java/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Java/dummy-out.pdf")) {

             start = System.currentTimeMillis();
             while ((b = fis.read()) != -1) {
                  fos.write(buffer, 0, b);
                  counter++;
             }
             end = System.currentTimeMillis();
             elapsedTime = (end - start) / 1000.0;

            System.out.printf("To arxeio me mege8os %.1fkb (%d bytes) antigrafike epituxws\n",
                    (counter / 1024.0), counter);
            System.out.println("Elapsed time : " + elapsedTime + "seconds");

        } catch (IOException e){
        System.err.println(e.getMessage());
        }
    }
}
