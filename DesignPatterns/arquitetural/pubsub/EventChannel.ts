class EventChannel {
    private subscribers = {};

    publish(eventName: string, data: any): void {
        if (!Array.isArray(this.subscribers[eventName])) return;
        this.subscribers[eventName].forEach((cb) => { 
            cb(data);
        })
    }

    subscribe(eventName: string, callback: (data: any) => void) {
        if (!Array.isArray(this.subscribers[eventName])) {
            this.subscribers[eventName] = [];
        }
        
        this.subscribers[eventName].push(callback);

        let index = 0;
        
        this.subscribers[eventName] ? index = this.subscribers[eventName].length - 1  : index;        
    
        return {
            unsubscribe() { 
                console.log(this.subscribers);
                   
                if(this.subscribers[eventName]) 
                    this.subscribe[eventName].splice(index, 1);
            }
        }
    }

}

export const eventChannel = new EventChannel();