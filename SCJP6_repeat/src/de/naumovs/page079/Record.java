package de.naumovs.page079;

public abstract class Record {

	
	Record getRecord(int fileNumber, final int recNumber) {
//		recNumber++;
		Record u = new Record() {
			
			abstract void fds();
			
		};
		
		u.showRecord();
		
		return null;
	}
	
	
	  void showRecord() {
		  
	}
	
	
	
}
