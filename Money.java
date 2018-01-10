public class Money {
  //花呗还钱好像没有通用性
	public static void main(String[] args) {
		countMoney(2999,1.05,40);
	}
	
	public static void countMoney(double principal,double rate,double day){
		double money = principal;
		double dayrate = 1+(rate-1/360);
		for(int i =0;i<day;i++){
			money = money*dayrate;
		}
		System.out.println(money - principal);
	}
}
