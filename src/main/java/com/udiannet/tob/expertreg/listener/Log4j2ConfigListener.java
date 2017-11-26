package com.udiannet.tob.expertreg.listener;

import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.logging.log4j.core.config.Configurator;

/**
 * 加载 log4j2.xml 的监听器
 */
@WebListener
public class Log4j2ConfigListener implements ServletContextListener
{
	private static final String KEY = "log4j.configurationFile";

	@Override
	public void contextInitialized(ServletContextEvent arg0)
	{
		String fileName = getContextParam(arg0);
		Configurator.initialize("Log4j2", "classpath:" + fileName);
		System.out.println("log4j2 加载路径："+fileName);
	}

	private String getContextParam(ServletContextEvent event)
	{
		Enumeration<String> names = event.getServletContext().getInitParameterNames();
		while (names.hasMoreElements())
		{
			String name = names.nextElement();
			String value = event.getServletContext().getInitParameter(name);
			if (name.trim().equals(KEY))
			{
				return value;
			}
		}
		return null;
	}
}
