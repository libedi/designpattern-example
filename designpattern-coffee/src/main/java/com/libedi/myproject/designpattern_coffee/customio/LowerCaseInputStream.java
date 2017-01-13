package com.libedi.myproject.designpattern_coffee.customio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 소문자로 바꿔주는 입력 데코레이터 클래스
 * : 모든 InputStream 의 추상 데코레이터인 FilterInputStream 을 확장한다.
 * @author libedi
 *
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i = offset; i< offset + result; i++){
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
