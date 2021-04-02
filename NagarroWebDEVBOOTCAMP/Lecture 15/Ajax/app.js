const textdata =`{"ticker": {"base": "BTC","target": "USD","price": "59607.91297279","volume": "27313.93540135","change": "94.39833958"},"timestamp": "1617356585","success": "true","error": ""}`

const data = JSON.parse(textdata);

    console.log(data)
    console.log(data.ticker.price)