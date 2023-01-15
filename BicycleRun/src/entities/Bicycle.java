package entities;

public class Bicycle {

	// this is the base class
		// the bicycle has two fields
		public Wheels frontWheel;
		public Wheels rearWheel;

		// the Bicycle class has one constructor
		public Bicycle(Wheels frontWheel, Wheels rearWheel) {
			this.frontWheel = frontWheel;
			this.rearWheel = rearWheel;
		}
		
		// the Bicycle has two methods
		// make the bike go
		public void run() {
			
		}

		// make the bike to stop
		public void breaking() {

		}
	
}
