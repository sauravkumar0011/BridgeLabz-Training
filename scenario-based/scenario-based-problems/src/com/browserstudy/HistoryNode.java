package com.browserstudy;

public class HistoryNode {

	String url;
    HistoryNode prev;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
    }
}
