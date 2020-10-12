export interface IErrorLogginStrategy {
    log(err: Error): Promise<any>;

}