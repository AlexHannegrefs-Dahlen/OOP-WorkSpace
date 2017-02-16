import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

public class StreetLight implements ActionListener {
	public static final int LIGHT_DELAY = 2000;

	private StreetLightColor color;

	private Timer timer;
	
	private	ArrayList<IStreetLightSub> subs = new ArrayList<>();

	public StreetLight() {
		this.setColor(StreetLightColor.Red);
		this.timer = new Timer(LIGHT_DELAY, this);
		this.timer.start();
	}
	
	public void subscribe(IStreetLightSub newSub){
		if(newSub != null){
			subs.add(newSub);
		}
	}
	/**
	 * @return the color
	 */
	public StreetLightColor getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(StreetLightColor color) {
		if (color == null) {
			throw new IllegalArgumentException();
		}
		this.color = color;
		for(IStreetLightSub sub : this.subs){
			sub.lightChanged(color);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (this.getColor()) {
		case Green: {
			this.setColor(StreetLightColor.Yellow);
			break;
		}
		case Red: {
			this.setColor(StreetLightColor.Green);
			break;
		}
		case Yellow: {
			this.setColor(StreetLightColor.Red);
			break;
		}
		default:
			this.setColor(StreetLightColor.Red);
			break;
		}
	}

}
