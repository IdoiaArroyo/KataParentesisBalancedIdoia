package KataParentesis;

public class StringForBalanced implements StringComprobate{
	
	public String data;
	
	public StringForBalanced(String data){
		this.data = data;
	}
	
	public String getData(){
		return this.data;
	}
	
	public void setData(String newValue){
		data = newValue;
	}
	
	public int getSizeOfData(){
		return this.data.length();
	}
	
	public char getCharAt(int idx){
		return this.data.charAt(idx);
	}
	
	@Override
	public boolean isOpen(char c) {
		return c == '(';
	}

	@Override
	public boolean isClosed(char c) {
		return c == ')';
	}


}
