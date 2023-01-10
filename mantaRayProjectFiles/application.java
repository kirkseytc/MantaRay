import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        boolean contin = true;

        String filePath1;
        String filePath2;
        String name;

        System.out.println("Welcome to the Ray Compression Tool [CLI Edition]\nVer 0.1.1 : The \"Barely Functional\" Update | Tristan Kirksey\n");

        while(contin){

            System.out.print("Would you like to compress a file/folder or decompress a ray archive? ([c]/d): ");
            String choice = scnr.nextLine();

            if(choice.indexOf("d") >= 0 || choice.indexOf("D") >= 0){ // DECOMPRESS
                System.out.print("What is the path of the '.ray' file to be decompressed?: ");
                filePath1 = scnr.nextLine();
                System.out.print("Where do you want the archive to decompress at? : ");
                filePath2 = scnr.nextLine();
                mantaRay.decompress(filePath1, filePath2); 
            }
            else{ // COMPRESS
                System.out.print("What is the file/folder path to be compressed?: ");
                filePath1 = scnr.nextLine();
                System.out.print("Where do you want the '.ray' file to export at?: ");
                filePath2 = scnr.nextLine();
                System.out.print("What would you like to name the archive? (if left blank, it will use the folder/file name): ");
                name = scnr.nextLine();
                mantaRay.compress(filePath1, filePath2, name);
            }

            System.out.print("Do you want to perform another operation?: (y/[n]): ");
            choice = scnr.nextLine();

            if(choice.indexOf("y") >= 0 || choice.indexOf("Y") >= 0){
                contin = true;
            }
            else{
                contin = false;
            }

        }

        System.out.println("\nGood Bye!");

        scnr.close();

    }
}