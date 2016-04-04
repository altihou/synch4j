package com.synch4j.exception;

public class DataPickerException extends Exception{
	private String info;
	
	public DataPickerException(String info){
		super();
		this.info = "数据提取器出错！请检查。"+info+"\r\n";
		this.info += super.getMessage();
	}
	
	
	@Override
	public String toString() {
		return "DataPickerErrorException [info=" + info + "]";
	}


	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
