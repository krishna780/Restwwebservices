package filteringExample;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
	private String field1;
	private String field2;
	private String field3;
	
	public SomeBean() {
		// TODO Auto-generated constructor stub
	}

	public SomeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
}
