package com.udiannet.tob.expertreg.service;

import java.util.List;
import java.util.Map;

/**
 * 获取基础数据
 */
public interface BaseData
{
	/**
	 * 获取“基础数据：政治面貌”列表
	 */
	List<String> getPoliticalStatusList();

	/**
	 * 获取“基础数据：学历”列表
	 */
	List<String> getEducationList();

	/**
	 * 获取“基础数据：从事行业类别”列表
	 */
	List<Map<Integer, String>> getProfessionKindMap();

	/**
	 * 根据“从事行业类别”，获取“基础数据：从事行业”列表
	 */
	List<String> getProfessionList(int kindId);
}
