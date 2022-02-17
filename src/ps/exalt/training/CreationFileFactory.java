package ps.exalt.training;

import ps.exalt.training.composite.File;
import ps.exalt.training.singleton.JsonFileManipulation;
import ps.exalt.training.singleton.TxtFileCreation;
import ps.exalt.training.singleton.XmlFileCreation;

public class CreationFileFactory {
	private static String TxtFormat = "txt";
	private static String JsonFormat = "json";
	private static String XmlFormat = "xml";


	public File createFile(String name) {
		//String format = name.substring(name.indexOf('.') + 1, (name.length()));
		
		if (name.endsWith(JsonFormat)) {
			return JsonFileManipulation.getInstance(name);
		}
		else if (name.endsWith(XmlFormat)) {
			return XmlFileCreation.getInstance(name);
		}
		else if (name.endsWith(TxtFormat)) {
			return TxtFileCreation.getInstance(name);
		}
		
		return null;

		
	}
}
