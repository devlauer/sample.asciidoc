package de.elnarion.sample.domain;

import javax.persistence.Table;

/**
 * The Class ChildA.
 */
@Table(name = "childatab", schema = "schema")
public class ChildA extends BaseDomainClass{

	private UtilClass util;
	@SuppressWarnings("unused")
	private static long test;
	protected long test2;
	public long test3;

	/**
	 * Gets the util.
	 *
	 * @return UtilClass - the util
	 */
	public UtilClass getUtil() {
		return util;
	}

	/**
	 * Sets the util.
	 *
	 * @param util the util
	 */
	public void setUtil(UtilClass util) {
		this.util = util;
	}
	
	
}
