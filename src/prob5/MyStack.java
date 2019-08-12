package prob5;

public class MyStack<T> {
	private int top = -1;
	private String[] buffer;

	public MyStack(int size) {
		// TODO Auto-generated constructor stub
		//MyStack[] stack = new MyStack[i];
		buffer = new String[size];
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public String[] getBuffer() {
		return buffer;
	}

	public void setBuffer(String[] buffer) {
		this.buffer = buffer;
	}

	public void push(String string) {
		// TODO Auto-generated method stub
		if(top >= buffer.length-1) {
			String[] newbuffer= new String[buffer.length*2];
			for(int i=0;i<buffer.length;++i) 
				newbuffer[i]=buffer[i];
			buffer=newbuffer;
		}
		top+=1;
		buffer[top] = string;
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub	
		return (top==-1);
	}

	public String pop() throws Exception {
		// TODO Auto-generated method stub
		if(top < 0) {
			throw new MyStackException("My stack Empty");
		}
		return buffer[top--];

	}

}