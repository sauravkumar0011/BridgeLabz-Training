package com.browserstudy;

public class TabHistory {

	 private HistoryNode current;

	    public void visit(String url) {
	        HistoryNode node = new HistoryNode(url);
	        if (current != null) {
	            current.next = node;
	            node.prev = current;
	        }
	        current = node;

	    }
	    
	    public String back() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	        }
	        return current != null ? current.url : null;
	    }

	    public String forward() {
	        if (current != null && current.next != null) {
	            current = current.next;
	        }
	        return current != null ? current.url : null;
	    }

	    public String getCurrent() {
	        return current != null ? current.url : null;
	    }
}
