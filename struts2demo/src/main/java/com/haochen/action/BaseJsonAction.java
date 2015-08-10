package com.haochen.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @title
 * @Description 属性作为json格式参数时必需要有set方法，作为json格式返回值时必需要有get方法
 * @author chenhao
 * @date 2014年12月3日 上午10:14:48
 * @version 1.0
 */
public abstract class BaseJsonAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8670042218701228785L;

	protected static final String JSON = "json";
	private Object data;
	private boolean success;
	private int errorCode;
	private String errorMsg;

	@Override
	public abstract String execute() throws Exception;

	public void success() {
		this.success = true;
	}

	public void success(Object data) {
		this.data = data;
		this.success = true;
	}

	public void fail() {
		this.success = false;
	}

	public void fail(int errorCode, String errorMsg) {
		this.success = false;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public Object getData() {
		return data;
	}

	public boolean isSuccess() {
		return success;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

}
