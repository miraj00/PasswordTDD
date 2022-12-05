import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PasswordsTDDTest {

	// creating list here allows us to use it for all test cases 
	ArrayList<String> passwordListTest = new ArrayList<String>(Arrays.asList("admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3","HellOO11@"));
	
	@Test
	void testList1() {
//		ArrayList<String> passwordList = new ArrayList<String>(Arrays.asList("admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3","HellOO11@"));
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry1", passwordListTest);
		assertEquals(expected, actual);
	}
	
	@Test
	void testList2() {
		
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("BUGGY55", passwordListTest);
		assertEquals(expected, actual);
	}

	@Test
	void testLength1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry2", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testLength2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("gOOn12", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testNum1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry3", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testNum2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("pIrAteKIng6", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testSpace1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry4", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testSpace2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("pIratE king2", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry5", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("goinmerry0", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("mod", passwordListTest);
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("admin", passwordListTest);
		assertEquals(expected, actual);
	}

}