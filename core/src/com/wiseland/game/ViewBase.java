package com.wiseland.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Javier Miller on 01/05/2016.
 */
public abstract class ViewBase implements IView {

    protected SpriteBatch sprite;

    public ViewBase(SpriteBatch sprite){

        this.sprite = sprite;

    }

}
