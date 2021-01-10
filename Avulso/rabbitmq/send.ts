import { connect } from 'amqplib/callback_api';

connect('amqp://localhost', (err, conn) => {
    if (err) throw err;

    conn.createChannel((err1, channel) => {
        if (err1) throw err1;

        const queue = 'hello';

        const msg = 'Hello World';

        channel.assertQueue(queue, {
            durable: false
        })

        channel.sendToQueue(queue, Buffer.from(msg));

        console.log(" [x] Sent %s", msg);

    });

    setTimeout(() => {
        conn.close();
        //process.exit(0);
    }, 500);

});