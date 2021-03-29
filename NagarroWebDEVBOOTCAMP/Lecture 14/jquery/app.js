$('p').css('text-align','justify');
$('p').css('color','red');
$('p').css('padding','5px');
$('p').css('border','5px solid yellow');
// $('h1').css('font-weight','500')
// $('h1').css('text-align','center');

$('img').css('width','250px')

$('img').css('border-radius','10px')
$('ol li').css('font-weight','bold')
$('ol li').css('font-size','24px');
$('ol li').first().css('font-size','44px');
$('ol li').last().css('font-size','54px');
$('li:nth-of-type(odd)').css('color','blue');
$('h1').css({
    border:'3px solid black',
    textAlign:'center',
    fontFamily:'sans-serif'
})
$('h1').text('NEW HEADING')

$('input[type="text"]').val("hello from jquery");


console.log($('input[type="text"]').attr("type"));

$('h1').addClass('h1')
// $('h1').removeClass('h1')
let count = 0;
$('#button1').click(function(){
   console.log($(this).text())
    count++;
    $('span').text(count);
})
$('#onClickDec').on('click',function(){
    $('div').slideToggle(2000,()=>{
        console.log('fade toggle')
    });
    count--;
    $('span').text(count);
    // console.log($(this).text());
})
// keyboard events

$('input[type="text"]').keypress((e)=>{
    if(e.which==13){
        console.log('you pressed enter')
    }
    console.log('key is pressed')
})



// $('div').on('click',function(){
//     $(this).toggleClass('gold')
// })


$('div').on('mouseenter',function(){
    $(this).css('background','gold')
})
$('div').on('mouseleave',function(){
    $(this).css('background','yellow')
})
// effects

$('div').fadeIn()