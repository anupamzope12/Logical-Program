package CustomArrayList;

import java.util.ArrayList;

public class SustomArray_LIst  extends ArrayList   {
	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
public static void main(String[] args) {
	SustomArray_LIst list=new SustomArray_LIst();
	list.add(101);
	list.add(102);
	list.add(103);
	list.add(101);
	list.add(102);
	list.add(103);

	System.out.println(list);
	}
}
