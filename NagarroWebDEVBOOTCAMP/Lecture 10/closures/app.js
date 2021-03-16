

function fun1(){
    let x = 0;
    console.log('this is fun 1 '+x);
     function fun2(){
        x++;
        console.log('this is fun 2 '+x);
         function fun3(){
            x++;
        console.log('this is fun 3 '+x);
            function fun4(){
                x++;
        console.log('this is fun 4 '+x);
            }
            fun4();
        }
        fun3();
    }
    fun2()
}
fun1();
