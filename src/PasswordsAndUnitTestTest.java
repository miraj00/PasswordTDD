import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PasswordsAndTDDTest {

	@Test
	void testList1() {
	//	ArrayList<String> passwordList = new ArrayList<String>(Arrays.asList("admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3","HellOO11@"));
		String[] expected = {"admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3", "HellOO11@", "gOInmerry1" };   // true
		String [] actual = PasswordTDD.passwordValidate("gOInmerry1", passwordList);
		assertEquals(expected, actual);
	}
	@Test
	void testList2() {
		
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("BUGGY55", ArrayList<String> passwordList);
		assertEquals(expected, actual);
	}
	@Test
	void testLength1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry2");
		assertEquals(expected, actual);
	}
	@Test
	void testLength2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("gOOn12");
		assertEquals(expected, actual);
	}
	@Test
	void testNum1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry3");
		assertEquals(expected, actual);
	}
	@Test
	void testNum2() {
		boolean expected = false;
		boolean actual = PassworddTDD.passwordValidate("pIrAteKIng6");
		assertEquals(expected, actual);
	}
	@Test
	void testSpace1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry4");
		assertEquals(expected, actual);
	}
	@Test
	void testSpace2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("pIratE king2");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels1() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("gOInmerry5");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowels2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("goinmerry0");
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod() {
		boolean expected = true;
		boolean actual = PasswordTDD.passwordValidate("mod");
		assertEquals(expected, actual);
	}
	@Test
	void testAdminMod2() {
		boolean expected = false;
		boolean actual = PasswordTDD.passwordValidate("admin");
		assertEquals(expected, actual);
	}
}