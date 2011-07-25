package com.x.core.engine;

public interface ComparableLongField {

	String getSymbolicName();
	
	
	LogicalLongOpt ne(long v);
	LogicalLongOpt eq(long v);
	LogicalLongOpt gt(long v);
	LogicalLongOpt lt(long v);
	
	
	
}
