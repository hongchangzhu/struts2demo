package com.haochen.parser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.haochen.dao.IHibernateDao;

public abstract class AbstractHtmlParser {
	@Autowired
	protected IHibernateDao hibernateDao;

	public void setHibernateDao(IHibernateDao hibernateDao) {
		this.hibernateDao = hibernateDao;
	}

	public abstract List<String> parse();
}
