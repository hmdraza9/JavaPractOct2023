package design.pattern.CameraAppStrategic;

public class DemoCamera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CameraApp customCamera = new BasicCameraApp();
		customCamera.clickPhoto();
		customCamera.savePhoto();
		customCamera.editPhoto();
		customCamera.sharePhoto();
		System.out.println("*****************");
		customCamera = new CameraPlusApp();
		customCamera.clickPhoto();
		customCamera.savePhoto();
		customCamera.editPhoto();
		customCamera.sharePhoto();

	}

}
