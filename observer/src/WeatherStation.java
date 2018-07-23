public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        //状态变化
        weatherData.setMeasurements(80, 65, 30.4f);



    }
}
