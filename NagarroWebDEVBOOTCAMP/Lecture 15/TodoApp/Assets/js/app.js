
// $('li').click(function(){
//     $(this).toggleClass('completed');
// })
$('ul').on('click','li',function(e){
    $(this).toggleClass('completed');
})
$('ul').on('click','span',function(e){
    $(this).parent().fadeOut(800,function(){
        $(this).remove()
    })
    
    e.stopPropagation(); //prevents event bubbling
})

$('input[type="text"]').keypress(function(e){
    if(e.which==13){
        const todoText = $(this).val();
        
        const todo = `<li><span>x </span>${todoText}</li>`
        $('ul').append(todo)
        
    }
})