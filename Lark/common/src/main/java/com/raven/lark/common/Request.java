package com.raven.lark.common;
public class Request implements java.io.Serializable
{
	private Object [] arguments;
	private String action;
	private String servicePath;
	public void setArguments(Object ...arguments)
	{
		this.arguments=arguments;
	}
	public Object [] getArguments()
	{
		return this.arguments;
	}
	public void setAction(String action)
	{
		this.action=action;
	}
	public void setServicePath(String path)
	{
		this.servicePath=path;
	}
	public String getServicePath()
	{
		return this.servicePath;
	}
	public String getAction()
	{
		return this.action;
	}
	
}