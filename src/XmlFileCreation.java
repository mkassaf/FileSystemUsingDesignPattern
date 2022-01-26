
public class XmlFileCreation implements FileCreation {
	public String name;
	
	public XmlFileCreation(String name) {
		this.name = name;
	}
	
	public File makeNewFile() {
		File xml = new File(this.name);
		return xml;
	}
}
