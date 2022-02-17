package ps.exalt.training.singleton;

import java.util.HashMap;

import ps.exalt.training.FileCreation;
import ps.exalt.training.composite.File;

public class JsonFileManipulation implements FileCreation {
	private static JsonFileManipulation jsonFileCreation;
	private static HashMap<String, File> FilesOnMemory = new HashMap<String, File>();
	//private String name;
	
	private JsonFileManipulation(String name) {
		//this.name = name;
	}
	
	public static File getInstance(String name) {
		File json = null;
		if (jsonFileCreation == null) {
			synchronized (JsonFileManipulation.class) {
				if (jsonFileCreation == null) { 						// double checked - thread safe, and benefit from threading
					jsonFileCreation = new JsonFileManipulation(name);
				}
			}
		}
		
		if (!FilesOnMemory.containsKey(name)) {
			json = readFileFromFileSystem(name);									// suppose the method will read from file system
			FilesOnMemory.put(name, json);
		}
		else {
			json = FilesOnMemory.get(name);
		}
		return json;
	}
	
	private static File readFileFromFileSystem(String name) {
		File json = new File(name);
		return json;
	}

}
