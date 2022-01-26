import java.util.ArrayList;


// Directory implements the "lowest common denominator"
class Directory implements AbstractFile {
    private String name;
    private ArrayList<Object> includedFiles = new ArrayList<Object>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void ls() {
        System.out.println(Demo.compositeBuilder + name);
        Demo.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            // Leverage the "lowest common denominator"
            AbstractFile obj = (AbstractFile) includedFile;
            obj.ls();
        }
        Demo.compositeBuilder.setLength(Demo.compositeBuilder.length() - 3);
    }
}