package throwDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		AccountManager manager = new AccountManager();
		System.out.println("Hesap = "+manager.getBalance());
		manager.deposit (100);
		System.out.println("Hesap = "+manager.getBalance());
		try {
			manager.withraw(90);
		}catch(Exception exception) {
			exception.getMessage();
		}
		manager.withraw (90);
		System.out.println("Hesap = "+manager.getBalance());
		manager.withraw (20);
		System.out.println("Hesap = "+manager.getBalance());

}
}