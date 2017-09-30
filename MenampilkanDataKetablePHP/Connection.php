<?php
/**
 * Created by PhpStorm.
 * User: putuguna
 * Date: 22/09/17
 * Time: 21:07
 */

class Connection {
    function getConnection(){
        $host       = "localhost";
        $username   = "root";
        $password   = "";
        $dbname     = "mapsandroid";

        try{
            $conn = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            return $conn;
        }catch (Exception $e){
            echo $e->getMessage();
        }
    }
}