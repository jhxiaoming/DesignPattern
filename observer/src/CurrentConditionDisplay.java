public class CurrentConditionDisplay implements DisplayElement, MyObserver {

    private float temp;
    private float humidity;

    private MySubject weatherData;


    public CurrentConditionDisplay(MySubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("温度  " + temp + "  湿度" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
