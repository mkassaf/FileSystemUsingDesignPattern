
public class XmlFileCreation implements FileCreation {
	private static XmlFileCreation obj;
	private String name;
	
	private XmlFileCreation() {
		
	}
	public static XmlFileCreation getInstance() {
		if(obj == null) {
			synchronized (XmlFileCreation.class) {
				if (obj==null) {
					obj = new XmlFileCreation();
				}
			}
		}
		return obj;
	}
	
	public File makeNewFile(String name) {
		this.name = name;
		File xml = new File(this.name);
		return xml;
	}
}
