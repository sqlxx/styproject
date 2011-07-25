package com.x.core.engine.ext;

public interface ComparableStringField {
	String getSymbolicName();
	
	LogicalLongOpt lk(String v);
	LogicalLongOpt ne(String v);
	LogicalLongOpt eq(String v);
}
