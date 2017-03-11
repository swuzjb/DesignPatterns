package site.zhanjingbo.DecoratorPattern.demo;

public class DoubleEncrypt extends DecoratorEncrypt {
	private Encrypt encrypt;

	public DoubleEncrypt(Encrypt encrypt) {
		super(encrypt);
		this.encrypt = encrypt;
	}

	@Override
	public String encrypt(String str) {
		return this.encrypt.encrypt(str) + "然后再次加密";
	}

}
