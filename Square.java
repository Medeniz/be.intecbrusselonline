package hooftstuk10;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    public Square(int x, int y, int side) {
        super(side, side, x, y);
    }

    private int getSide() {
        return super.getHeight();
    }

    void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(int height) {
        this.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        this.setWidth(width);
    }


}











