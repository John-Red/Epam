package company.common;

public class ConsoleCanvas extends Canvas {

    private char[][] pixels;
    private int width;
    private int height;

    public ConsoleCanvas(int width, int height) {
        this.height = height;
        this.width = width;
        init();
    }

    public void init() {
        pixels = new char[height][width];
        reset();
    }

    private void reset() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j] = ' ';
            }
        }
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(pixels[i][j] + " ");
            }
        }
    }


    public void setSymbolAt(int x, int y, char symbol) {
        pixels[x][y] = symbol;
    }

    @Override
    public void setSquareAt(int fromTop, int fromLeft, int size, boolean filled) {
        if (filled) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    setSymbolAt(fromTop + j, fromLeft + i, '#');
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (i == 0 || i == size - 1) {
                    for (int j = 0; j < size; j++) {
                        setSymbolAt(fromTop, fromLeft, '#');
                        fromLeft++;
                    }

                } else {
                    setSymbolAt(fromTop, fromLeft, '#');
                    fromLeft++;
                    for (int j = 0; j < size - 2; j++) {
                        fromLeft++;
                    }
                    setSymbolAt(fromTop, fromLeft, '#');
                    fromLeft++;
                }
                fromTop++;
                fromLeft -= size;
            }
        }
    }


    public void setRectangleAt(int fromTop, int fromLeft, int weight, int height, boolean filled) {
        if (filled) {
            for (int i = 0; i < weight; i++) {
                for (int j = 0; j < height; j++) {
                    setSymbolAt(fromTop + j, fromLeft + i, '#');
                }
            }
        } else {
            for (int i = 0; i < height; i++) {
                if (i == 0 || i == height - 1) {
                    for (int j = 0; j < weight; j++) {
                        setSymbolAt(fromTop, fromLeft, '#');
                        fromLeft++;
                    }

                } else {
                    setSymbolAt(fromTop, fromLeft, '#');
                    fromLeft++;
                    for (int j = 0; j < weight - 2; j++) {
                        fromLeft++;
                    }
                    setSymbolAt(fromTop, fromLeft, '#');
                    fromLeft++;
                }
                fromTop++;
                fromLeft -= weight;
            }
        }
    }


    public void drawCircleAt(int x, int y, int radius) {

    }

    @Override
    public void setTextAt(int fromLeft, int fromTop, String text) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            pixels[fromTop][fromLeft + i] = text.charAt(i);
        }

    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }
}