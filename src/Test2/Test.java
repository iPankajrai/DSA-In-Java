package Test2;

public class Test {
	
	public static void main(String[] args) {
		FindTrialsOfEggs f1 = new FindTrialsOfEggs();
		int i1 = f1.findTrials(0, 100);
		FindTrialsOfEggs f2 = new FindTrialsOfEggs();
		int i2 = f2.findTrials(0, 200);
		System.out.println(i1);
		System.out.println(i2);
	}
	
}