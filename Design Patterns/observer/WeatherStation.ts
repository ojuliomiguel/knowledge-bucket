import IObserver from "./interfaces/IObserver";
import ISubject from "./interfaces/ISubject";

export default class WheatherStation implements ISubject {
    private observers: IObserver[] = [];
    private temperature: number;
    
    registerObserver(observer: IObserver) {
        this.observers.push(observer);
    }

    removeObserver(observer: IObserver) {
        let index = this.observers.indexOf(observer);
        if(index === -1) return;
        this.observers.splice(index, 1);
    }

    notifyObserver() {
        for (let observer of this.observers) {
            observer.update(this.temperature);
        }
    }

    setTemperature(temp: number) {
        console.log('WeatherStation says: new temperature measurement: ' + temp);
        this.temperature = temp;
        this.notifyObserver();
        
    }
    
}