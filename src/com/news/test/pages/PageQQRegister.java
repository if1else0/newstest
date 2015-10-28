package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageQQRegister {
	
	public UiObject getTitleTextView(){
		return UiObjectHelper.getUiObjectByResourceId("com.tencent.mobileqq:id/ivTitleName");
	}
	
	public String getTitleText(){
		try {
			return getTitleTextView().getText().toString();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}
