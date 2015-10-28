package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageMy {

	/**
	 * 获得登录的view
	 * @return
	 */
	public UiObject getLoginImageView() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar");
	}
	
	/**
	 * 点击登录按钮
	 */
	public void clickLoginImageView(){
		try {
			getLoginImageView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获得收藏的view
	 * @return
	 */
	public UiObject getFavoritesRL(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_pc_profile_collect");
	}

	/**
	 * 点击收藏按钮
	 */
	public void clickFavoirtesRL(){
		try {
			getFavoritesRL().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UiObject getSettings() {
		return UiObjectHelper
				.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_pc_main_setting");
	}
	
	public void clickSettings(){
		try {
			getSettings().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
