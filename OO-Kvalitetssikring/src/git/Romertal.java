package git;

public class Romertal {

	private String b;
	private String a;
	private String c;
	private StringBuilder sbI = new StringBuilder("");
	private StringBuilder sbX = new StringBuilder("");
	private StringBuilder sbV = new StringBuilder("");
	private StringBuilder sbL = new StringBuilder("");
	private StringBuilder samletSB = new StringBuilder("");

	public Romertal(String a, String b) {
		this.a = a;
		this.b = b;
		c = a + b;
	}

	public String getFacit() {

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'I')
				sbI.append("I");
			if (sbI.indexOf("IIIII") == 0) {
				sbI.delete(0, 5);
				sbV.append("V");
			}}
		
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'X')
				sbX.append("X");
			if (sbX.indexOf("XXXXX") == 0) {
				sbX.delete(0, 5);
				sbL.append("L");
			}}
		return samletSB.append(sbL).append(sbX).append(sbV).append(sbI).toString();
	}
}
