// const textdata =`{"ticker": {"base": "BTC","target": "USD","price": "59607.91297279","volume": "27313.93540135","change": "94.39833958"},"timestamp": "1617356585","success": "true","error": ""}`

// const data = JSON.parse(textdata);

//     console.log(data)
//     console.log(data.ticker.price)

    // XMLHttpRequest()
    // fetch()
    // axios

    // old way of sending request

    // const req = new XMLHttpRequest();
    // req.onload = function(){
    //     console.log(this.responseText);
    //     const data = JSON.parse(this.responseText);
    //     console.log(data)
    // }
    // req.onerror = function(){
    //     console.log(err);
    // }
    // req.open('get','https://api.cryptonator.com/api/ticker/btc-usd');
    // req.send();

    // fetchapi
    fetch('https://api.cryptonator.com/api/ticker/btc-usd')
    .then(data=>{
        console.log(data)
        return data.json();
    })
    .then(parseData=>{
        $('p').text(parseData.ticker.price)
        console.log(parseData.ticker.price)
    })
    .catch(err=>{
        console.error(err);
    })