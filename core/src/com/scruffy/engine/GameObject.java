package com.scruffy.engine;

import java.util.List;

/**
 * Created by javie on 02/05/2016.
 */
public class GameObject implements IGameObject {

    List<IGameObject> objects;

    public List<IGameObject> getObjects(){
        return this.objects;
    }

    @Override
    public void render() {

        for(IGameObject obj : objects){
            obj.render();
        }

        this.onRender();
    }

    protected void onRender(){

    }
}
