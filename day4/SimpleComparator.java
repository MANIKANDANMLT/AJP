package example4;

import java.util.ArrayList;
import java.util.List;

public class SimpleComparator implements sortable<customobject> {
public static void main(String[]args) {
	List<customobject> obj= new ArrayList<>();
	obj.add(new customobject(1,"shree"));
	obj.add(new customobject(2,"raghul"));
	obj.add(new customobject(3,"reya"));
	
	SimpleComparator example= new SimpleComparator ();
	example.sort(obj);
	System.out.println(obj);
	
}

@Override
public void sort(List<customobject> items) {
	items.sort(new CustomObjectComparator());
	
}
}