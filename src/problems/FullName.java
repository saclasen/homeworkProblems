package problems;

public class FullName {
	
	private String given;
	private String family;
	
	public FullName(String first, String last) {
		 given = first;
		 family = last;
	}
	
	public String toString() {
		return family + ", " + given;
	}
}
