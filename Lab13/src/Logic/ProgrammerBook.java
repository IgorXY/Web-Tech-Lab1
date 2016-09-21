package Logic;

public class ProgrammerBook extends Book{
	private String language;
	private int level;
	
	public void setLanguage(String language){
		this.language = language;
	}
	
	public String getLanguage(){
		return language;
	}
	
	public void setLevel(int level){
		if(level>0)
			this.level = level;
	}
	
	public int getLevel(){
		return level;
	}
	
	public boolean equals(ProgrammerBook book){
		if(super.equals(book) == false)
			return false;		
		if(!(this.language.equals(book.getLanguage())))
			return false;
		if(this.level != book.getLevel())
			return false;
		return true;
	}
	
	public int hashCode(){
		int res = 0;
		res = super.hashCode();
		for(int i =0 ;i<language.length(); i++)
			res+=language.codePointAt(i);
		res+=(level * 31) % 65536;
		return res;
	}
	
	public String toString(){
		String res = super.toString();
		res += ", Language: \""+language+"\", ";
		res += "Level: "+level;
		return res;
	}
	
}
