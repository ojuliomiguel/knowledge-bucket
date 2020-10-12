import IObserver from "./IObserver";

export default interface ISubject {
    registerObserver(observer: IObserver);

    removeObserver(observer: IObserver);

    notifyObserver();

}