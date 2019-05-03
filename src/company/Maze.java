package company;

public class Maze {
    private static int N=8;
    private static int [][] maze = {
            {0,0,0,0,0,0,0,1}, //8x8 셀
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0},
    };

    private static  final  int PATHWAY_COLOUR = 0; //white 길
    private static  final  int WALL_COLOUR = 1;  //blue 막힌길
    private static  final  int BLOCKED_COLOUR = 2; //red 갔더니 막힌길
    private static  final  int PATH_COLOUR =3; //green 아직 가보지 않은 길



    public static  boolean findMazePath(int x, int y) {

        if(x<0 || y<0 || x>=N || y>=N) // 미로 바같 영역 리턴 false;
            return false;
        else if (maze[x][y] !=PATHWAY_COLOUR) // 길이 아니라면 리턴 false;
            return false;
        else if (x==N-1 && y==N-1) {
            maze[x][y] = PATH_COLOUR; // 아직 가보지 않은 길 리턴 truel
            return  true;

        }
        else{
            maze[x][y] = PATH_COLOUR;
            if(findMazePath(x-1,y)||findMazePath(x,y+1)||findMazePath(x+1,y)||findMazePath(x,y-1))
                return true;
        }
        maze[x][y] = BLOCKED_COLOUR; //dead end 가다가 길이 막히면 리턴 false; 다시 돌리기
        return false;

    }

    public static void printMaze() {
        for (int i =0; i< maze.length; i++) {
            for(int j =0; j< maze[i].length; i ++) {
                System.out.print(maze[i][j]);

                //한 줄이 끝이 아닐때
                if(j != maze[i].length-1) {
                    System.out.println(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        findMazePath(0,0);
        printMaze();

    }


}
