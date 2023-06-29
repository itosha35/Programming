package Seminar_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class laptop {

    public String remark = "empty";
    private String imei;
    private Boolean new_one;
    private String brand;
    private String model;
    private String color;
    private String ram;
    private String hdd;
    private Integer weight;
    private String os_type;

    public laptop() {
        this.imei = "n/a";
        this.new_one = true;
        this.brand = "n/a";
        this.model = "n/a";
        this.color = "n/a";
        this.ram = "n/a";
        this.hdd = "n/a";
        this.weight = 0;
        this.os_type = "NONE";
    }

    public laptop(String brand, String model, String color, String ram, String hdd, Integer weight) {

        this.imei = "n/a";
        this.new_one = true;
        this.brand = "n/a";
        this.model = "n/a";
        this.color = "n/a";
        this.ram = "n/a";
        this.hdd = "n/a";
        this.weight = 0;
        this.os_type = "NONE";
    }

    public Boolean getNew_one() {
        return new_one;
    }

    public void setNew_one(Boolean new_one) {
        this.new_one = new_one;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    @Override
    public String toString() {
        String description = new String();
        String sep = "; ";
        description = brand + sep + model + sep + color + sep + "RAM:" + ram + sep + "HDD:" + hdd + sep + "WEIGHT="
                + Integer.toString(weight);
        return description;
    }

    public Map<String, String> setfilter(String brand, String model, String hdd, String ram, String color,
            String system_OS) {
        Map<String, String> set = new HashMap<>();
        set.put("Brand", brand);
        set.put("Model", model);
        set.put("HDD", hdd);
        set.put("RAM", ram);
        set.put("color", color);
        set.put("SYSTEM", system_OS);
        return set;
    }

    public Map<String, String> setfilter(String brand) {
        return setfilter(brand, "n/a", "n/a", "n/a", "n/a",
                "n/a");
    }

    public Map<String, String> setfilter() {
        return setfilter("n/a", "n/a", "n/a", "n/a", "n/a",
                "n/a");
    }
}
