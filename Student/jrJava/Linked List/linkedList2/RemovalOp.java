package jrJava.linkedList2;

import java.util.Iterator;

public class RemovalOp {

	private Iterator iter;
	private int removeId;
	
	public RemovalOp(Iterator iter, int removeId) {
		this.iter = iter;
		this.removeId = removeId;
	}
	
	public void process() {
		if(iter.hasNext()) {
			Link each = (Link) iter.next();
			if(each.id==removeId) iter.remove();
		}
	}
}
