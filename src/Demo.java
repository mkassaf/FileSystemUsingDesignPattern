
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
        File F5;
        F1 = creationFileFactort.createFile("ReadMe.txt");
        F2 = creationFileFactort.createFile("txt.txt");
        F3 = creationFileFactort.createFile("xml.xml");
        F4 = creationFileFactort.createFile("json.json");
        F5 = creationFileFactort.createFile("json1.json");
        app.add(F1);
        codes.add(F2);
        specifications.add(F3);
        app.add(codes);
        codes.add(specifications);
        codes.add(F5);
        app.add(F4);

        app.ls();
    }
}
