package adapter;

import model.Transfer;

public class CashToTransferAdapter extends Transfer {
	private Transfer transfer;

	public CashToTransferAdapter(double cash) {
		super(cash);
		this.transfer = new Transfer(cash);
	}

	@Override
	public double getAmount() {
		return super.getAmount() * 1.1;
	}

}
