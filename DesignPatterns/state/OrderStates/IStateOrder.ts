import Order from "../Order";

export default interface IStateOrder {
    order: Order;

    verifyPayment();
    shipOrder();
    cancelOrder();
    
}

 
