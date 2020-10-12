import {IErrorDisplayStategy} from './Types/IErrorDisplayStategy';
import {IErrorLogginStrategy} from './Types/IErrorLogginStrategy';

export class ErrorHandler {
    constructor(private displayStategy: IErrorDisplayStategy, private logginStrategy: IErrorLogginStrategy) {

    }

    handle(err: Error, title: string, body: string): Promise<any> {
        this.displayStategy.display(title, body);

        return this.logginStrategy.log(err);
    }
}