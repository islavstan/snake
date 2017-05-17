package com.islavstan.games;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;


public class BodyPart {
    private int x, y, snakeX, snakeY;
    private Texture texture;

    public BodyPart(Texture texture, int snakeX, int snakeY) {
        this.snakeX = snakeX;
        this.snakeY = snakeY;
        this.texture = texture;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void updateBodyPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Batch batch) {
        if (!(x == snakeX && y == snakeY))
            batch.draw(texture,
                    x, y);
    }
}