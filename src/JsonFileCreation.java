
public class JsonFileCreation implements FileCreation {
	public String name;
	
	public JsonFileCreation(String name) {
		this.name = name;
	}
	
	public File makeNewFile() {
		File json = new File(this.name);
		return json;
	}
}
