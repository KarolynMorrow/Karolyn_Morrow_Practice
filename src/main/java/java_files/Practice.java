package java_files;

import java.io.File;

public class Practice {
    public static void main(String[] args) {
        //new File("c:\fileName.txt"); bad practice because c: is Windows specific
        //Write code to be OS independent
        new File(args[0]);
    }
}
