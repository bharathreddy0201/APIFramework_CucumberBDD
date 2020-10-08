package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	GetDevicesAPI("/devices"),
	ConnectDeviceAPI("/connect"),
	DeviceStateAPI("/state"),
	SetDeviceBrightnessAPI("/brightness"),
	SetDeviceColorAPI("/color"),
	SetDeviceNameAPI("/name"),
	SetDeviceDisconnectAPI("/disconnect");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
