

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     grocery myacc=new grocery();
    myacc.setCustomername("Aditi");
    myacc.setCustomerId("#226");
    myacc.setAccbal(500.0);
    myacc.setAddress("Hindmotor");
    myacc.setCustomerphone("9748733656");
    
    System.out.println("Hii " + myacc.getCustomername()+ "!!");
    
    myacc.shop(498);
    myacc.recharge(100);
	myacc.shop(200);
	myacc.shop(300);
	myacc.recharge(500);
	}

}
