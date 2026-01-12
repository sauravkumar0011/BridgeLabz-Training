package com.browserstudy;

public class BrowserStudyTest {

	public static void main(String[] args) {
		
		BrowserBuddy browser = new BrowserBuddy();

        browser.open("google.com");
        browser.open("youtube.com");
        browser.open("github.com");

        System.out.println(browser.back());
        System.out.println(browser.forward());

        browser.closeTab();
        browser.restoreTab();

        System.out.println(browser.currentPage());
	}

}
