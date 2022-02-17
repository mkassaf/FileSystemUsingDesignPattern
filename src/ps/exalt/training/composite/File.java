package ps.exalt.training.composite;

import ps.exalt.training.Demo;

// File implements the "lowest common denominator"
public class File implements AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void listFiles() {
        System.out.println(Demo.compositeBuilder + name);
    }
}