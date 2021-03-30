package com.ioc;

public class AccessRecord {

	RecordType recordType;
	
	public void setRecordType(RecordType recordType) {
		this.recordType = recordType;
	}

	public void displayRecord()
	{
		recordType.display();
	}

}
