package problems;

public class BaseballStats {
	
	int AB; int H; int twoB; int threeB; int HR; int R; int BB;

	public BaseballStats() {
		
	}
	
	public BaseballStats(int AB, int H, int twoB, int threeB, int HR, int R, int BB) {

	}
	
	public int getBA() {
		int BA = H/AB;
		return BA;
	}
	
	public int getOBP() {
		int OBP = (H+BB)/(AB+BB);
		return OBP;
	}
	
	public int getSLG() {
		int SLG = ((H-twoB-threeB-HR)+2*twoB+3*threeB+4*HR)/AB;
		return SLG;
	}
	
	public int getOPS() {
		int OPS = this.getSLG() + this.getOBP();
		return OPS;
	}
	
	public int getTB() {
		int TB = (H-twoB-threeB-HR)+2*twoB+3*threeB+4*HR;
		return TB;
	}



}
