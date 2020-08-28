import ShareButtonTwitter from "./ShareButtonTwitter";
import ShareButtonFacebook from "./ShareButtonFacebook";
import ShareButtonLinkedin from "./ShareButtonLinkedin";
import ShareButtonPrint from './ShareButtonPrint';
import DOMEventHandler from './DOMEventHandler';

const domEventHandler = new DOMEventHandler()



const twitter = new ShareButtonTwitter(domEventHandler, ".btn-twitter", "https://juliomiguell.github.io/portfolio/");
twitter.bind();

const facebook = new ShareButtonFacebook(domEventHandler, ".btn-facebook", "https://juliomiguell.github.io/portfolio/");
facebook.bind();

const linkedin = new ShareButtonLinkedin(domEventHandler, ".btn-linkedin", "https://juliomiguell.github.io/portfolio/");
linkedin.bind();

const printer = new ShareButtonPrint(domEventHandler, ".btn-print");
printer.bind();