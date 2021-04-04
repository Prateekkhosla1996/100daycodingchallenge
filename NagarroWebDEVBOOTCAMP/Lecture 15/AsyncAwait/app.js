

// async function add(x,y){
//     return x+y;
// }

// add(5,6)
// .then(data=>{
//     console.log(data);
// })
// .catch(err=>{
//     console.error(err)
// })


async function getBitcoinPrice(){
    console.log('starting the getbitcoin function');
    const response = await fetch('https://api.cryptonator.com/api/ticker/btc-usd')
    console.log('after getting reponse getbitcoin function');
    console.log('parsing response ');
    const data = await response.json();
    console.log(data.ticker.price)
    console.log('getbotcoinprice function completes')
}

getBitcoinPrice().then(()=>{
    console.log('resolved')
})
.catch(err=>console.log(err))

