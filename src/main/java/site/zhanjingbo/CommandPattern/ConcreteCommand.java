package site.zhanjingbo.CommandPattern;

/**
 * 具体的命令实现类
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteCommand extends Command {
	/**
	 * 命令接收者
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
