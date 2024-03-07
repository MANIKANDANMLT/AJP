package example4;

import java.util.Comparator;

public class CustomObjectComparator implements Comparator<customobject>{

	@Override
	public int compare(customobject obj1, customobject obj2) {
		
		return Integer.compare(obj1.id, obj2.id);
	}

}
