package Basic;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		Practice.ChromeBrowser();
		Thread.sleep(2000);
		Practice.OpenDWS();
		Thread.sleep(2000);
		UtilityForLogin.LoginTextScript();
		Thread.sleep(2000);
		UtilityForRegistration.RegistrationTestScript();
		//Practice.CloseBrowser();

	}

}
