package problem6;

public class Invoice {
	private TaxType taxType;
	
	void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}
	
	public double getTotal(){
		double amount = getSubtotal();
    amount+=taxType.getTax(amount);
    return amount;
	}
	double getSubtotal()
	{
		double subtotal = 0;
		/* 
		 * foreach(lineItem in Items)
		 * {
		 * 		subtotal += lineItem.getPrice() * lineItem.Qty()
		 * }
		 */
		return subtotal;
	}
}

interface TaxType {

} 

class TaxType1 implements TaxType {
  getTax(amount) {
  }
}

class TaxType2 implements TaxType {
  getTax(amount) {
  }
}

class TaxType3 implements TaxType {
  getTax(amount) {
  }
}
