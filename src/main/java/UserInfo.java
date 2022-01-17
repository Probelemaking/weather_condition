import java.sql.Date;

class UserInfo {
    private int id;
    private String name;
    private String city_id;
    private double lat;
    private double lon;
    private java.sql.Date fxDate;
    private int  tempMax;
    private int  tempMin;
    private String textDay;
    public UserInfo(){}
    public UserInfo(int id, String name, String city_id, double lat, double lon,java.sql.Date fxDate , int tempMax, int tempMin, String textDay) {
        this.id = id;
        this.name = name;
        this.city_id = city_id;
        this.lat = lat;
        this.lon = lon;
        this.fxDate = fxDate;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.textDay = textDay;
    }

    public UserInfo(String name, String city_id, double lat, double lon, java.sql.Date fxDate, int tempMax, int tempMin, String textDay) {
        this.name = name;
        this.city_id = city_id;
        this.lat = lat;
        this.lon = lon;
        this.fxDate = fxDate;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.textDay = textDay;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity_id() {
        return city_id;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }


    public int getTempMax() {
        return tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public String getTextDay() {
        return textDay;
    }

    public java.sql.Date getFxDate() {
        return fxDate;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city_id='" + city_id + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", fxDate=" + fxDate +
                ", tempMax=" + tempMax +
                ", tempMin=" + tempMin +
                ", textDay='" + textDay + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setFxDate(Date fxDate) {
        this.fxDate = fxDate;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public void setTextDay(String textDay) {
        this.textDay = textDay;
    }
}
