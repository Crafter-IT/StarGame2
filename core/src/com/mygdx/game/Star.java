package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Star extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture fon;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		fon = new Texture("fon.jpg");
	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(0.3f, 0.6f, 0.5f, 1);


		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(fon, 0, 0);
		batch.draw(img, 180, 120);

		batch.end();
	}


	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		fon.dispose();
	}
}
