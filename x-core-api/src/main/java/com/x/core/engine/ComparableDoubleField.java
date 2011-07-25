package com.x.core.engine;

public interface ComparableDoubleField {
	String getSymbolicName();
	
	LogicalLongOpt eq(double v);
	LogicalLongOpt gt(double v);
	LogicalLongOpt lt(double v);
	LogicalLongOpt ne(double v);
}
