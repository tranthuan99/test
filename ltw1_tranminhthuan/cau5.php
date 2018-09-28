<!DOCTYPE html>
<html>
<head>
    <?php
    require 'data.php';
    ?>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>

<body>
    <form class="title">
        ID <input type="txt" name='id'/>
        <input type="submit" value="Tìm kiếm"/>
    </form>
    <?php 
    if (empty($_GET['id'])) 
    {
        echo "Gia tri chua nhap";
    }
    else
    {
        for ($i=0; $i < 5 ; $i++) 
        { 
            if($users[$i]['id']== $_GET['id'] )
            {?>
                <table>
                    <tr>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Gmail</td>
                            <td>Yahoo</td>
                        </tr>
                        <tr>
                            <td><?php echo $users[$i]['id']; ?> </td>
                            <td><?php echo $users[$i]['name']; ?></td>
                            <td><?php echo $users[$i]['email']['gmail']; ?></td>
                            <td><?php echo $users[$i]['email']['yahoo']; ?></td>
                        </tr>
                    </tr>
                </table>
            <?php
            break;
            }
            else
            {
                if($i==4)
                {
                    echo "k co";
                }
            }

        }
    }
    ?>
</body>
</html>