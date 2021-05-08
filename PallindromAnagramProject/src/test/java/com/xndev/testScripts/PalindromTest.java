package com.xndev.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.xndev.ObjectRepo.PallindromPage;
import com.xndev.genericRepo.BaseClass;

public class PalindromTest extends BaseClass{

	@Test
	public void checkPalindrom() throws IOException
	{
		PallindromPage pp = new PallindromPage(driver);
		pp.enterPalindrom(lib.fetchProperty("palindromData"));
		String result = pp.capturePalindromResult();
		String msg = result.contains("Yes") ? " Its Palindrom" : " Its not Palindrom";
		System.out.println(lib.fetchProperty("palindromData") + msg);
	}
}
