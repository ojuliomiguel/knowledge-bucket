export function pubSub() {
    const subscribers = {};

    function publish(eventName: string, data: any) {
        if (!Array.isArray(subscribers[eventName])) return console.log('entrou');
        subscribers[eventName].forEach((cb) => {
            console.log(cb);
            
            cb(data);
        })
    }

    function subscribe(eventName: string, callback: (data: any) => void) {
        if (!Array.isArray(subscribers[eventName])) {
            subscribers[eventName] = [];
        }
        console.log(callback);
        
        subscribers[eventName].push(callback);
    }

    return {
        publish,
        subscribe,
    }
}

const ps = pubSub();

const showTheMoney = (money: string) => console.log(money);


ps.subscribe('show-money', showTheMoney);

ps.publish('show-money', '1000000')