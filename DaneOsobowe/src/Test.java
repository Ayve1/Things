import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void testCreate() {
		
		String i = "Weronika";
		String n = "Smolinska";
		int y = 1930, m = 7, d = 20;
		int nT = 123123123;
		PersonalData person = new PersonalData(i,n,y,m,d,nT);
		Assert.assertNotNull(person);
	}

}
