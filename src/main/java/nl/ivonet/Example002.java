package nl.ivonet;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example002 {

    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            File f = new File("student_records.txt");
            if (!f.exists()) {  // check if the file exists
                f.createNewFile();  // create a new file
            }
            raf = new RandomAccessFile(f, "rw");  // open a file for random access with "r", "rw"

            //Write initial student records to file
            raf.writeInt(72);
            raf.writeBytes(" James                         \n");
            raf.writeInt(56);
            raf.writeBytes(" Mark                          \n");
            raf.writeInt(87);
            raf.writeBytes(" John                          \n");
            raf.writeInt(30);
            raf.writeBytes(" Phillip                       \n");
            raf.writeInt(44);
            raf.writeBytes(" Andrew                        \n");

            //Print records before sorting
            System.out.println();
            System.out.println("Student records before sorting: ");
            for (int i = 0; i < f.length(); i += 36) {
                raf.seek(i);
                System.out.println("" + raf.readInt() + raf.readLine());
            }
        } catch (IOException e) {
            System.out.println("Uh oh, got an IOException error!" + e.getMessage());
        } finally {     // if the file opened okay, make sure we close it
            if (raf != null) {
                try {
                    raf.close();
                }  // close the file
                catch (IOException ioe) {
                }
            }
        }
    }
}