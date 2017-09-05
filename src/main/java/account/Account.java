package account;

public class Account {
	
	private String accountNumber;
	private String accountDescription;
	private String accountType;
	private String balanceType;
	
	public Account(String accountNumber, String accountDescription, String accountType, String balanceType) {
		super();
		this.accountNumber = accountNumber;
		this.accountDescription = accountDescription;
		this.accountType = accountType;
		this.balanceType = balanceType;
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountDescription
	 */
	public String getAccountDescription() {
		return accountDescription;
	}
	/**
	 * @param accountDescription the accountDescription to set
	 */
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the balanceType
	 */
	public String getBalanceType() {
		return balanceType;
	}
	/**
	 * @param balanceType the balanceType to set
	 */
	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Account [accountNumber=%s, accountDescription=%s, accountType=%s, balanceType=%s]",
				accountNumber, accountDescription, accountType, balanceType);
	}
}
