package com.udiannet.tob.expertreg.mapper;

import java.util.List;
import java.util.Map;

/**
 * 基础数据相关
 */
public interface BaseDataMapper
{
	/**
	 * 获取政治面貌列表
	 */
	List<String> findAllPoliticalStatus();
	/**
	 * 获取学历列表
	 */
	List<String> findAllEducation();
	/**
	 * 获取从事行业类别列表
	 */
	List<Map<Integer, String>> findAllProfessionKind();
	/**
	 * 根据从事行业类别，获取从事行业列表
	 */
	List<String> findProfessionByKindId(int pr_id);
}
