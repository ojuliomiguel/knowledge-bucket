const net = require('net');

const server = net.createServer((socket) => {
    console.log('Alguém conectou-se ao servidor!');  
    
    socket
        .on('end', () => console.log('Alguém desconectou-se!'))
        .on('data', (cpf) => {
            socket.write(isCPFValido(cpf.toString()).toString())
        }); 
    
})

server.listen(7007, 'localhost');


// função para validar o cpf (está declarada abaixo mas funciona por conta do hoisting)
const isCPFValido = (strCPF) => {
    console.log(strCPF);
    let Soma;
    let Resto;
    Soma = 0;

    if (strCPF == "") {
        return false;
    }

    // Caso o CPF tenha pontos e traço, será retirado
    strCPF = strCPF.replace("-", "");

    strCPF = strCPF.replace(/\./g, "");

    // Se o tamanho for < 11 entao retorna como inválido
    if (strCPF.length != 11) {
        return false;
    }

    // Caso coloque todos os numeros iguais
    switch (strCPF) {
        case "00000000000":
            return false;
        case "11111111111":
            return false;
        case "22222222222":
            return false;
        case "33333333333":
            return false;
        case "44444444444":
            return false;
        case "55555555555":
            return false;
        case "66666666666":
            return false;
        case "77777777777":
            return false;
        case "88888888888":
            return false;
        case "99999999999":
            return false;
    }

    for (let i = 1; i <= 9; i++) Soma = Soma + parseInt(strCPF.substring(i - 1, i)) * (11 - i);
    Resto = (Soma * 10) % 11;

    if ((Resto == 10) || (Resto == 11)) Resto = 0;
    if (Resto != parseInt(strCPF.substring(9, 10))) return false;

    Soma = 0;
    for (let i = 1; i <= 10; i++) Soma = Soma + parseInt(strCPF.substring(i - 1, i)) * (12 - i);
    Resto = (Soma * 10) % 11;

    if ((Resto == 10) || (Resto == 11)) Resto = 0;
    if (Resto != parseInt(strCPF.substring(10, 11))) return false;
    return true;
}