package ps.exalt.training.singleton;

import java.util.HashMap;

import ps.exalt.training.FileCreation;
import ps.exalt.training.composite.File;

public class XmlFileCreation implements FileCreation {
	private static XmlFileCreation xmlFileCreation;
	private static HashMap<String, File> FilesOnMemory = new HashMap<String, File>();
//	private String name;
	
	private XmlFileCreation() {
		
	}
	public static File getInstance(String name) {
		File xml = null;
		if (xmlFileCreation == null) {
			synchronized (XmlFileCreation.class) {
				if (xmlFileCreation == null) { 						// double checked - thread safe, and benefit from threading
					xmlFileCreation = new XmlFileCreation();
				}
			}
		}
		
		if (!FilesOnMemory.containsKey(name)) {
			xml = readFileFromFileSystem(name);									// suppose the method will read from file system
			FilesOnMemory.put(name, xml);
		}
		else {
			xml = FilesOnMemory.get(name);
		}
		return xml;	
	}
	
	public static File readFileFromFileSystem(String name) {
		File xml = new File(name);
		return xml;
	}
}
