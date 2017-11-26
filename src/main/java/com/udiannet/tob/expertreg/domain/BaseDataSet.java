package com.udiannet.tob.expertreg.domain;

import java.util.List;
import java.util.Map;

/**
 * 基础数据集
 */
public class BaseDataSet
{
	/**
	 * 政治面貌
	 */
	private List<String> politicalStatusList;
	/**
	 * 学历
	 */
	private List<String> educationList;
	/**
	 * 从事行业类型
	 */
	private Map<Integer, String> professionKindMap;
	/**
	 * 从事行业
	 */
	private List<String> professionList;
	
	public final List<String> getPoliticalStatusList()
	{
		return politicalStatusList;
	}
	public final void setPoliticalStatusList(List<String> politicalStatusList)
	{
		this.politicalStatusList = politicalStatusList;
	}
	public final List<String> getEducationList()
	{
		return educationList;
	}
	public final void setEducationList(List<String> educationList)
	{
		this.educationList = educationList;
	}
	public final Map<Integer, String> getProfessionKindMap()
	{
		return professionKindMap;
	}
	public final void setProfessionKindMap(Map<Integer, String> professionKindMap)
	{
		this.professionKindMap = professionKindMap;
	}
	public final List<String> getProfessionList()
	{
		return professionList;
	}
	public final void setProfessionList(List<String> professionList)
	{
		this.professionList = professionList;
	}
}
