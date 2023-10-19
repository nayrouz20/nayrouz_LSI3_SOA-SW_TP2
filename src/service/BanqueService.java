package service;
public class BanqueService {
    
	public double conversion(double montant) {
		return(montant*3.34);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BanqueService b = new BanqueService();
	     b.conversion(360);
	}

}
