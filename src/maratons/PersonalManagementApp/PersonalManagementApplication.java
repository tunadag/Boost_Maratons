package maratons.PersonalManagementApp;

public class PersonalManagementApplication {	

	public static void main(String[] args) {
		PersonalManagement pmApp = new PersonalManagement();
		PMUtils.header("");
		
		int selection = 0;
		boolean cont = true;
		do {
		selection = PMUtils.menu(pmApp.initMenu());
		if (selection != 6) {
			pmApp.processMenu(selection);
				cont = true;
			} else {
				cont = PMUtils.wantToEnd("Really (Yes/No)?", "Yes");
			;
			}
		} while (cont);
	}
}
