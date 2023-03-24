package ExtraCreditsStream;

import java.util.List;

public class TaxPayer {
	
	private int id ;
	private String name;
	private List<TaxReturn> tx;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TaxPayer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public List<TaxReturn> getTx() {
		return tx;
	}
	public void setTx(List<TaxReturn> tx) {
		this.tx = tx;
	}
	
	
	

}
