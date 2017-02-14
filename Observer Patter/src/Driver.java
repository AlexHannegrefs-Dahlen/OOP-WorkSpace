
public class Driver implements IStreetLightSub {

	@Override
	public void lightChanged(StreetLightColor newColor) {
		switch (newColor) {
		case Red:
			System.out.println("Light Red");
			break;
		case Green:
			System.out.println("Light Green");
			break;
		case Yellow:
			System.out.println("Light Yellow");
			break;
		}
	}

}
