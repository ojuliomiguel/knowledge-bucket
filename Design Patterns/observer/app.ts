import Fan from './Fan';
import TemperatureDisplay from './TemperatureDisplay';
import WeatherStation from './WeatherStation';

let weatherStation = new WeatherStation();

let tempDisplay = new TemperatureDisplay(weatherStation);
let fan = new Fan(weatherStation);

weatherStation.setTemperature(20);
weatherStation.setTemperature(35);

