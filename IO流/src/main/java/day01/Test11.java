package day01;

import java.io.File;

public class Test11 {
    public static void main(String[] args) {
        File file = new File("D:\\mayikt\\day02");
        getAllFile(file);

    }
    public  static void getAllFile(File file){
            File[] files=file.listFiles();
            if (files==null){
            return;
    }for (File f:files){
                if (f.isDirectory()){
                    getAllFile(f);
                }else {
                    System.out.println(file.getAbsolutePath());
                    f.delete();
                }
        }
            file.delete();
    }
}
