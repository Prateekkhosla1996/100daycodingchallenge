<?php
echo 'Hello world';
echo '<h1>Hello world</h1>';

?>
<?php
class Book
{
    var $name;
    var $author;
    var $pages;
    function __construct($a_name, $a_author, $a_pages)
    {
        $this->name = $a_name;
        $this->author = $a_author;
        $this->pages = $a_pages;
    }
    function getName()
    {
        echo "$this->name is my name";
    }
}
$b1 = new Book("Harry Poter", "prateek", 444);

echo $b1->name;
echo '<br>';
echo $b1->author;
echo '<br>';
echo $b1->pages;
$b1->getName();
?>


<?php
$a = 10;
$b = 20;
$c = 30;
if ($a > $b && $a > $c) {
    echo "$a is grater than $b and $c <br>";
} else if ($b > $a && $b > $c) {
    echo "$b is grater than $a and $c <br>";
} else {
    echo "$c is grater than $a and $b <br>";
}

$arr = array(10, 20, 30, 40, 50, 60);
foreach ($arr as &$val) {
    echo "$val <br>";
}
?>
<?php
$str = "hello world";
echo substr($str, 5);

echo strlen($str);

?>