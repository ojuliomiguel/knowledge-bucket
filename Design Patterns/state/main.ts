import Order from './Order'

const order = new Order();

order.getCurrentState().shipOrder();
order.getCurrentState().verifyPayment();
order.getCurrentState().cancelOrder();


