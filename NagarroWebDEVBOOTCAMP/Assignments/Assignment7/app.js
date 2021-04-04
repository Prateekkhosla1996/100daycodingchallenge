const cityName = document.getElementById('cityName');
const day = document.getElementById('day');
const cityInp = document.getElementById('city');
const submitBtn = document.getElementById('submitBtn');
const temperature = document.getElementById('temprature');
const minTemp = document.getElementById('min_temp');
const maxTemp = document.getElementById('max_temp');
const weather_main = document.getElementById('weather_main');
submitBtn.addEventListener('click',async (e)=>{
    const inpVal = cityInp.value;
    console.log(inpVal)
    const apiKey = "2a691ffa4ac79e251946c54392474152";
    const url =`http://api.openweathermap.org/data/2.5/weather?q=${inpVal}&appid=${apiKey}&units=metric`;
    // fetching the data
    let response = await fetch(url)
    let data = await response.json();
    console.log(data)
    let curr_temp = parseInt(data.main.temp);
    let min_temp = parseInt( data.main.temp_min);
    let max_temp = parseInt(data.main.temp_max);
    let city_name= data.name;
    let weth = data.weather[0].main;
    let timeElapsed = Date.now();
    let curr_date = new Date(timeElapsed);
    cityName.innerText = city_name;
    day.innerText=curr_date.toUTCString();
    temperature.innerText = curr_temp;
    minTemp.innerText = min_temp;
    maxTemp.innerText = max_temp;
    weather_main.innerText = weth;
})