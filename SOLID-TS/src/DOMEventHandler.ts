import EventHandler from './EventHandler'
export default class DOMEventHandler implements EventHandler {
    
    addEventListenerToClass(className: string, event: string, fn: any) {
        const elements: any = document.querySelectorAll(className);
        for (const element of elements) {
            element.addEventListener(event, fn);
        }
    }
}