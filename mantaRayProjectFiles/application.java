import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        boolean contin = true;

        System.out.println("Welcome to the Ray Compression Tool [CLI Edition]\nVer 0.1 : The \"Barely Functional\" Update | Tristan Kirksey\n");

        while(contin){

            System.out.print("Would you like to compress a file/folder or decompress a ray archive? ([c]/d): ");
            String choice = scnr.nextLine();

            if(choice.indexOf("d") >= 0 || choice.indexOf("D") >= 0){
                System.out.print("What is the path of the '.ray' file to be uncompressed?: ");
                choice = scnr.nextLine();
                mantaRay.decompress(choice); 
            }
            else{
                System.out.print("What is the file/folder path of the file to be compressed?: ");
                choice = scnr.nextLine();
                mantaRay.compress(choice);
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