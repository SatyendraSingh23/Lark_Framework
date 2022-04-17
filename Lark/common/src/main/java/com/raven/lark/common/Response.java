package com.raven.lark.common;
public class Response  implements java.io.Serializable 
{
	private boolean success;
	private Object result;
	private Throwable exception;
	public void setException(Throwable exception)
	{
		this.exception=exception;
	}
	public Throwable getException()
	{
		return this.exception;
	}
	public void setResult(Object result)
	{
		this.result=result;
	}
	public Object getResult()
	{
		return  this.result;
	}
	public void setSuccess(boolean success)
	{
		this.success=success;
	}
	public boolean getSuccess()
	{
		return this.success;
	}
	public boolean hasException()
	{
		return this.success==false;
	}
}