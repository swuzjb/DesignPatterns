package site.zhanjingbo.CommandPattern;

/**
 * 调用者
 * 
 * @author zhanjingbo
 *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void call() {
		this.command.execute();
	}
}
