
public class CreationFileFactory {
	public File createFile(String name) {
		String format = name.substring(name.indexOf('.') + 1, (name.length()));
		
		if (format.equals("json")) {
			return JsonFileCreation.getInstance().makeNewFile(name);
		}
		else if (format.equals("xml")) {
			return XmlFileCreation.getInstance().makeNewFile(name);
		}
		else if (format.equals("txt")) {
			return TxtFileCreation.getInstance().makeNewFile(name);
		}
		return null;
		
	}
}
