package assignment;

import java.util.Objects;

public class CityDetails {
   private int id;
   private String cityName;
   private String state;
   private String country;

    public CityDetails(int id, String cityName, String state, String country) {
        this.id = id;
        this.cityName = cityName;
        this.state = state;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
      public void getCityNamebyName() {
          System.out.println("City Name "+getCityName());
      }

    @Override
    public String toString() {
        return "CityDetails{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CityDetails)) return false;
        CityDetails that = (CityDetails) o;
        return getId() == that.getId() && Objects.equals(getCityName(), that.getCityName()) && Objects.equals(getState(), that.getState()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCityName(), getState(), getCountry());
    }
}
