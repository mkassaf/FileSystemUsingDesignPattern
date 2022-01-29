
public class TxtFileCreation implements FileCreation {
	private static TxtFileCreation obj;
	private String name;
	
	private TxtFileCreation() {
		
	}
	
	public static TxtFileCreation getInstance() {
		if(obj == null) {
			synchronized (TxtFileCreation.class) {
				if (obj==null) {
					obj = new TxtFileCreation();
				}
			}
		}
		return obj;
	}
	
	public File makeNewFile(String name) {
		this.name = name;
		File txt = new File(this.name);
		return txt;
	}
}
