package design.pattern.CameraAppStrategic;

public class CameraSimulator {

	public static void main(String[] args) {

		CameraApp cameraApp = new BasicCameraApp();
		cameraApp.clickPhoto();
		cameraApp.savePhoto();
		cameraApp.editPhoto();
		cameraApp.sharePhoto();
System.out.println("*****************");
		cameraApp = new CameraPlusApp();
		cameraApp.clickPhoto();
		cameraApp.savePhoto();
		cameraApp.editPhoto();
		cameraApp.sharePhoto();

	}

}
