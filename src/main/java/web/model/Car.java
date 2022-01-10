package web.model;

public class Car {
    private String model;
    private String series;
    private int release_date;

    public Car(){}

    public Car(String model, String series, int release_date){
        this.model = model;
        this.series = series;
        this.release_date = release_date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }
}
