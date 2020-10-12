import IStateOrder from "./OrderStates/IStateOrder";
import CancelledOrderState from "./OrderStates/CancelledOrderState";
import PaymentPedingState from "./OrderStates/PaymentPendingState";
import OrderShipedState from "./OrderStates/OrderShipedState";
import OrderBeingPrepared from "./OrderStates/OrderBeingPrepared";

export default class Order {
    public paymentPedingState: IStateOrder;
    public orderBeingPrepared: IStateOrder;
    public orderShipedState: IStateOrder;
    public cancelledOrderState: IStateOrder;
    public currentState!: IStateOrder;

    constructor() {
        this.paymentPedingState = new PaymentPedingState(this);
        this.orderBeingPrepared = new OrderBeingPrepared(this); 
        this.orderShipedState = new OrderShipedState(this);
        this.cancelledOrderState = new CancelledOrderState(this);

        this.setState(this.paymentPedingState); 
        
    }

    public setState(state: IStateOrder) {
        this.currentState = state;
    }

    public getCurrentState(): IStateOrder {
        return this.currentState;
    } 

}