import IObserver from "./interfaces/IObserver";
import ISubject from "./interfaces/ISubject";

export default class Fan implements IObserver {
    private subject: ISubject;

    constructor(weatherStation: ISubject) {
        this.subject = weatherStation;
        weatherStation.registerObserver(this);
    }
    
    update(temperature: number) {
        if (temperature > 25) {
            console.log('Fan says: Its hot here, turning myself on...');  
        }
        else {
            console.log('Fan says: Its nice and cool, turning myself off...');
            
        }

    
    }
}