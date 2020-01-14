package java0114;

public class Main2 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println("Hello Exception");
			try {
				//sleep 메소드는 InterruptedException 이 발생할 가능성이 있으므로
				//이 예외에 대한 처리를 해야주어야만 합니다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = i + 1;
		}
		
	}

}
