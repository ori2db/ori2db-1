package com.c2uol.base.utils;

import org.junit.Test;

import com.c2uol.base.constants.NetworkConstants;
import com.c2uol.base.enums.HttpClientMethod;

public class NetworkKitTester {

	@Test
	public void testHttpConnection() {
		HttpClient networkKit = HttpClient.newInstance();
		byte[] str = networkKit.httpUrlConnection("http://www.baidu.com/", HttpClientMethod.POST, "Hello world!", null, 0, 0);
		System.out.println(new String(str));
	}
}
