
public class MegaBytesConverter {

	
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		int kiloToMegaBytes = kiloBytes/1024;
		int remKiloBytes = kiloBytes%1024;
		
		
		if (kiloBytes >=0) {
			System.out.println(kiloBytes + " KB = " +
			kiloToMegaBytes + " MB" + " and " + remKiloBytes + " KB");
		}
		else {
			System.out.println("Invalid Value");
		}
	}
	
	public static void main(String[] args) {
	
	printMegaBytesAndKiloBytes(5000);
	printMegaBytesAndKiloBytes(-1024);
	printMegaBytesAndKiloBytes(2500);
	}
}
