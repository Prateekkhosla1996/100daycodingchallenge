import React from 'react'

function Link({className,href,children}) {
    const onClick = (event) =>{
        if(event.metaKey||event.ctrlKey){
            return;
        }
        event.preventDefault();
        window.history.pushState({},'',href);
        const navEnt = new PopStateEvent('popstate');
        window.dispatchEvent(navEnt)
    }
    return (
        <a href={href} className={className} onClick={onClick}>{ children }</a>
    )
}

export default Link
