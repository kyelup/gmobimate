package st.isacc.isacc.services.com.entity;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonRootName;

@XmlRootElement
public class EmployeeBean {

	private long height;
	private String para1;
	private String para2;
	
	
	
	
	public EmployeeBean(long height, String para1, String para2) {
		super();
		this.height = height;
		this.para1 = para1;
		this.para2 = para2;
	}




	public EmployeeBean() {
		super();
	}




	public long getHeight() {
		return height;
	}




	public void setHeight(long height) {
		this.height = height;
	}




	public String getPara1() {
		return para1;
	}




	public void setPara1(String para1) {
		this.para1 = para1;
	}




	public String getPara2() {
		return para2;
	}




	public void setPara2(String para2) {
		this.para2 = para2;
	}



}
