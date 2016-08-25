/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.map.pkgfor.the.game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Глеб
 */
public class Tile extends Canvas{
        private int posX;
	private int posY;

	private String path;
	public void setPath(String path){
		this.path = path;
	}
	public void setLocation(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public Image setImage(String path) throws IOException {

		File file = new File(path);
		Image image = ImageIO.read(file);
		return image;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Image image = null;
		try {
			image = setImage(path);
		} catch (IOException e) {

			e.printStackTrace();
		}
		super.paint(g);

		g.drawImage(image, posX, posY, this);
	}
        public String getPath(){
            return path;
        }

    
}
