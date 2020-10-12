import {IErrorLogginStrategy} from './Types/IErrorLogginStrategy';
import fs from 'fs';

export class FileErrorLogginStrategy implements IErrorLogginStrategy {
    log(err: Error): Promise<any> {
        return new Promise((resolve, reject) => {
            fs.appendFile("logs/error.log", `${err}\n`, "utf8", (error) => {
                if(error) {
                    console.error('Error Loggin failed');
                    resolve(error);
                }
                else {
                    reject(error);
                }
            });
        });
    }

}