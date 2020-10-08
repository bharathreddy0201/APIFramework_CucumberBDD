package resources;

import pojo.ConnectIP;

public class TestDataBuild {

	public ConnectIP ConnectIP(String IP) {
		ConnectIP CIP = new ConnectIP();
		CIP.SetIP("192.168.100.10");
		return CIP;
	}

}
