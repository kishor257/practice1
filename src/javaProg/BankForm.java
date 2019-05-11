package javaProg;

public class BankForm {
	
	public static void transaction(int bal) throws InsufficientAmtException {
		
		if (bal<100 || bal>40000) {		
			throw new InsufficientAmtException(bal+ " is an Invalid Amount");
		}else {
			System.out.println("welcome to PNB");
		}
	}
	public static void main(String[] args) {
		//try {
			transaction(50);
//		} catch (Exception e) {
//			System.out.println("Exception occured: "+e);
//		}
	}

}
