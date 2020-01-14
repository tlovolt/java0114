package java0114;

public class Main1 {

	public static void main(String[] args) {
		try {
			int [] ar = {100, 300};
			System.out.println(ar[2]); //ArrayIndexOutOfBoundsException 발생
		}
		//Exception 클래스가 ArrayIndexOutOfBoundsException 의 상위 클래스라서
		//예외가 발생하면  Exception이 처리
		//아래 catch 구문은 도달할 수 없는 코드가 됩니다.
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다.");
			//예외 메시지 내용을 출력
			//출력하는 텍스트 색상을 변경하기 위해서 out 대신에 err 사용
			System.err.println(e.getMessage());
		}

	}

}
