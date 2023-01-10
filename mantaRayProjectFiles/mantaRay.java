public class mantaRay {
    
    private static boolean isFile;

    // filePath1 --> the path to the file/folder to be archived.
    // filePath2 --> the path to where the .ray archive will be exported. 
    public static void compress(String filePath1, String filePath2, String name){
        if(filePath1.indexOf(".") > 0){
            isFile = true;
        }
        else{
            isFile = false;
        }
        System.out.println("This path is for a file: " + isFile);
    }

    // filePath1 --> the path to the .ray archive.
    // filePath2 --> the path to the folder in which the files will be exported.
    public static void decompress(String filePath1, String filePath2){
        
        if(filePath1.indexOf(".ray") > 0){
            isFile = true;
        }
        else{
            isFile = false;
        }
        System.out.println("This is a '.ray' file: " + isFile);    
    }

}