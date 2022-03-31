package com.ntt;

public class IOTDevice2 {
    String device;
    String description;

    public IOTDevice2(){
        System.out.println("constructor");
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "IOTDevice{" +
                "device='" + device + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void initBean() throws Exception{
        System.out.println("inside init");

    }

    public void destroyBean() throws Exception{
        System.out.println("destroy method");
    }
}
