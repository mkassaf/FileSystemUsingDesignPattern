
public class CreationFileFactory {
	public FileCreation createFile(String name) {
		String format = name.substring(name.indexOf('.') + 1, (name.length()));
		
		if (format.equals("json")) {
			return new JsonFileCreation(name);
		}
		else if (format.equals("xml")) {
			return new XmlFileCreation(name);
		}
		else if (format.equals("txt")) {
			return new TxtFileCreation(name);
		}
		return null;
		
	}
}
