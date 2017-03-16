package site.zhanjingbo.AdapterPattern;

/**
 * 适配器
 * 
 * @author zhanjingbo
 *
 */
public class Adapter implements Target {

	// 适配者
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specilRequest();
	}

}
