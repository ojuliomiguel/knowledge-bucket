import {IErrorDisplayStategy} from './Types/IErrorDisplayStategy';
import chalk from 'chalk';

export class ConsoleErrorDisplayStategy implements IErrorDisplayStategy {
    display(title: string, body: string) {
        console.log(`${chalk.red(title)}: ${chalk.blue(body)}`);      
    }
}