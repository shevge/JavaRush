package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //for(String i = "a"; i != "aaaaaa"; i += "a") {
        for(char i = 'a'; i < 'j'; i++) {
            Zerg z = new Zerg();
            z.name = "zerg" + i;
        }

        for(char i = 'a'; i < 'j'; i++) {
            Protos y = new Protos();
            y.name = "protos" + i;
        }

        for(char i = 'a'; i < 'j'; i++) {
            Terran x = new Terran();
            x.name = "terran" + i;
        }
        /*
        Zerg zerga= new Zerg();
        zerga.name = "zerga";
        Zerg zergab = new Zerg();
        zergab.name = "zergab";
        Zerg zergabc = new Zerg();
        zergabc.name = "zergabc";
        Zerg zergabcd = new Zerg();
        zergabcd.name = "zergabcd";
        Zerg zergabcde = new Zerg();
        zergabcde.name = "zergabcde";
        Zerg zergaab = new Zerg();
        zergaab.name = "zergaab";
        Zerg zergaabc = new Zerg();
        zergabc.name = "zergabc";
        Zerg zergaabcd = new Zerg();
        zergabcd.name = "zergabcd";
        Zerg zergaabcde = new Zerg();
        zergabcde.name = "zergabcde";
        Zerg zergaaab = new Zerg();
        zergaaab.name = "zergaaab";
        Protos protosa = new Protos();
        protosa.name = "protosa";
        Protos protosab = new Protos();
        protosab.name = "protosab";
        protosab.name = "protosab";
        Protos protosabc = new Protos();
        protosabc.name = "protosabc";
        Protos protosabcd = new Protos();
        protosabcd.name = "protosabcd";
        Protos protosabcde = new Protos();
        protosabcde.name = "protosabcde";
        Terran terrana = new Terran();
        terrana.name = "terrana";
        Terran terranab = new Terran();
        terranab.name = "terranab";
        Terran terranabc = new Terran();
        terranabc.name = "terranabc";
        Terran terranabcd = new Terran();
        terranabcd.name = "terranabcd";
        Terran terranabcde = new Terran();
        terranabcde.name = "terranabcde";
        Terran terranaa = new Terran();
        terranaa.name = "terranaa";
        Terran terranaab = new Terran();
        terranaab.name = "terranaab";
        Terran terranaabc = new Terran();
        terranaabc.name = "terranaabc";
        Terran terranaabce = new Terran();
        terranaabce.name = "terranaabce";
        Terran terranaaa = new Terran();
        terranaaa.name = "terranaaa";
        Terran terranaaab = new Terran();
        terranaaab.name = "terranaaab";
        Terran terranaaabc = new Terran();
        terranaaabc.name = "terranaaabc";
        */
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}