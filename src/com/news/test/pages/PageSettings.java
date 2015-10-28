package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageSettings {

	public UiObject getOtherAccount() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/other_account");
	}
	
	public void clickOtherAccount(){
		try {
			getOtherAccount().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
