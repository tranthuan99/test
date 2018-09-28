<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // put your code here
        $num= array(1,2,3,4);
        $i=0;
        $j=0;
        for(;$i>2||$j<2;)
        {
            $j=$i++ + ++$i;
            echo $num[$i];
            echo $num[$j];
        }
        ?>
    </body>
</html>
