package gr.aueb.cf.ch16.skeletal2;

import gr.aueb.cf.ch16.skeletal2.AbstractRectangle;

public class Square extends AbstractRectangle implements ISquare {

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
