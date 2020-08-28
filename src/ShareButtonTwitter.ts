import AbstractShareButton from './AbstractLinkShareButton';
import EventHandler from './EventHandler';


export default class ShareButtonTwitter extends AbstractShareButton {
    
    constructor(eventHandler: EventHandler, className: string, url: string) {
        super(eventHandler, className, url);
        
    }


    createLink(): string {
       return `http://www.twitter.com/share?url=${this.url}`;
    }
}