Feature: Validating API's for managing smart light bulbs in your home network 

@GetDevices @Regression 
Scenario: Verify if API call List all available devices 
	Given The endpoint of the API to get all devices 
	When user calls "GetDevicesAPI" with "GET" http request 
	Then the API call should get success with status code 200 
	
@ConnectDevices @Regression 
Scenario: Verify if API call is able to connect to a device 
	Given The endpoint of the API to connect to input device 
	When user calls "ConnectDeviceAPI" with "POST" http request 
	Then the API call should get success with status code 200 
	And "success" in response body is "true" 
	
@GetDeviceState @Regression 
Scenario: Verify if API call is able to get device state 
	Given The endpoint of the API to get device state 
	When user calls "DeviceStateAPI" with "GET" http request 
	Then the API call should get success with status code 200 
	And "ip" in response body is "192.168.100.10" 
	And "brightness" in response body is "10.0" 
	And "color" in response body is "#336699" 
	
@SetDeviceBrightness @Regression 
Scenario: Verify if API call is able to set the brighness of the device 
	Given The endpoint of the API to set the brightness to input device 
	When user calls "SetDeviceBrightnessAPI" with "POST" http request 
	Then the API call should get success with status code 200 
	And "success" in response body is "true" 
	
@SetDeviceColor @Regression 
Scenario: Verify if API call is able to set the color to the device 
	Given The endpoint of the API to set the color to input device 
	When user calls "SetDeviceColorAPI" with "POST" http request 
	Then the API call should get success with status code 200 
	And "success" in response body is "true" 
	
@SetDeviceName @Regression 
Scenario: Verify if API call is able to set  name to the device 
	Given The endpoint of the API to set the name to input device 
	When user calls "SetDeviceNameAPI" with "POST" http request 
	Then the API call should get success with status code 200 
	And "success" in response body is "true" 
	
@DisconnectDevice @Regression 
Scenario: Verify if API call is able to disconnect from the device 
	Given The endpoint of the API to disconnect to input device 
	When user calls "SetDeviceDisconnectAPI" with "POST" http request 
	Then the API call should get success with status code 200 
	And "success" in response body is "true" 
	
	
	
	
	
	
	
	
	