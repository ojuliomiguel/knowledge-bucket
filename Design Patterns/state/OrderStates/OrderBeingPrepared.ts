import Order from "../Order";
import IStateOrder from "./IStateOrder";

export default class OrderBeingPrepared implements IStateOrder {

    constructor(readonly order: Order) {
        
    }
    
    verifyPayment() {
        console.log('Payment is already verified.');
    }
    

    shipOrder() {
        console.log('Shipping your order now...');
        this.order.setState(this.order.orderShipedState);
    }
    
    cancelOrder() {
        console.log('Cancelling your order... You will be refunded.');
        this.order.setState(this.order.cancelledOrderState);
    }
    
}