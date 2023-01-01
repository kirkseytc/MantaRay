public class mantaRay {
    
    private static boolean isFile;

    public static void compress(String filePath){
        System.out.println(filePath);
        if(filePath.indexOf(".") > 0){
            isFile = true;
        }
        else{
            isFile = false;
        }
        System.out.println("This path is for a file: " + isFile);
    }

    public static void decompress(String filePath){
        System.out.println(filePath);
        if(filePath.indexOf(".ray") > 0){
            isFile = true;
        }
        else{
            isFile = false;
        }
        System.out.println("This is a '.ray' file: " + isFile);    
    }

}