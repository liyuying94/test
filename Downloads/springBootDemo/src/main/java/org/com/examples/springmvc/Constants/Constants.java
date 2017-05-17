package org.com.examples.springmvc.Constants;



public class Constants {
	/**
	 * 直播转码任务组状态
	 */
	public static final int TRANS_STATUS_1=1;//1录制任务待下发
	public static final int TRANS_STATUS_2=2;//2录制任务下发中
	public static final int TRANS_STATUS_3=3;//3录制任务下发完成转码中
	public static final int TRANS_STATUS_4=4;//4停止录制
	public static final int TRANS_STATUS_11=11;//11停止录制任务待下发
	public static final int TRANS_STATUS_12=12;//12停止录制任务下发中
	public static final int TRANS_STATUS_13=13;//13停止录制任务失败
	public static final int TRANS_STATUS_21=21;//21重启录制任务待下发
    public static final int TRANS_STATUS_22=22;//22重启录制任务下发中
	
	/**
	 * 是否存在待下发任务
	 */
	public static final int ISTASK_EXIST=1;//有待下发任务
	public static final int ISTASK_NOEXIST=2;//没有待下发任务
	
	/**
	 * CODE返回结果
	 */
	public static final int CODE_SUCCESS=0;//成功
	public static final int CODE_FAIL=1;//失败
	
	/**
	 * MESSAGE返回结果
	 */
	public static final String MSG_SUCCESS="success";//成功
	public static final String MSG_FAIL="fail";//失败
	
	/**
	 * 直播转码状态
	 */
	public static final int STATUS_SUCCESS=1;//可用
	public static final int STATUS_FAIL=2;//不可用
	
	/**
	 * 直播转码是否已删除
	 */
	public static final int ISDELETE_YES=1;//被删除
	public static final int ISDELETE_NO=2;//未删除
	
	/**
	 * 是否停止任务
	 */
	public static final int ISSTOP_YES=1;//需要
	public static final int ISSTOP_NO=2;//不需要
	
	/**
	 * 任务处理结果
	 */
	public static final int TASK_HANDLE_SUCCESS=1;//任务创建成功
	public static final int TASK_HANDLE_NO_SAVE=2;//存储挂载不上
	public static final int TASK_HANDLE_NO_FAIL=3;//任务创建失败
	/**
	 * 1:非专属 2:专属
	 */
	public static final int IS_EXCLUSIVE=2;//专属任务
	public static final int NO_EXCLUSIVE=1;//非专属任务
	
	
	
}

