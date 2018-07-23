import java.util.ArrayList;
import java.util.Observer;


//被观察者 数据源 主题
public class WeatherData implements MySubject {

    private ArrayList<MyObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
    }


    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            MyObserver myObserver = observers.get(i);
            myObserver.update(temperature, humidity, pressure);
        }
    }
}
