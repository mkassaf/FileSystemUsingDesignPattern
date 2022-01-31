package ps.exalt.training.composite;
import java.util.ArrayList;

import ps.exalt.training.Demo;
import ps.exalt.training.exception.DataNotSuitableException;


// Directory implements the "lowest common denominator"
public class Directory implements AbstractFile {
    private String name;
    private ArrayList<Object> includedFiles = new ArrayList<Object>();

    public Directory(String name) {
        this.name = name;
    }

    
    /**
     * 
     * @param obj
     * @throws DataNotSuitableException
     */
    public void add(AbstractFile file) throws DataNotSuitableException {
    	if(file != null) {
			includedFiles.add(file);
		}
		else {
			throw new DataNotSuitableException("DataNotSuitableException , The file has not been added !!");
		}
    }

    public void listFiles() {
        System.out.println(Demo.compositeBuilder + name);
        Demo.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            AbstractFile obj = (AbstractFile) includedFile;
            obj.listFiles();
        }
        Demo.compositeBuilder.setLength(Demo.compositeBuilder.length() - 3);
    }
}