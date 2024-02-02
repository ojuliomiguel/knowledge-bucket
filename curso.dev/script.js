const fs = require('fs')
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite o dia da aula ', (answer) => {
  const day = answer
  fs.writeFileSync(`./dias/dia${day}.md`,
    `# Dia ${day} - 

---
- [Anterior](/curso.dev/dias/dia${day - 1}.md) - [Próximo](/curso.dev/dias/dia${day + 1}.md) - [Sumário](../readme.md)
`,
    'utf-8'
  )

  console.log('Arquivo de aula criado com sucesso');

  rl.close();
});


