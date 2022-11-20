
public class ZigzgTest1 {
	public static void main(String[] args) {
		
		int[][] a = new int[4][5];
		int count = 0;
		
		for(int i=0;i<4;i++) {	//행
//			짝수행은 숫자가 왼쪽에서 오른쪽으로 채워지고 홀수행은 숫자가 오른쪽에서 왼쪽으로 채워진다.
			if(i % 2 ==0) {
			
				for(int j=0; j<5;j++) {  //열
					a[i][j] = ++count;
				}
				
		}else {
			for(int j=4;j>=0;j--) { //열
				a[i][j] = ++count;
				}
			}	
		}
		for(int i=0;i<4;i++) {
			for(int j=0; j<5;j++) {
				System.out.printf("%2d ",a[i][j]);
			}
			System.out.println();
		}
	}
}
