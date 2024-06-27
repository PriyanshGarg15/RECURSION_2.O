import java.util.Scanner;

public class A25_rat_chase_cheese{
    static boolean f=false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
        //taking input of board
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next(); //give only capital o and capital x
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);

			}

		}

		int[][] ans = new int[n][m];
		PrintPath(maze, 0, 0, ans);
        if(f==false){
            System.out.println("NO PATH FOUND");
        }

	}

	public static void PrintPath(char[][] maze, int cr, int cc, int[][] ans) {
		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			if (maze[cr][cc] == 'O') {
                f=true;
				ans[cr][cc] = 1;
				display(ans);
				ans[cr][cc] = 0;
			}
			return;
		}

		if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
			return;
		}

        maze[cr][cc] = 'X';
		ans[cr][cc] = 1;

		PrintPath(maze, cr, cc + 1, ans);// right
		PrintPath(maze, cr - 1, cc, ans);// up
		PrintPath(maze, cr, cc - 1, ans);// left
		PrintPath(maze, cr + 1, cc, ans);// down

		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();

		}

	}

}