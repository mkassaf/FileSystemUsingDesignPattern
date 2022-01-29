
public class JsonFileCreation implements FileCreation {
	private static JsonFileCreation obj;
	private String name;
	
	private JsonFileCreation() {
		
	}
	
	public static JsonFileCreation getInstance() {
		if(obj == null) {
			synchronized (JsonFileCreation.class) {
				if (obj==null) {
					obj = new JsonFileCreation();
				}
			}
		}
		return obj;
	}
	
	public File makeNewFile(String name) {
		this.name = name;
		File json = new File(this.name);
		return json;
	}
}
