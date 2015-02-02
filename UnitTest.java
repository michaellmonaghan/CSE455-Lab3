class UnitTest {
	public static void main (String[] args) {
		ManualTransmission mt;
		
		mt = new ManualTransmission(5);
		if (mt.shiftUp()){
			System.out.println("shift up no clutch fail");
			return;
		}
	
		mt = new ManualTransmission(5);
		if (mt.shiftDown()){
			System.out.println("shift down no clutch fail");
			return;
		}
		
		mt = new ManualTransmission(5);
		mt.clutchDown();
		if (!mt.shiftUp()){
			System.out.println("shift up with clutch down fail");
			return;
		}
			
		mt = new ManualTransmission(5);
		mt.clutchDown();
		if (!mt.shiftTo(5)){
			System.out.println("shifting to 5 with clutch down fail");
			return;
		}
		
		mt = new ManualTransmission(5);
		mt.clutchDown();
		if (!mt.shiftDown()){
			System.out.println("shift down with clutch down fail");
			return;
		}
		
		mt = new ManualTransmission(5);
		mt.clutchDown();
		if (!mt.shiftTo(5)) {
			System.out.println("shifting to 5 failed with clutch down");
			return;
		}
		
		
		mt = new ManualTransmission(5);
		mt.clutchDown();
		if (mt.shiftTo(8)) {
			System.out.println("setGear above total gears failed with clutch down");
			return;
		}
		
		System.out.println("Success");
	}
}