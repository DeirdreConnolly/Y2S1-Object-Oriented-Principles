public class Player {
	
	private String name;
	private String code = "";
	
	public Player(String name) {
		this.name = name;
		char space = ' ';
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				char j = name.charAt(i);
				this.code = this.code + j;
			}
			
			else if (name.charAt(i - 1) == space) {
				char j = name.charAt(i);
				this.code = this.code + j;
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
