import Order from "../Order";
import IStateOrder from "./IStateOrder";

export default class OrderShipedState  implements IStateOrder {

    constructor(readonly order: Order) {
        
    }
    
    verifyPayment() {
        console.log('Payment is already verified.');
    }
    shipOrder() {
        console.log('Order is already shipped.');
    }

    cancelOrder() {
        console.log('You cannot cancel an order that has been shipped.');
    }
    
}