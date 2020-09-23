import Order from "../Order";
import IStateOrder from "./IStateOrder";

export default class CancelledOrderState implements IStateOrder {

    constructor(readonly order: Order) {
        
    }
    
    verifyPayment() {
        console.log('The order is cancelled, you cannot pay anymore.');
    }
    shipOrder() {
        console.log('The order is cancelled, you cannot ship it anymore.');
    }

    cancelOrder() {
        console.log('This order is already cancelled.');
        this.order.setState(this.order.cancelledOrderState);;
    }
    
}