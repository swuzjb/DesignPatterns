package site.zhanjingbo.DecoratorPattern.demo;

public class SimpleEncrypt extends Encrypt {

	@Override
	public String encrypt(String str) {
		return "这是简单加密后的字符串";
	}

}
