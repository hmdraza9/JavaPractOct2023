package design.pattern.CameraAppStrategic;

public class SharePhoto implements SharePhotoBehaviour {

	@Override
	public void sharePhoto() {

		System.out.println("Photo shared.");
	}

}
