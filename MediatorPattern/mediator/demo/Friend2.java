package mediator.demo;

public class Friend2 extends Friend{
	public Friend2(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}
	
	public void Send(String msg) {
		this.mediator.Send(this, msg);
	}
	
	public void Notify(String msg) {
		System.out.println("Sohel gets message: " + msg);
	}
}
