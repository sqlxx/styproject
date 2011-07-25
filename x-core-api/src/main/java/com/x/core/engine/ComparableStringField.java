package com.x.core.engine;

public interface ComparableStringField {
	String getSymbolicName();
	
	LogicalLongOpt lk(String v);
	LogicalLongOpt ne(String v);
	LogicalLongOpt eq(String v);
}
