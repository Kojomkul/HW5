package com.company;

public class MagicDoor {
     public Hero [] herous (){
         Hero [] heroes = new Hero[4];
         Hero warrior = new Hero(250, 100, 30);
         heroes [0] = warrior;
         Hero psycho = new Hero(220,130,35);
         heroes [1] = psycho;
         Hero magic = new Hero(220,120,40);
         heroes [2] = magic;
         Hero medic = new Hero(200,50,25);
         heroes [3] = medic;
         return heroes;
     }
}
