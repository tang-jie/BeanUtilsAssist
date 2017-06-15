# BeanUtilsAssist
BeanUtilsAssist is an improved extension of the populate method of the traditional org.apache.commons.beanutils.BeanUtils class.
----------
~~~~~~~~~~java
class Person{
	private String user_id;
	
	public String getUser_id() {
	    return user_id;
	}
	
	public void setUser_id(String user_id) {
	    this.user_id = user_id;
	}
}
~~~~~~~~~~
~~~~~~~~~~java
class Person{
	private String user_id;
	
	public String getUserId() {
	    return user_id;
	}
	
	public void setUserId(String user_id) {
	    this.user_id = user_id;
	}
}
~~~~~~~~~~

----------

## Author

----------

## License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) 2017 Newland Group Holding Limited
