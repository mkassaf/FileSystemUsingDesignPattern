package ps.exalt.training;

import ps.exalt.training.composite.Directory;
import ps.exalt.training.composite.File;

public class Demo {
    public static StringBuffer compositeBuilder = new StringBuffer();
    
    public static void main(String[] args) {
        Directory app = new Directory("APP");
        Directory codes = new Directory("CODES");
        Directory specifications = new Directory("specifications");
        
        CreationFileFactory creationFileFactort = new CreationFileFactory();
        File F1;
        File F2;
        File F3;
        File F4;
//        File F5;
        F1 = creationFileFactort.createFile("ReadMe.txt");
        F2 = creationFileFactort.createFile("txt1.txt");
        F2 = creationFileFactort.createFile("txt2.txt");
        F2 = creationFileFactort.createFile("txt3.txt");
        F2 = creationFileFactort.createFile("txt4.txt");
        F2 = creationFileFactort.createFile("txt5.txt");
        F2 = creationFileFactort.createFile("txt6.txt");
        F3 = creationFileFactort.createFile("xml.xml");
        F4 = creationFileFactort.createFile("json.json");
        //F5 = creationFileFactort.createFile("exe.exe");
        try {
            app.add(F1);
            
            codes.add(F2);
            
            specifications.add(F3);
            app.add(codes);
            codes.add(specifications);
            //codes.add(F5); // make exception
            app.add(F4);
        }
        catch (Exception e ) {
        	e.printStackTrace();
        }


        app.listFiles();
    }
}
