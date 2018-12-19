package org.lq.export.excel;

public class Excel extends ExcelWork{
	
	private String version;
	
	private String version1;
	public Excel() {
		this.version=super.VERSION;
	}
	public Excel(String version) {
		this.version=version;
	}
	
}
