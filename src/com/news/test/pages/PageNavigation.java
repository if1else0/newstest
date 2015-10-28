package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageNavigation {
	
	/**
	 * 获得阅读tab页
	 * @return
	 */
	public UiObject getReadTab(){
		return  UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab",1);
	}
	
	/**
	 * 获得我tab页
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public UiObject getMyTab() throws UiObjectNotFoundException {
		return  UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab",4);
	}
	  
	/**
	 * 获得新闻tab页
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public UiObject getNewsTab() throws UiObjectNotFoundException{
		return  UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab",0);
	}
	
	
	/**
	 * 切换到我tab页的方法
	 */
	public void goToMySettingsTab(){
		try {
			getMyTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 切换到新闻tab页的方法
	 */
	public void goToNewsTab(){
		try {
			getNewsTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
