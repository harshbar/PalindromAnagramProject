package com.xndev.genericRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

	public String fetchProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IAutoConstant.PROPERTY_PATH);
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
}
