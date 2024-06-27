public class A26_word_search {
    static boolean f=false;
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == word.charAt(0)) {
                    findword(maze, i, j, word, 0);
                    if (f == true) {
                        System.out.println(f);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }

    public static void findword(char[][] maze, int cr, int cc, String word, int idx) {
        if (idx == word.length()) {
            f=true;
            return;
        }
        if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] != word.charAt(idx)) {
            return;
        }

        char temp = maze[cr][cc];
        maze[cr][cc] = '*'; // Mark the cell as visited
        findword(maze, cr - 1, cc, word, idx + 1) ; //up
        findword(maze, cr + 1, cc, word, idx + 1); //down
        findword(maze, cr, cc - 1, word, idx + 1); //left
        findword(maze, cr, cc + 1, word, idx + 1); //right 

        maze[cr][cc] = temp; // Unmark the cell
    }
}
