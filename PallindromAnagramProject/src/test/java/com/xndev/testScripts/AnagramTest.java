package com.xndev.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.xndev.ObjectRepo.PallindromPage;
import com.xndev.genericRepo.BaseClass;

public class AnagramTest extends BaseClass{

	@Test
	public void checkAnagram() throws IOException
	{
		PallindromPage pp = new PallindromPage(driver);
		System.out.println("Anagram need to search : " + lib.fetchProperty("anagramData"));
		pp.enterAnagram(lib.fetchProperty("anagramData"));
		String result = pp.captureAnagramResult();
		System.out.println(result);
	}
}
