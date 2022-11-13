package Test2;

public class FindTrialsOfEggs  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findTrials(0,100));
		
		System.out.println(findTrials(0,200));
		

	}
	
	public static int findTrials(int eggs, int floors) {
		return eggs + floors;
	}

}

