package arr;

import java.util.ArrayList;
import java.util.List;

public class Spiral {

	static int row = 3;
	static int col = 6;
	static int[][] flag = new int[row][col];
	static int a[][] = { 
			{1,  2,  3,  4,  5,  6},
            {7,  8,  9,  10, 11, 12},
            {13, 14, 15, 16, 17, 18}
          };
	static boolean travel = true;
	public static void main(String[] args) {
		for(int x = 0;x<3;x++){
			for(int y = 0;y<6;y++){
				flag[x][y] = 0;
			}
		}
		int i=-1;
		int j=-1;
		while(travel){
			printRow(i, j, "right");
		}
	}
	
	static List<Integer> printRow(int x, int y, String flow){
		while(travel){
		List<Integer> ret = new ArrayList<>();
		if(flow.equals("right")){
			x++;
			y++;
			int i = 0;
			while(flag[x][i]!=0 || i<col ){
				if(i<col){
					if(flag[x][i]!=0){
						System.out.println(a[x][i]);
						flag[x][i]=1;
						i++;
					}else if(flag[x][i]==0){
						ret.add(x);
						ret.add(i);
						return ret;
					}
				}else {
					ret.add(x);
					ret.add(i);
					return ret;
				}
			}
		}else if(flow.equals("down")){
			for(int i=x+1;i<row;x++){
				if(flag[i][y]!=0){
					System.out.println(a[i][y]);
					flag[i][y]=1;
				}else if(flag[i][y]==0){
					//ret.add()
				}
			}
			flow = "left";
		}else if(flow.equals("left")){
			for(int i=x+1;i<row;x++){
				System.out.println(a[i][y]);
			}
		}else if(flow.equals("up")){
			
		}
		//ret.add(e)
		return ret;
		
	}
		return null;}
}
