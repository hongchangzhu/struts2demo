package com.haochen.parser;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("googleHtmlParser")
public class GoogleHtmlParser extends AbstractHtmlParser {

	@Override
	public List<String> parse() {
		hibernateDao.save(new Object());
		return null;
	}

}
