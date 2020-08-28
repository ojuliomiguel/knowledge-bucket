import AbstractLinkShareButton from './AbstractLinkShareButton';
import EventHandler from './EventHandler';

export default class ShareButtonFacebook extends AbstractLinkShareButton {
    
    constructor(eventHandler: EventHandler, className: string, url: string) {
        super(eventHandler, className, url);
        
    }

    createLink(): string {
       return `https://www.facebook.com/sharer/sharer.php?u=${this.url}`;
    }
}