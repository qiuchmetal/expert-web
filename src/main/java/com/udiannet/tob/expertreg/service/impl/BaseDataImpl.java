package com.udiannet.tob.expertreg.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.udiannet.tob.expertreg.mapper.BaseDataMapper;
import com.udiannet.tob.expertreg.service.BaseData;
/**
 * 获取基础数据
 */
public class BaseDataImpl implements BaseData
{
	private SqlSession sqlSession = SessionFactoryManager.openSession();

	/**
	 * 获取“基础数据：政治面貌”列表
	 */
	@Override
	public List<String> getPoliticalStatusList()
	{
		BaseDataMapper mapper = sqlSession.getMapper(BaseDataMapper.class);
		return mapper.findAllPoliticalStatus();
	}

	/**
	 * 获取“基础数据：学历”列表
	 */
	@Override
	public List<String> getEducationList()
	{
		BaseDataMapper mapper = sqlSession.getMapper(BaseDataMapper.class);
		return mapper.findAllEducation();
	}

	/**
	 * 获取“基础数据：从事行业类别”列表
	 */
	@Override
	public List<Map<Integer, String>> getProfessionKindMap()
	{
		BaseDataMapper mapper = sqlSession.getMapper(BaseDataMapper.class);
		return mapper.findAllProfessionKind();
	}

	/**
	 * 根据“从事行业类别”，获取“基础数据：从事行业”列表
	 */
	@Override
	public List<String> getProfessionList(int kindId)
	{
		BaseDataMapper mapper = sqlSession.getMapper(BaseDataMapper.class);
		return mapper.findProfessionByKindId(kindId);
	}

}
