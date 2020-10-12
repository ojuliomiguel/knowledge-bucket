import Order from "../Order";
import IStateOrder from "./IStateOrder";

export default class PaymentPendingState implements IStateOrder {

    constructor(readonly order: Order) {
    }
   
    verifyPayment() {
        console.log('Payment verified! Shipping soon.');
        this.order.setState(this.order.orderBeingPrepared);
    }
    shipOrder() {
        console.log('Cannot ship order when payment is pending.');
    }
    cancelOrder() {
        console.log('Cancelling your unpaid order...');
        this.order.setState(this.order.cancelledOrderState);
    }

}
