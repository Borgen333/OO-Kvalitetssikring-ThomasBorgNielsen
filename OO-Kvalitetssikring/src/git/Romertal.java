package git;

public class Romertal {

	private String b;
	private String a;
	private String c;
	private StringBuilder sbI = new StringBuilder("");
	private StringBuilder sbX = new StringBuilder("");
	private StringBuilder sbV = new StringBuilder("");
	private StringBuilder sbL = new StringBuilder("");
	private StringBuilder sbC = new StringBuilder(""); 
	private StringBuilder sbD = new StringBuilder(""); 
	private StringBuilder samletSB = new StringBuilder("");

	public Romertal(String a, String b) {
		this.a = a;
		this.b = b;
		c = a + b;
	}

	public String getFacit() {

		getI();
		getV();
		getX();
		getC();
		return samletSB.append(sbD).append(sbC).append(sbL).append(sbX).append(sbV).append(sbI).toString();
	}

	private void getI() {
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'I')
				sbI.append("I");
			if (sbI.indexOf("IIIII") == 0) {
				sbI.delete(0, 5);
				sbV.append("V");
			}}
	}

	private void getX() {
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'X')
				sbX.append("X");
			if (sbX.indexOf("XXXXX") == 0) {
				sbX.delete(0, 5);
				sbL.append("L");
			}}
	}

	private void getC() {
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'C')
				sbC.append("C");
			if (sbC.indexOf("CCCCC") == 0) {
				sbC.delete(0, 5);
				sbD.append("D");
			}}
	}
	
	private void getV() {
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == 'V')
				sbV.append("V");
			if (sbV.indexOf("VV") == 0) {
				sbV.delete(0, 2);
				sbX.append("X");
			}}
	}
}
