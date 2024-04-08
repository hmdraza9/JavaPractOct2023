package design.pattern.CameraAppStrategic;

public class BasicCameraApp extends CameraApp {

	public BasicCameraApp() {
		editPhoto = new EditPhotoBaseTools();
		sharePhoto = new SharePhoto();
	}

	@Override
	public void editPhoto() {
		System.out.println("Editing photo with basic tools");
	}

	@Override
	public void sharePhoto() {
		sharePhoto.sharePhoto();
	}

}
