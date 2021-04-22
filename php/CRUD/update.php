<!DOCTYPE html>/
<html lang="en">

<head>
    <title>crud</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <?php include 'links.php' ?>
</head>

<body>

    <div class="container ">
        <div class="row d-flex justify-content-center">
            <div class="col-6">
                <form action="" method="POST">
                    <?php

                    include('connection.php');
                    $ids = $_GET['id'];
                    $showquery = "SELECT * FROM profile WHERE id={$ids}";
                    $showdata = mysqli_query($con, $showquery);
                    $arrdata = mysqli_fetch_array($showdata);
                    if (isset($_POST['submit'])) {
                        $idUpdate = $_GET['id'];
                        $name = $_POST['user'];
                        $degree = $_POST['degree'];
                        $mobile = $_POST['mobile'];
                        $email = $_POST['email'];
                        $refer = $_POST['refer'];
                        $post = $_POST['jobpost'];
                        $updateQuery = " UPDATE profile SET id =$idUpdate, username= '$name', degree='$degree', mobile='$mobile' ,email='$email',refer='$refer', jobpost='$post' WHERE id=$idUpdate";
                        $res =  mysqli_query($con, $updateQuery);
                        if ($res) {
                            echo "updated ";
                        } else {
                            echo "unsucessful";
                        }
                    }
                    ?>
                    <div class="form-horizontal">
                        <div class="form-group">
                            <lable class="control-label">name
                                <input type="text" name="user" id="name" value="<?php echo $arrdata['username'] ?>" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">degree
                                <input type="text" name="degree" id="degree" value="<?php echo $arrdata['degree'] ?>" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">mobile
                                <input type="number" name="mobile" id="mobile" value="<?php echo $arrdata['mobile'] ?>" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">email
                                <input type="email" name="email" id="email" value="<?php echo $arrdata['email'] ?>" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group">
                            <lable class="control-label">refer
                                <input type="text" name="refer" id="refer" value="<?php echo $arrdata['refer'] ?>" class="form-control">
                            </lable>
                        </div>
                        <div class="form-group ">
                            <lable class="control-label">Post
                                <input type="text" name="jobpost" value="<?php echo $arrdata['jobpost'] ?>" id="jobpost" class="form-control">
                            </lable>
                        </div>
                        <div class="text-center">
                            <input type="submit" name="submit" class="btn btn-primary"></input>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <a href="show.php" class="btn btn-sucess">show</a>
</body>

</html>