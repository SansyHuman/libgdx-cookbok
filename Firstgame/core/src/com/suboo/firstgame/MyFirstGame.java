package com.suboo.firstgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

public class MyFirstGame extends ApplicationAdapter
{
	private Logger logger;
	private boolean renderInterrupted = true;
	
	@Override
	public void create ()
	{
		logger = new Logger("Application lifecycle", Logger.INFO);
		logger.info("create");
	}

	@Override
	public void render ()
	{
		if (renderInterrupted)
		{
			logger.info("render");
			renderInterrupted = false;
		}
	}
	
	@Override
	public void dispose ()
	{
		logger.info("dispose");
	}
	
	@Override
	public void resize(int width, int height)
	{
		logger.info("resized");
		renderInterrupted = true;
	}
	
	@Override
	public void pause()
	{
		logger.info("pause");
		renderInterrupted = true;
	}
	
	@Override
	public void resume()
	{
		logger.info("resume");
		renderInterrupted = true;
	}
}