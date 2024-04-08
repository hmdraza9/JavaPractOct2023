package design.pattern.CameraAppStrategic;

public abstract class CameraApp {

	EditPhotoBehaviour editPhoto;
	SharePhotoBehaviour sharePhoto;

	public void clickPhoto() {
		System.out.println("Photo clicked.");
	}

	public void savePhoto() {
		System.out.println("Photo saved.");
	}

	public abstract void sharePhoto();

	public abstract void editPhoto();

}
