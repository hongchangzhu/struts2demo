package com.haochen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class Test {
	public static final String CLASSPATTERN = "classpath*:com/haochen/action/*Action";

	public static void main(String[] args) {
		// List<String> classNames = ClassFinder.getClassNames(CLASSPATTERN);
		// for (String className : classNames) {
		// System.out.println(className);
		// }
		// Observer obs;
		// List list = new ArrayList();
		StringBuffer sb = new StringBuffer();
		sb.append(" fkdsjflk");
		sb.append("or");
		System.out.println(sb.delete(sb.length() - 2, sb.length()));
	}

	public static Resource[] getClassPathResource(String locationPattern) {
		ResourcePatternResolver rpr = new PathMatchingResourcePatternResolver();
		try {
			return rpr.getResources(locationPattern);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Resource[0];
	}

	private static class ClassFinder {
		private static final String search = "com/haochen/";

		public static List<String> getClassNames(String pattern) {
			List<String> resouceArray = new ArrayList<String>();
			pattern = pattern.trim();
			if (!pattern.endsWith(".class")) {
				pattern = pattern + ".class";
			}
			try {
				Resource[] rs = getClassPathResource(pattern);
				for (Resource c : rs) {
					String realPath = c.getURL().getPath();
					String path = "";
					int start = realPath.indexOf("jar!");
					if (start != -1) {
						path = realPath.substring(start + "jar!".length() + 1);
					}
					start = realPath.indexOf("classes");
					if (start != -1) {
						path = realPath.substring(start + "classes".length() + 1);
					}

					start = realPath.indexOf(ClassFinder.search);
					if (start == -1) {
						continue;
					}
					path = realPath.substring(start);

					path = path.replace(".class", "");
					path = path.replace("/", ".");
					resouceArray.add(path);
				}
			} catch (IOException e) {

			}
			return resouceArray;
		}
	}
}
