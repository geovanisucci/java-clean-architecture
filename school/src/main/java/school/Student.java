package school;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private Registration registrationNumber;
	private String name;
	private Email email;
	private List<Phone> phones = new ArrayList<Phone>();
	
	public void addPhone(String code, String number) {
		this.phones.add(new Phone(code, number));
	}
}
