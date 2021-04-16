package com.arithmaticOps;

import java.io.FileNotFoundException;

public class PropertyFileNotFoundException extends FileNotFoundException {

	private static final long serialVersionUID = 4477493638228102763L;

	public String getMessage() {
		return "Property file not found at classpath";
	}
}
