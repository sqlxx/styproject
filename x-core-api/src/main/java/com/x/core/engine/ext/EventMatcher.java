package com.x.core.engine.ext;

import java.util.List;

public interface EventMatcher {
	/**
	 * 
	 * @return the event fields that are declared as Long in the 
	 * EventFieldDefinition.
	 */
	List<ComparableLongField> getLongs();
	List<ComparableDoubleField> getDoubles();
	List<ComparableStringField> getStrings();
	List<ComparableBooleanField> getBooleans();
}
