import IObserver from "./interfaces/IObserver";
import ISubject from "./interfaces/ISubject";

export default class TemperatureDisplay implements IObserver {
    private subject: ISubject;

    constructor(weatherStation: ISubject) {
        this.subject = weatherStation;
        weatherStation.registerObserver(this);
    }
    
    update(temperature: number) {
        console.log('TemperatureDisplay says: I need to update my dysplay');
    
    }
    
}