import {ErrorHandler} from './ErrorHandler';
import {ConsoleErrorDisplayStategy} from './ConsoleErrorDisplayStategy';
import {FileErrorLogginStrategy} from './FileErrorLogginStrategy';

let errorHandler = new ErrorHandler(new ConsoleErrorDisplayStategy(), new FileErrorLogginStrategy());

// forcing an error:

try {
    let b: any = 2;
    b();

}
catch(err) {
    errorHandler.handle(err, "Something went wrong", "Please try again later!");
}

