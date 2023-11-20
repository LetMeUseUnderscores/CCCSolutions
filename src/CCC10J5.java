import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CCC10J5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rStart = sc.nextInt()-1;
		int cStart = sc.nextInt()-1;
		int rEnd = sc.nextInt()-1;
		int cEnd = sc.nextInt()-1;
		int[][] step = new int[8][8];
		for(int i = 0; i < 8; i++) {
			Arrays.fill(step[i],Integer.MAX_VALUE);
		}
		step[rStart][cStart] = 0;
		LinkedList<Integer> rQ = new LinkedList<Integer>();
		LinkedList<Integer> cQ = new LinkedList<Integer>();
		rQ.add(rStart);
		cQ.add(cStart);
		while(!rQ.isEmpty()) {
			int r = rQ.poll();
			int c = cQ.poll();
			if (r-2>=0 && c+1<8 && step[r-2][c+1]>step[r][c]+1) {
				step[r-2][c+1] = step[r][c]+1;
				rQ.add(r-2);
				cQ.add(c+1);
			}
			if(r-1>=0 && c+2<8 && step[r-1][c+2]>step[r][c]+1){ 
				step[r-1][c+2] = step[r][c]+1;
				rQ.add(r-1);
				cQ.add(c+2);
			}
			if (r+1<8 && c+2<8 && step[r+1][c+2]>step[r][c]+1){
				step[r+1][c+2] = step[r][c]+1;
				rQ.add(r+1);
				cQ.add(c+2);
			}
			if (r+2<8 && c+1<8 && step[r+2][c+1]>step[r][c]+1){
				step[r+2][c+1] = step[r][c]+1;
				rQ.add(r+2);
				cQ.add(c+1); 
			}
			if (c-1>=0 && r+2<8 && step[r+2][c-1]>step[r][c]+1){
				step[r+2][c-1] = step[r][c]+1;
				rQ.add(r+2);
				cQ.add(c-1);
			}
			if(r+1<8 && c-2>=0 && step[r+1][c-2]>step[r][c]){
				step[r+1][c-2] = step[r][c]+1;
				rQ.add(r+1);
				cQ.add(c-2);
			}
			if (r-1 >= 0 && c-2 >= 0 && step[r-1][c-2] > step[r][c]+1){
				step[r-1][c-2] = step[r][c]+1;
				rQ.add(r-1);
				cQ.add(c-2);
			}
			if(r-2>=0 && c-1>=0 &&step[r-2][c-1]>step[r][c]+1){
				step[r-2][c-1] = step[r][c]+1;
				rQ.add(r-2);
				cQ.add(c-1);
			}

		}
		System.out.println(step[rEnd][cEnd]);
	}

}
