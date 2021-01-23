package de.naumovs.page103;

public enum CofeeSize {

	BIG, HUGE,
	//
	OVER { // start a code block that defines the "body" for this constant
		public String getHeadCode() {
			return "A";
		}
	}; // the semicolon is REQUIRED when more code follows

	
	public String getHeadCode() {
		return "B";
	}
}
