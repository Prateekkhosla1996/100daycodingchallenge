<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php if (!empty($articles)) {

        foreach ($articles as $article) {

    ?>
            <table border="1px">
            <tr>
                <td><?php echo $article['id']; ?></td>
                <td> <?php echo $article['title']; ?> </td>
                <td><?php echo $article['author']; ?></td>
                <td><?php echo $article['created_at'];?> </td>
            </tr>
            </table>
        <?php }
    } else { ?>
        <tr>
            <td>record not found</td>
        </tr>
    <?php } ?>

    <?php
          
          echo word_limiter($string,4);
    ?>
</body>

</html>