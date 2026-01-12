package com.browserstudy;

import java.util.Stack;

public class BrowserBuddy {
 
	    private TabHistory activeTab;
	    private Stack<TabHistory> closedTabs;

	    public BrowserBuddy() {
	        activeTab = new TabHistory();
	        closedTabs = new Stack<>();
	    }

	    public void open(String url) {
	        activeTab.visit(url);
	    }

	    public String back() {
	        return activeTab.back();
	    }

	    public String forward() {
	        return activeTab.forward();
	    }

	    public void closeTab() {
	        closedTabs.push(activeTab);
	        activeTab = new TabHistory();
	    }

	    public void restoreTab() {
	        if (!closedTabs.isEmpty()) {
	            activeTab = closedTabs.pop();
	        }
	    }

	    public String currentPage() {
	        return activeTab.getCurrent();
	    }
	}
