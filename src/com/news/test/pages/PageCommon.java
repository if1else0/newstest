package com.news.test.pages;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageCommon {
	
	public void clickByText(String text){
		try {
			UiObjectHelper.getUiObjectByText(text).clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
