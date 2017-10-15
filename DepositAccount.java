/**   
* @Title: DepositAccount.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年10月14日 下午7:30:16
* @version V1.0
*/

/** 
* @ClassName: DepositAccount
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年10月14日 下午7:30:16
* 
*/
public class DepositAccount {
	/** 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws 
	*/
	private int account;	//账号
	private String name;	//姓名
	private double balance; 	//余额
	private static double rate;	//年利率
	
	DepositAccount(int account,String name,double balance){			//开户
		setAccount(account);
		setName(name);
		setBalance(balance);
	}
	DepositAccount()
	{}
	/** 
	* @return account
	*/
	public int getAccount() {
		return account;
	}

	/** 
	* @param account 要设置的 account
	*/
	public void setAccount(int account) {
		this.account = account;
	}

	/** 
	* @return name
	*/
	public String getName() {
		return name;
	}

	/** 
	* @param name 要设置的 name
	*/
	public void setName(String name) {
		this.name = name;
	}

	/** 
	* @return balance
	*/
	public double getBalance() {
		return balance;
	}

	/** 
	* @param balance 要设置的 balance
	*/
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** 
	* @return rate
	*/
	public static double getRate() {
		return rate;
	}

	/** 
	* @param rate 要设置的 rate
	*/
	public static void setRate(double rate) {
		DepositAccount.rate = rate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount(1234567890,"ZhangSn",5000);
		
		inquire(saver);

		//DepositAccount acct=new DepositAccount();
		
		saver.CountYear(0.023,2000);//设置年利率,存入钱
		
		saver.CountMonth(2000);

	}
	
	public static void inquire(DepositAccount account){
		System.out.println("当前余额为"+account.getBalance()+"元。");
	}
	
	public  void Deposit(DepositAccount account,int savemoney){	  //存款
			
		account.setBalance(account.getBalance()+savemoney);//给指定的对象存款
	
	}
	public  double CountYear(double rate,int money){	//计算年利率
		setRate(rate);
		double rateyear=getRate();//设置获取年利息
		double balance=getBalance();
		balance=balance+money;
		balance+=rateyear*balance;
		System.out.println("年利率为:"+rateyear+"........"+"存入金额"+money+"年利息为"+balance+"元。");
		return balance;		
	}
	
	public  double CountMonth(int money){	//计算月利率
		double ratemonth=getRate()/12; //获取月利率
		double balance=getBalance();
		balance+=ratemonth*balance;
		System.out.println("月利率为:"+ratemonth+"........"+"存入金额"+money+"元。"+"月息利为"+balance+"元。");
		return balance;
	}

}
