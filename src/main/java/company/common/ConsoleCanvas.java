package company.common;

public class ConsoleCanvas extends Canvas {
    char[][] array;
    int x;
    int y;

    public void init(int x, int y, char ch) {
        this.x = x;
        this.y = y;
        array = new char[x][y];
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                array[i][j] = ch;
            }

    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }

    @Override
    public void drawArray() {

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
