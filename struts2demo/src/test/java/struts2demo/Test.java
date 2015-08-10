package struts2demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.haochen.SHA1;

public class Test {

	public static void main(String[] args) {
		long timestamp = System.currentTimeMillis();
		String echostr = "ae9dji";
		String nonce = "58";
		String Token = "0792chcpe0823";
		List<String> params = new ArrayList<String>();
		params.add(Token);
		params.add(new Long(timestamp).toString());
		params.add(nonce);
		// 1. 将token、timestamp、nonce三个参数进行字典序排序
		Collections.sort(params, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		String signature = SHA1.encode(params.get(0) + params.get(1) + params.get(2));
		System.out.println(new Long(timestamp).toString());
		System.out.println(signature);

		String KEY_FILE_PATH = Test.class.getResource("/conf/cer").getFile();
		System.out.println(KEY_FILE_PATH);
		File file = new File(KEY_FILE_PATH, "10000.p12");
		System.out.println(file.getAbsolutePath());
	}

}
