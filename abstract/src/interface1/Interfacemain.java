package interface1;

public class Interfacemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank inter = new Axisbank();
inter.rateofinterest();
inter.homeinterest();
inter.jewelloan();
Bank inter1 =new Sbibank();
inter1.rateofinterest();
inter1.homeinterest();
inter1.jewelloan();


Bank inter3 = new Hdfcbank();
inter3.rateofinterest();
inter3.homeinterest();
inter3.jewelloan();

	}
}
