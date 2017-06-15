# BeanUtilsAssist
BeanUtilsAssist is an improved extension of the populate method of the traditional org.apache.commons.beanutils.BeanUtils class.
----------
## BeanUtilsAssist简介：
**BeanUtilsAssist是对传统org.apache.commons.beanutils.BeanUtils类的populate方法的一种改进扩展。**
* 支持由于某些历史原因遗留下来的JavaBean，其属性命名带下划线的变量，对应的getter/setter方法为Java标准的lowerCamelCase命名规则。
* 具体来说，传统意义上的org.apache.commons.beanutils.BeanUtils类的populate方法，JavaBean中属性命名带下划线，其对应的getter/setter方法只能如下：
~~~~~~~~~~java
class Person{
	private String user_id;
	
	// 这种方法名看上去有点low
	public String getUser_id() {
	    return user_id;
	}
	
	// 这种方法名看上去有点low 
	public void setUser_id(String user_id) {
	    this.user_id = user_id;
	}
}
~~~~~~~~~~
* 优化后兼容如下的JavaBean形式：
~~~~~~~~~~java
class Person{
	private String user_id;
	
	//这种方法名看上去至少顺眼
	public String getUserId() {
	    return user_id;
	}
	
	//这种方法名看上去至少顺眼
	public void setUserId(String user_id) {
	    this.user_id = user_id;
	}
}
~~~~~~~~~~
* 但是终归是兼容，更稳妥的做法是整个JavaBean设计，全部按照标准的lowerCamelCase命名规则来定义才是更稳妥的做法。

----------

## Author
唐洁（tangjie） http://www.cnblogs.com/jietang/

----------

## License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) 2017 Newland Group Holding Limited

