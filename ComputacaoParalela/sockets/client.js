const net = require('net');
const readline = require('readline');

const client = new net.Socket();

const rl = readline.createInterface({
    input: process.stdin,
    output : process.stdout
})

client.connect(7007, 'localhost', () => {
    console.log('Cliente conectado com sucesso!');
    console.log('Digite o CPF para ser validado no servidor: \n');
    rl.addListener('line', (cpf) => {
        client.write(cpf);
    }) 
})

client
    .on('data', (cpf) => {
        if (cpf.toString() === 'true') return console.log('O CPF informado é válido');
        return console.log('O CPF informado NÃO é válido');
    })


