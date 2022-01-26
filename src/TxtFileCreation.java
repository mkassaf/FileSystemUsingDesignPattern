
public class TxtFileCreation implements FileCreation {
	public String name;
	
	public TxtFileCreation(String name) {
		this.name = name;
	}
	
	public File makeNewFile() {
		File txt = new File(this.name);
		return txt;
	}
}
