class ManualTransmission {
	private boolean clutch = false;
	public final int gears;
	private int gear = 0; // 0: neutral, -1: reverse
	
	/** @param gears The number of gears in the transmission **/
	public ManualTransmission(int gears) {
		this.gears = gears;
	}
	
	/** Returns true on successful shift. **/
	public boolean shiftUp() {
		if (clutch && gear < gears) {
			gear++;
			return true;
		}
		return false;
	}
	
	/** Returns true on successful shift. **/
	public boolean shiftDown() {
		if (clutch && gear > -1) {
			gear--;
			return true;
		}
		return false;
	}
	
	public boolean shiftTo(int gear) {
		if (clutch) {
			if (gear == -1) {
				if (this.gear != 0) {
					return false;
				}
			} else if (gear >=0 && gear <= gears) {
				this.gear = gear;
				return true;
			}
		}
		return false;
	}
	
	public void clutchDown() {
		clutch = true;
	}
	
	public void clutchUp() {
		clutch = false;
	} 
	
	public int getGear() {
		return gear;
	}
	
	public boolean clutchState() {
		return clutch;
	}
}