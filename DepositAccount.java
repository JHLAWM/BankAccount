/**   
* @Title: DepositAccount.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��10��14�� ����7:30:16
* @version V1.0
*/

/** 
* @ClassName: DepositAccount
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��10��14�� ����7:30:16
* 
*/
public class DepositAccount {
	/** 
	* @Title: main
	* @Description: TODO(������һ�仰�����������������)
	* @param @param args
	* @return void
	* @throws 
	*/
	private int account;	//�˺�
	private String name;	//����
	private double balance; 	//���
	private static double rate;	//������
	
	DepositAccount(int account,String name,double balance){			//����
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
	* @param account Ҫ���õ� account
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
	* @param name Ҫ���õ� name
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
	* @param balance Ҫ���õ� balance
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
	* @param rate Ҫ���õ� rate
	*/
	public static void setRate(double rate) {
		DepositAccount.rate = rate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount(1234567890,"ZhangSn",5000);
		
		inquire(saver);

		//DepositAccount acct=new DepositAccount();
		
		saver.CountYear(0.023,2000);//����������,����Ǯ
		
		saver.CountMonth(2000);

	}
	
	public static void inquire(DepositAccount account){
		System.out.println("��ǰ���Ϊ"+account.getBalance()+"Ԫ��");
	}
	
	public  void Deposit(DepositAccount account,int savemoney){	  //���
			
		account.setBalance(account.getBalance()+savemoney);//��ָ���Ķ�����
	
	}
	public  double CountYear(double rate,int money){	//����������
		setRate(rate);
		double rateyear=getRate();//���û�ȡ����Ϣ
		double balance=getBalance();
		balance=balance+money;
		balance+=rateyear*balance;
		System.out.println("������Ϊ:"+rateyear+"........"+"������"+money+"����ϢΪ"+balance+"Ԫ��");
		return balance;		
	}
	
	public  double CountMonth(int money){	//����������
		double ratemonth=getRate()/12; //��ȡ������
		double balance=getBalance();
		balance+=ratemonth*balance;
		System.out.println("������Ϊ:"+ratemonth+"........"+"������"+money+"Ԫ��"+"��Ϣ��Ϊ"+balance+"Ԫ��");
		return balance;
	}

}
