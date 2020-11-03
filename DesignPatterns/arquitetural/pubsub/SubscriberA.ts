import {eventChannel} from './EventChannel';

class SubscriberA {

    constructor() { 
        let subscription = eventChannel.subscribe('evento', data => {
            console.log(`Evento foi publicado: ${data.msg}`);
            subscription.unsubscribe();    
        }) 
    }
}

const subscriberA = new SubscriberA();

export {subscriberA};

