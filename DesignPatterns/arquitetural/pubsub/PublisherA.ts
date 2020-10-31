import {eventChannel} from './EventChannel';

class PublisherA {

    publishEvent() {

        return eventChannel.publish('evento', {msg: "UM DADO SENDO EXIBIDO"})
    }
}

export const publisherA = new PublisherA();