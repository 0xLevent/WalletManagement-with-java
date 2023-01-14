
public class Investment {

	// ailenin sahip olduğu taşınabilir mülk
	private double stakeAltin=4000;     // gram cinsinden
	private double unstakeAltin=2000;  // gram cinsinden
	private double stakeDolar=800;
	private double unstakeDolar=350;
	private double stakeKripto=600;   //usd karsiligi
	private double unstakeKripto=800; //usd karsiligi
	
	
	public Investment(double stakeAltin, double unstakeAltin, double stakeDolar, double unstakeDolar,
			double stakeKripto, double unstakeKripto) {
		super();
		this.stakeAltin = stakeAltin;
		this.unstakeAltin = unstakeAltin;
		this.stakeDolar = stakeDolar;
		this.unstakeDolar = unstakeDolar;
		this.stakeKripto = stakeKripto;
		this.unstakeKripto = unstakeKripto;
	}
	
	
	public Investment() {
	}
	public double getStakeAltin() {
		return stakeAltin;
	}
	public void setStakeAltin(double stakeAltin) {
		this.stakeAltin = stakeAltin;
	}
	public double getUnstakeAltin() {
		return unstakeAltin;
	}
	public void setUnstakeAltin(double unstakeAltin) {
		this.unstakeAltin = unstakeAltin;
	}
	public double getStakeDolar() {
		return stakeDolar;
	}
	public void setStakeDolar(double stakeDolar) {
		this.stakeDolar = stakeDolar;
	}
	public double getUnstakeDolar() {
		return unstakeDolar;
	}
	public void setUnstakeDolar(double unstakeDolar) {
		this.unstakeDolar = unstakeDolar;
	}
	public double getStakeKripto() {
		return stakeKripto;
	}
	public void setStakeKripto(double stakeKripto) {
		this.stakeKripto = stakeKripto;
	}
	public double getUnstakeKripto() {
		return unstakeKripto;
	}
	public void setUnstakeKripto(double unstakeKripto) {
		this.unstakeKripto = unstakeKripto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
