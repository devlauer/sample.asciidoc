package de.elnarion.sample.domain;

/**
 * The Class BaseDomainClass.
 * 
 * * a list
 * ** sublist
 * * second list point
 * * third list point
 * 
 * 
 */
public abstract class BaseDomainClass implements DomainInterface{


	@Override
	public void someMethod() {
	}

	@Override
	public void someMethodWithParameter(String paramParameter) {
	}

	@Override
	public String someMethodWithReturnValue() {
		return null;
	}

}
