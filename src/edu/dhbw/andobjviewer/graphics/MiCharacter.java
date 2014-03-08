package edu.dhbw.andobjviewer.graphics;

import javax.microedition.khronos.opengles.GL10;

import edu.dhbw.andar.ARToolkit;
import edu.dhbw.andar.exceptions.AndARException;
import edu.dhbw.andobjviewer.models.Model;

public class MiCharacter extends Model3D{
	public Model3D selected;
	public HP hp;
	ARToolkit artoolk;
	
	public MiCharacter(Model model, String pattern_file, HP Hp) throws AndARException {
		super(model, pattern_file);
		this.hp = Hp;
	}
	
	/*@Override
	public void draw(GL10 gl) {
		super.draw(gl);
		selected.model.setYrot(10.0f);
	}*/

}
