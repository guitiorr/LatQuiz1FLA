package adapter;

import model.Crypto;

public class CashToCryptoAdapter extends Crypto{
	private Crypto crypto;

	public CashToCryptoAdapter(double cash) {
		super(cash);
		this.crypto = new Crypto(cash);
	}

	@Override
	public double getAmount() {
		return super.getAmount() * 1.2;
	}
	
	

}
