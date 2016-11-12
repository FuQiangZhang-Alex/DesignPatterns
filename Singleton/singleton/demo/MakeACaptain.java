package singleton.demo;

// not thread safe

public class MakeACaptain {
	
	private static MakeACaptain _captain = null;
	private MakeACaptain() {}
	
	// lazy initialization
	public static MakeACaptain getCaptain(){
		if (_captain == null) {
			_captain = new MakeACaptain();
			System.out.println("we create one");
		} else {
			System.out.println("we have one");
		}
		return _captain;
	}

}
