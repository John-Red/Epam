package company.common;

public abstract class Canvas {


    public abstract void setTextAt(int fromLeft, int fromTop, String text);

    public abstract void drawText(String text);

    public abstract void setSquareAt(int x, int y, int size, boolean filled);
}