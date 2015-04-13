package git;

public class Romertal {
	
	private String L, V;
	private String a, b;

	public Romertal(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public String getFacit() {
		if( a + b == "IIIII" )
			return "V";
		else
		return "L";
	}

}
