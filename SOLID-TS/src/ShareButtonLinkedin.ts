import AbstractLinkShareButton from './AbstractLinkShareButton';
import EventHandler from './EventHandler';


export default class ShareButtonLikedin extends AbstractLinkShareButton {
    
    constructor(eventHandler: EventHandler, className: string, url: string) {
        super(eventHandler, className, url);
        
    }

    createLink(): string {
       return `https://www.linkedin.com/shareArticle?mini=true&url=${this.url}`;
    }
}