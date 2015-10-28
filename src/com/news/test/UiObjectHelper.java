package com.news.test;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

public class UiObjectHelper {
	/**
	 * 通过文本定位的方法
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByText(String text){
		UiObject object = new UiObject(new UiSelector().text(text));
		return object;
	}
	
	/**
	 * 通过类名定位的方法
	 * @param className
	 * @return
	 */
	public static UiObject getUiObjectByClassName(String className){
		UiObject object = new UiObject(new UiSelector().className(className));
		return object;
	}
	
	/**
	 * 通过ID定位的方法
	 * @param id
	 * @return
	 */
	public static UiObject getUiObjectByResourceId(String id){
		UiObject object = new UiObject(new UiSelector().resourceId(id));
		return object;
	}
	
	/**
	 * 通过Content Description定位的方法
	 * @param des
	 * @return
	 */
	public static UiObject getUiObjectByContentDes(String des){
		UiObject object = new UiObject(new UiSelector().description(des));
		return object;
	}
	
	/**
	 * 结合类名和文本一起定位的方法
	 * @param className
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByBothClassNameAndText(String className,String text){
		UiObject object = new UiObject(new UiSelector().className(className).text(text));
		return object;
	}
	
	/**
	 * 拥有相同id的不同控件的获取方法
	 * @param id
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByIdAndInstanceIndex(String id,int index){
		return new UiObject(new UiSelector().resourceId(id).instance(index));
	}
	
	/**
	 * 获取滚动对象的方法，可以指定水平或者竖直滚动，true表示水平滚动，false表示竖直滚动
	 * @param isHorizontal
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiScrollable getScrollList(boolean isHorizontal) throws UiObjectNotFoundException{
		UiScrollable scrollView = new UiScrollable(
				new UiSelector().scrollable(true));
		if(isHorizontal)
			scrollView.setAsHorizontalList();
		else
			scrollView.setAsVerticalList();
		return scrollView;
	}

	/**
	 * 获取滚动对象下的子对象的方法
	 * @param scrollView
	 * @param text
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiObject scrollToGetChild(UiScrollable scrollView, String text) throws UiObjectNotFoundException{
		return scrollView.getChild(new UiSelector().text(text));
	}
	
	/**
	 * 通过类型名获得指定UiObject
	 * @param clsName
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByClassNameAndInstanceIndex(String clsName,int index){
		return new UiObject(new UiSelector().className(clsName).instance(index));
	}

}
