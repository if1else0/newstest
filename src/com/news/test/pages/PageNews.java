package com.news.test.pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

public class PageNews {
	
	/**
	 * 获得指定行的新闻标题
	 * @param index
	 * @return
	 */
	public UiObject getNewsTitle(int index) {
		return UiObjectHelper
				.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/title",index);
	}
	
	/**
	 * 获得指定行的标题文本
	 * @param index
	 * @return
	 */
	public String getNewsTitleText(int index){
		String newsTitle = null;
		try {
			newsTitle =  getNewsTitle(index).getText().toString();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsTitle;
	}
	
	/**
	 * 点击指定行的新闻标题
	 * @param index
	 */
	public void clickNewTitle(int index){
		try {
			getNewsTitle(index).clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
