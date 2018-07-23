public class StatisticsDisplay implements MyObserver, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private MySubject weather;

    public StatisticsDisplay(MySubject weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("温度" + temp + "湿度" + humidity + "压力" + pressure);
    }
}
