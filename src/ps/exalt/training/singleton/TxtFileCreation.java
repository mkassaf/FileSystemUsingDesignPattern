package ps.exalt.training.singleton;

import java.util.HashMap;

import ps.exalt.training.FileCreation;
import ps.exalt.training.composite.File;

public class TxtFileCreation implements FileCreation {
	private static TxtFileCreation txtFileCreation;
	private static HashMap<String, File> FilesOnMemory = new HashMap<String, File>();
//	private String name;
	
	private TxtFileCreation() {
		
	}
	
	public static File getInstance(String name) {
		File txt = null;
		if (txtFileCreation == null) {
			synchronized(TxtFileCreation.class) {
				if (txtFileCreation == null) { 						// double checked - thread safe, and benefit from threading
					txtFileCreation = new TxtFileCreation();
				}
			}
		}
		
		if (!FilesOnMemory.containsKey(name)) {
			txt = readFileFromFileSystem(name);									// suppose the method will read from file system
			if (FilesOnMemory.size() > 4) {
				releaseExceptNameFromMap(name);
			}
			FilesOnMemory.put(name, txt);
		}
		else {
			txt = FilesOnMemory.get(name);
		}
		System.out.println(FilesOnMemory);
		return txt;	
	}
	
	private static File readFileFromFileSystem(String name) {
		File txt = new File(name);
		return txt;
	}
	
	private static void releaseExceptNameFromMap(String name) {
		for (String i : FilesOnMemory.keySet()) {
			if(i.equals(name) != true) {
				FilesOnMemory.remove(i);
				break;
			}
		}
	}
}
