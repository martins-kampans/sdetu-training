package basics;

public class Cities {

	public static void main(String[] args) {
////		String[] cities = {"New York", "San Francisko", "Miami", "Dallas"};
////		System.out.println(cities[0]);
//		
//		String[] states = new String[5];
//		states[0] = "California";
//		states[1] = "Ohio";
//		states[2] = "New Jersey";
//		states[3] = "Texas";
//		states[4] = "Utah";
		
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
//		System.out.println(states[2]);
//		int i = 0;
//		do {
//			System.out.println("state nr. " + i + " is " + states[i] );
//			i++;
//		}while(i < 5);
		
//		int n = 0;
//		boolean stateFound = false;
//		while(!stateFound) {
//			System.out.println("STATE at " + n + ": " + states[n]);
//			if(states[n] == "Texas") {
//				System.out.println("STATE FOUND!");
//				stateFound = true;
//			}
//			n++;
//		}
		for(int x = 0; x < 5; x++) {
			System.out.println("STATE at " + x + ": " + states[x]);
			
		}
//		
		
		
		
	}

}
