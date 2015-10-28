package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageQQLoginType {
	
	/**
	 * 获得直接登录按钮
	 * @return
	 */
	public UiObject getDirectLoginBtn(){
		return UiObjectHelper.getUiObjectByResourceId("com.tencent.mobileqq:id/btn_login");
	}
	
	/**
	 * 获得新用户按钮
	 */
	public UiObject getNewUserBtn(){
		return UiObjectHelper.getUiObjectByResourceId("com.tencent.mobileqq:id/btn_register");
	}
	
	/**
	 * 点击直接登录按钮
	 */
	public void clickDirectLoginBtn(){
		try {
			getDirectLoginBtn().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 点击新用户按钮
	 */
	public void clickNewUserBtn(){
		try {
			getNewUserBtn().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
