package com.onkyo.jp.upnp;

/* loaded from: classes.dex */
public class UpnpDeviceDescriptor {
    public String _deviceType;
    public String _friendlyName;
    public UpnpIcon[] _icons;
    public String _manufacture;
    public String _manufactureUrl;
    public String _modelDescription;
    public String _modelName;
    public String _modelNumber;
    public String _presentationUrl;
    public String _serialNumber;
    public UpnpServiceInfo[] _services;
    public String _udn;

    public String deviceType() {
        return this._deviceType;
    }

    public String friendlyName() {
        return this._friendlyName;
    }

    public UpnpIcon[] icons() {
        return this._icons;
    }

    public String manufacture() {
        return this._manufacture;
    }

    public String manufactureUrl() {
        return this._manufactureUrl;
    }

    public String modelDescription() {
        return this._modelDescription;
    }

    public String modelName() {
        return this._modelName;
    }

    public String modelNumber() {
        return this._modelNumber;
    }

    public String presentationUrl() {
        return this._presentationUrl;
    }

    public String serialNumber() {
        return this._serialNumber;
    }

    public UpnpServiceInfo[] services() {
        return this._services;
    }

    public String udn() {
        return this._udn;
    }
}
