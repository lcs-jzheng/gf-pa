import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *This is a racing game
 * 
 * @JEFF ZHENG
 * @1.0
 */
public class RaceTrack extends World
{
    //Frames to count the time
    private GreenfootImage image1;
    private GreenfootImage image2;
    private Car Car;
    private int frames = 0;

    public RaceTrack()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        //There are two images to switch, one is the cover page and the other is the race track.
        image1 = new GreenfootImage("first_image.png");
        image2 = new GreenfootImage("Background.png");
        setBackground(image1);
        if(getBackground() == image1)
        {frames = 0;

        }
        prepare();
    }

    public void act()

    {
        //If space is pressed it will change to image 2
        if (Greenfoot.isKeyDown("space"))
        {
            setBackground(image2);   
        }
        if(getBackground() == image2)
        {
            // Increment frame (roughly 60 frames per second)

            frames = frames + 1;

        }    
        //added in time shows
        if ((frames % 60) == 0)
        {
            String timeElapsed = Integer.toString(frames / 60);
            showText("Time:", 45, 30);
            showText(timeElapsed, 90, 30);
        }


    }
    /**
     * Prepare the world for the start of the program.
     */
    private void prepare()
    {
        // Create the car in the middle of the track
        Car = new Car();
        this.addObject(Car, 265, 360);

        InvisibleWall invisibleWall = new InvisibleWall();
        addObject(invisibleWall,30,175);
        InvisibleWall invisibleWall2 = new InvisibleWall();
        addObject(invisibleWall2,30,123);
        invisibleWall2.setLocation(36,109);
        InvisibleWall invisibleWall3 = new InvisibleWall();
        addObject(invisibleWall3,36,109);
        invisibleWall2.setLocation(42,101);
        InvisibleWall invisibleWall4 = new InvisibleWall();
        addObject(invisibleWall4,42,101);
        invisibleWall3.setLocation(45,94);
        InvisibleWall invisibleWall5 = new InvisibleWall();
        addObject(invisibleWall5,45,94);
        invisibleWall4.setLocation(51,82);
        InvisibleWall invisibleWall6 = new InvisibleWall();
        addObject(invisibleWall6,51,82);
        InvisibleWall invisibleWall7 = new InvisibleWall();
        addObject(invisibleWall7,57,56);
        invisibleWall7.setLocation(64,35);
        InvisibleWall invisibleWall8 = new InvisibleWall();
        addObject(invisibleWall8,64,35);
        invisibleWall8.setLocation(74,19);
        InvisibleWall invisibleWall9 = new InvisibleWall();
        addObject(invisibleWall9,74,19);
        invisibleWall8.setLocation(88,10);
        InvisibleWall invisibleWall10 = new InvisibleWall();
        addObject(invisibleWall10,88,10);
        invisibleWall9.setLocation(98,7);
        InvisibleWall invisibleWall11 = new InvisibleWall();
        addObject(invisibleWall11,98,7);
        invisibleWall11.setLocation(118,4);
        InvisibleWall invisibleWall12 = new InvisibleWall();
        addObject(invisibleWall12,118,4);
        InvisibleWall invisibleWall13 = new InvisibleWall();
        addObject(invisibleWall13,171,6);
        invisibleWall13.setLocation(157,1);
        InvisibleWall invisibleWall14 = new InvisibleWall();
        addObject(invisibleWall14,157,1);
        invisibleWall13.setLocation(193,12);
        InvisibleWall invisibleWall15 = new InvisibleWall();
        addObject(invisibleWall15,193,12);
        invisibleWall15.setLocation(206,19);
        InvisibleWall invisibleWall16 = new InvisibleWall();
        addObject(invisibleWall16,206,19);
        invisibleWall15.setLocation(214,28);
        InvisibleWall invisibleWall17 = new InvisibleWall();
        addObject(invisibleWall17,214,28);
        invisibleWall16.setLocation(219,37);
        InvisibleWall invisibleWall18 = new InvisibleWall();
        addObject(invisibleWall18,219,37);
        invisibleWall17.setLocation(223,48);
        InvisibleWall invisibleWall19 = new InvisibleWall();
        addObject(invisibleWall19,223,48);
        invisibleWall19.setLocation(229,67);
        InvisibleWall invisibleWall20 = new InvisibleWall();
        addObject(invisibleWall20,229,67);
        invisibleWall20.setLocation(231,81);
        InvisibleWall invisibleWall21 = new InvisibleWall();
        addObject(invisibleWall21,231,81);
        invisibleWall21.setLocation(235,93);
        InvisibleWall invisibleWall22 = new InvisibleWall();
        addObject(invisibleWall22,235,93);
        invisibleWall2.setLocation(43,86);
        invisibleWall19.setLocation(253,52);
        InvisibleWall invisibleWall23 = new InvisibleWall();
        addObject(invisibleWall23,270,44);
        invisibleWall23.setLocation(280,61);
        invisibleWall23.setLocation(281,73);
        invisibleWall23.setLocation(275,50);
        InvisibleWall invisibleWall24 = new InvisibleWall();
        addObject(invisibleWall24,314,51);
        InvisibleWall invisibleWall25 = new InvisibleWall();
        addObject(invisibleWall25,300,102);
        InvisibleWall invisibleWall26 = new InvisibleWall();
        addObject(invisibleWall26,270,101);
        invisibleWall21.setLocation(258,115);
        InvisibleWall invisibleWall27 = new InvisibleWall();
        addObject(invisibleWall27,258,115);
        invisibleWall20.setLocation(240,103);
        InvisibleWall invisibleWall28 = new InvisibleWall();
        addObject(invisibleWall28,240,103);
        invisibleWall21.setLocation(251,117);
        InvisibleWall invisibleWall29 = new InvisibleWall();
        addObject(invisibleWall29,251,117);
        InvisibleWall invisibleWall30 = new InvisibleWall();
        addObject(invisibleWall30,254,142);
        invisibleWall30.setLocation(253,165);
        InvisibleWall invisibleWall31 = new InvisibleWall();
        addObject(invisibleWall31,253,165);
        invisibleWall31.setLocation(254,184);
        InvisibleWall invisibleWall32 = new InvisibleWall();
        addObject(invisibleWall32,254,184);
        invisibleWall31.setLocation(265,174);
        InvisibleWall invisibleWall33 = new InvisibleWall();
        addObject(invisibleWall33,265,174);
        invisibleWall27.setLocation(270,138);
        InvisibleWall invisibleWall34 = new InvisibleWall();
        addObject(invisibleWall34,270,138);
        invisibleWall25.setLocation(280,118);
        InvisibleWall invisibleWall35 = new InvisibleWall();
        addObject(invisibleWall35,280,118);
        invisibleWall25.setLocation(298,105);
        InvisibleWall invisibleWall36 = new InvisibleWall();
        addObject(invisibleWall36,298,105);
        InvisibleWall invisibleWall37 = new InvisibleWall();
        addObject(invisibleWall37,330,96);
        invisibleWall37.setLocation(343,100);
        InvisibleWall invisibleWall38 = new InvisibleWall();
        addObject(invisibleWall38,343,100);
        invisibleWall38.setLocation(361,87);
        InvisibleWall invisibleWall39 = new InvisibleWall();
        addObject(invisibleWall39,361,87);
        invisibleWall37.setLocation(353,92);
        InvisibleWall invisibleWall40 = new InvisibleWall();
        addObject(invisibleWall40,353,92);
        invisibleWall37.setLocation(348,95);
        InvisibleWall invisibleWall41 = new InvisibleWall();
        addObject(invisibleWall41,348,95);
        invisibleWall38.setLocation(366,79);
        InvisibleWall invisibleWall42 = new InvisibleWall();
        addObject(invisibleWall42,366,79);
        invisibleWall39.setLocation(378,75);
        InvisibleWall invisibleWall43 = new InvisibleWall();
        addObject(invisibleWall43,378,75);
        invisibleWall43.setLocation(395,72);
        InvisibleWall invisibleWall44 = new InvisibleWall();
        addObject(invisibleWall44,395,72);
        invisibleWall44.setLocation(411,73);
        InvisibleWall invisibleWall45 = new InvisibleWall();
        addObject(invisibleWall45,411,73);
        invisibleWall45.setLocation(431,74);
        InvisibleWall invisibleWall46 = new InvisibleWall();
        addObject(invisibleWall46,431,74);
        invisibleWall46.setLocation(450,75);
        InvisibleWall invisibleWall47 = new InvisibleWall();
        addObject(invisibleWall47,450,75);
        invisibleWall47.setLocation(464,80);
        InvisibleWall invisibleWall48 = new InvisibleWall();
        addObject(invisibleWall48,464,80);
        invisibleWall47.setLocation(457,78);
        InvisibleWall invisibleWall49 = new InvisibleWall();
        addObject(invisibleWall49,457,78);
        invisibleWall46.setLocation(443,77);
        InvisibleWall invisibleWall50 = new InvisibleWall();
        addObject(invisibleWall50,443,77);
        invisibleWall45.setLocation(425,75);
        InvisibleWall invisibleWall51 = new InvisibleWall();
        addObject(invisibleWall51,425,75);
        invisibleWall39.setLocation(379,77);
        InvisibleWall invisibleWall52 = new InvisibleWall();
        addObject(invisibleWall52,379,77);
        invisibleWall38.setLocation(367,84);
        InvisibleWall invisibleWall53 = new InvisibleWall();
        addObject(invisibleWall53,367,84);
        invisibleWall48.setLocation(475,85);
        InvisibleWall invisibleWall54 = new InvisibleWall();
        addObject(invisibleWall54,475,85);
        invisibleWall48.setLocation(488,90);
        InvisibleWall invisibleWall55 = new InvisibleWall();
        addObject(invisibleWall55,488,90);
        invisibleWall54.setLocation(496,102);
        InvisibleWall invisibleWall56 = new InvisibleWall();
        addObject(invisibleWall56,496,102);
        invisibleWall54.setLocation(492,95);
        InvisibleWall invisibleWall57 = new InvisibleWall();
        addObject(invisibleWall57,492,95);
        invisibleWall48.setLocation(484,88);
        InvisibleWall invisibleWall58 = new InvisibleWall();
        addObject(invisibleWall58,484,88);
        InvisibleWall invisibleWall59 = new InvisibleWall();
        addObject(invisibleWall59,498,224);
        invisibleWall59.setLocation(486,240);
        InvisibleWall invisibleWall60 = new InvisibleWall();
        addObject(invisibleWall60,486,240);
        InvisibleWall invisibleWall61 = new InvisibleWall();
        addObject(invisibleWall61,487,266);
        invisibleWall61.setLocation(487,282);
        InvisibleWall invisibleWall62 = new InvisibleWall();
        addObject(invisibleWall62,487,282);
        invisibleWall62.setLocation(484,294);
        InvisibleWall invisibleWall63 = new InvisibleWall();
        addObject(invisibleWall63,484,294);
        invisibleWall61.setLocation(484,282);
        InvisibleWall invisibleWall64 = new InvisibleWall();
        addObject(invisibleWall64,484,282);
        invisibleWall60.setLocation(484,260);
        InvisibleWall invisibleWall65 = new InvisibleWall();
        addObject(invisibleWall65,484,260);
        invisibleWall59.setLocation(483,245);
        InvisibleWall invisibleWall66 = new InvisibleWall();
        addObject(invisibleWall66,483,245);
        InvisibleWall invisibleWall67 = new InvisibleWall();
        addObject(invisibleWall67,484,332);
        InvisibleWall invisibleWall68 = new InvisibleWall();
        addObject(invisibleWall68,482,366);
        invisibleWall68.setLocation(480,382);
        InvisibleWall invisibleWall69 = new InvisibleWall();
        addObject(invisibleWall69,480,382);
        invisibleWall69.setLocation(472,392);
        InvisibleWall invisibleWall70 = new InvisibleWall();
        addObject(invisibleWall70,472,392);
        invisibleWall68.setLocation(476,388);
        InvisibleWall invisibleWall71 = new InvisibleWall();
        addObject(invisibleWall71,476,388);
        invisibleWall69.setLocation(466,401);
        InvisibleWall invisibleWall72 = new InvisibleWall();
        addObject(invisibleWall72,466,401);
        invisibleWall70.setLocation(455,410);
        InvisibleWall invisibleWall73 = new InvisibleWall();
        addObject(invisibleWall73,455,410);
        invisibleWall69.setLocation(461,406);
        InvisibleWall invisibleWall74 = new InvisibleWall();
        addObject(invisibleWall74,461,406);
        InvisibleWall invisibleWall75 = new InvisibleWall();
        addObject(invisibleWall75,460,436);
        invisibleWall75.setLocation(474,436);
        InvisibleWall invisibleWall76 = new InvisibleWall();
        addObject(invisibleWall76,474,436);
        InvisibleWall invisibleWall77 = new InvisibleWall();
        addObject(invisibleWall77,470,481);
        invisibleWall77.setLocation(450,464);
        InvisibleWall invisibleWall78 = new InvisibleWall();
        addObject(invisibleWall78,450,464);
        invisibleWall78.setLocation(431,472);
        InvisibleWall invisibleWall79 = new InvisibleWall();
        addObject(invisibleWall79,431,472);
        invisibleWall77.setLocation(476,472);
        InvisibleWall invisibleWall80 = new InvisibleWall();
        addObject(invisibleWall80,476,472);
        invisibleWall75.setLocation(475,441);
        InvisibleWall invisibleWall81 = new InvisibleWall();
        addObject(invisibleWall81,475,441);
        invisibleWall73.setLocation(475,434);
        InvisibleWall invisibleWall82 = new InvisibleWall();
        addObject(invisibleWall82,475,434);
        InvisibleWall invisibleWall83 = new InvisibleWall();
        addObject(invisibleWall83,405,443);
        invisibleWall83.setLocation(413,429);
        InvisibleWall invisibleWall84 = new InvisibleWall();
        addObject(invisibleWall84,413,429);
        invisibleWall83.setLocation(426,422);
        InvisibleWall invisibleWall85 = new InvisibleWall();
        addObject(invisibleWall85,426,422);
        invisibleWall72.setLocation(445,418);
        InvisibleWall invisibleWall86 = new InvisibleWall();
        addObject(invisibleWall86,445,418);
        invisibleWall70.setLocation(450,411);
        InvisibleWall invisibleWall87 = new InvisibleWall();
        addObject(invisibleWall87,450,411);
        invisibleWall70.setLocation(447,415);
        InvisibleWall invisibleWall88 = new InvisibleWall();
        addObject(invisibleWall88,447,415);
        invisibleWall73.setLocation(439,418);
        InvisibleWall invisibleWall89 = new InvisibleWall();
        addObject(invisibleWall89,439,418);
        invisibleWall83.setLocation(427,418);
        InvisibleWall invisibleWall90 = new InvisibleWall();
        addObject(invisibleWall90,427,418);
        invisibleWall83.setLocation(399,422);
        InvisibleWall invisibleWall91 = new InvisibleWall();
        addObject(invisibleWall91,399,422);
        InvisibleWall invisibleWall92 = new InvisibleWall();
        addObject(invisibleWall92,372,420);
        InvisibleWall invisibleWall93 = new InvisibleWall();
        addObject(invisibleWall93,319,419);
        invisibleWall83.setLocation(382,420);
        InvisibleWall invisibleWall94 = new InvisibleWall();
        addObject(invisibleWall94,382,420);
        invisibleWall72.setLocation(443,416);
        InvisibleWall invisibleWall95 = new InvisibleWall();
        addObject(invisibleWall95,443,416);
        invisibleWall70.setLocation(458,408);
        InvisibleWall invisibleWall96 = new InvisibleWall();
        addObject(invisibleWall96,458,408);
        invisibleWall69.setLocation(469,397);
        InvisibleWall invisibleWall97 = new InvisibleWall();
        addObject(invisibleWall97,469,397);
        invisibleWall69.setLocation(464,403);
        InvisibleWall invisibleWall98 = new InvisibleWall();
        addObject(invisibleWall98,464,403);
        invisibleWall93.setLocation(330,420);
        InvisibleWall invisibleWall99 = new InvisibleWall();
        addObject(invisibleWall99,330,420);
        invisibleWall93.setLocation(334,437);
        InvisibleWall invisibleWall100 = new InvisibleWall();
        addObject(invisibleWall100,334,437);
        InvisibleWall invisibleWall101 = new InvisibleWall();
        addObject(invisibleWall101,342,466);
        invisibleWall101.setLocation(364,466);
        InvisibleWall invisibleWall102 = new InvisibleWall();
        addObject(invisibleWall102,364,466);
        invisibleWall102.setLocation(372,486);
        InvisibleWall invisibleWall103 = new InvisibleWall();
        addObject(invisibleWall103,372,486);
        invisibleWall103.setLocation(393,485);
        InvisibleWall invisibleWall104 = new InvisibleWall();
        addObject(invisibleWall104,393,485);
        invisibleWall79.setLocation(435,491);
        InvisibleWall invisibleWall105 = new InvisibleWall();
        addObject(invisibleWall105,435,491);
        InvisibleWall invisibleWall106 = new InvisibleWall();
        addObject(invisibleWall106,301,475);
        invisibleWall101.setLocation(339,479);
        InvisibleWall invisibleWall107 = new InvisibleWall();
        addObject(invisibleWall107,339,479);
        InvisibleWall invisibleWall108 = new InvisibleWall();
        addObject(invisibleWall108,300,447);
        invisibleWall93.setLocation(296,433);
        InvisibleWall invisibleWall109 = new InvisibleWall();
        addObject(invisibleWall109,296,433);
        invisibleWall93.setLocation(295,424);
        InvisibleWall invisibleWall110 = new InvisibleWall();
        addObject(invisibleWall110,295,424);
        invisibleWall93.setLocation(301,417);
        InvisibleWall invisibleWall111 = new InvisibleWall();
        addObject(invisibleWall111,301,417);
        invisibleWall93.setLocation(298,416);
        InvisibleWall invisibleWall112 = new InvisibleWall();
        addObject(invisibleWall112,298,416);
        invisibleWall109.setLocation(273,420);
        InvisibleWall invisibleWall113 = new InvisibleWall();
        addObject(invisibleWall113,273,420);
        invisibleWall113.setLocation(257,419);
        InvisibleWall invisibleWall114 = new InvisibleWall();
        addObject(invisibleWall114,257,419);
        invisibleWall113.setLocation(254,422);
        InvisibleWall invisibleWall115 = new InvisibleWall();
        addObject(invisibleWall115,254,422);
        invisibleWall113.setLocation(249,427);
        InvisibleWall invisibleWall116 = new InvisibleWall();
        addObject(invisibleWall116,249,427);
        invisibleWall114.setLocation(247,425);
        InvisibleWall invisibleWall117 = new InvisibleWall();
        addObject(invisibleWall117,247,425);
        invisibleWall114.setLocation(235,432);
        InvisibleWall invisibleWall118 = new InvisibleWall();
        addObject(invisibleWall118,235,432);
        invisibleWall114.setLocation(240,430);
        InvisibleWall invisibleWall119 = new InvisibleWall();
        addObject(invisibleWall119,240,430);
        invisibleWall114.setLocation(245,429);
        InvisibleWall invisibleWall120 = new InvisibleWall();
        addObject(invisibleWall120,245,429);
        InvisibleWall invisibleWall121 = new InvisibleWall();
        addObject(invisibleWall121,240,457);
        invisibleWall121.setLocation(251,466);
        InvisibleWall invisibleWall122 = new InvisibleWall();
        addObject(invisibleWall122,251,466);
        invisibleWall121.setLocation(256,479);
        InvisibleWall invisibleWall123 = new InvisibleWall();
        addObject(invisibleWall123,256,479);
        invisibleWall121.setLocation(227,479);
        InvisibleWall invisibleWall124 = new InvisibleWall();
        addObject(invisibleWall124,227,479);
        InvisibleWall invisibleWall125 = new InvisibleWall();
        addObject(invisibleWall125,198,473);
        InvisibleWall invisibleWall126 = new InvisibleWall();
        addObject(invisibleWall126,166,474);
        InvisibleWall invisibleWall127 = new InvisibleWall();
        addObject(invisibleWall127,131,473);
        InvisibleWall invisibleWall128 = new InvisibleWall();
        addObject(invisibleWall128,105,473);
        invisibleWall128.setLocation(83,472);
        InvisibleWall invisibleWall129 = new InvisibleWall();
        addObject(invisibleWall129,83,472);
        InvisibleWall invisibleWall130 = new InvisibleWall();
        addObject(invisibleWall130,57,472);
        InvisibleWall invisibleWall131 = new InvisibleWall();
        addObject(invisibleWall131,29,472);
        invisibleWall131.setLocation(17,475);
        InvisibleWall invisibleWall132 = new InvisibleWall();
        addObject(invisibleWall132,17,475);
        invisibleWall130.setLocation(40,478);
        InvisibleWall invisibleWall133 = new InvisibleWall();
        addObject(invisibleWall133,40,478);
        invisibleWall129.setLocation(77,478);
        InvisibleWall invisibleWall134 = new InvisibleWall();
        addObject(invisibleWall134,77,478);
        invisibleWall127.setLocation(112,478);
        InvisibleWall invisibleWall135 = new InvisibleWall();
        addObject(invisibleWall135,112,478);
        invisibleWall127.setLocation(120,478);
        InvisibleWall invisibleWall136 = new InvisibleWall();
        addObject(invisibleWall136,120,478);
        invisibleWall126.setLocation(161,484);
        InvisibleWall invisibleWall137 = new InvisibleWall();
        addObject(invisibleWall137,161,484);
        invisibleWall124.setLocation(202,489);
        InvisibleWall invisibleWall138 = new InvisibleWall();
        addObject(invisibleWall138,202,489);
        invisibleWall125.setLocation(195,449);
        InvisibleWall invisibleWall139 = new InvisibleWall();
        addObject(invisibleWall139,195,449);
        invisibleWall139.setLocation(194,443);
        InvisibleWall invisibleWall140 = new InvisibleWall();
        addObject(invisibleWall140,194,443);
        invisibleWall117.setLocation(222,441);
        InvisibleWall invisibleWall141 = new InvisibleWall();
        addObject(invisibleWall141,222,441);
        invisibleWall116.setLocation(225,439);
        InvisibleWall invisibleWall142 = new InvisibleWall();
        addObject(invisibleWall142,225,439);
        invisibleWall114.setLocation(232,436);
        InvisibleWall invisibleWall143 = new InvisibleWall();
        addObject(invisibleWall143,232,436);
        InvisibleWall invisibleWall144 = new InvisibleWall();
        addObject(invisibleWall144,146,445);
        invisibleWall144.setLocation(144,443);
        InvisibleWall invisibleWall145 = new InvisibleWall();
        addObject(invisibleWall145,144,443);
        invisibleWall144.setLocation(121,443);
        InvisibleWall invisibleWall146 = new InvisibleWall();
        addObject(invisibleWall146,121,443);
        invisibleWall146.setLocation(100,442);
        InvisibleWall invisibleWall147 = new InvisibleWall();
        addObject(invisibleWall147,100,442);
        InvisibleWall invisibleWall148 = new InvisibleWall();
        addObject(invisibleWall148,74,442);
        invisibleWall148.setLocation(53,441);
        InvisibleWall invisibleWall149 = new InvisibleWall();
        addObject(invisibleWall149,53,441);
        invisibleWall149.setLocation(47,440);
        InvisibleWall invisibleWall150 = new InvisibleWall();
        addObject(invisibleWall150,47,440);
        invisibleWall149.setLocation(43,435);
        InvisibleWall invisibleWall151 = new InvisibleWall();
        addObject(invisibleWall151,43,435);
        invisibleWall149.setLocation(34,432);
        InvisibleWall invisibleWall152 = new InvisibleWall();
        addObject(invisibleWall152,34,432);
        invisibleWall149.setLocation(30,426);
        InvisibleWall invisibleWall153 = new InvisibleWall();
        addObject(invisibleWall153,30,426);
        invisibleWall150.setLocation(22,424);
        InvisibleWall invisibleWall154 = new InvisibleWall();
        addObject(invisibleWall154,22,424);
        invisibleWall151.setLocation(19,417);
        InvisibleWall invisibleWall155 = new InvisibleWall();
        addObject(invisibleWall155,19,417);
        invisibleWall152.setLocation(15,412);
        InvisibleWall invisibleWall156 = new InvisibleWall();
        addObject(invisibleWall156,15,412);
        invisibleWall154.setLocation(11,400);
        InvisibleWall invisibleWall157 = new InvisibleWall();
        addObject(invisibleWall157,11,400);
        invisibleWall156.setLocation(8,388);
        InvisibleWall invisibleWall158 = new InvisibleWall();
        addObject(invisibleWall158,8,388);
        invisibleWall157.setLocation(7,378);
        InvisibleWall invisibleWall159 = new InvisibleWall();
        addObject(invisibleWall159,7,378);
        invisibleWall159.setLocation(5,361);
        InvisibleWall invisibleWall160 = new InvisibleWall();
        addObject(invisibleWall160,5,361);
        invisibleWall160.setLocation(6,349);
        InvisibleWall invisibleWall161 = new InvisibleWall();
        addObject(invisibleWall161,6,349);
        InvisibleWall invisibleWall162 = new InvisibleWall();
        addObject(invisibleWall162,4,317);
        invisibleWall162.setLocation(6,293);
        InvisibleWall invisibleWall163 = new InvisibleWall();
        addObject(invisibleWall163,6,293);
        invisibleWall162.setLocation(4,300);
        InvisibleWall invisibleWall164 = new InvisibleWall();
        addObject(invisibleWall164,4,300);
        invisibleWall163.setLocation(7,289);
        InvisibleWall invisibleWall165 = new InvisibleWall();
        addObject(invisibleWall165,7,289);
        invisibleWall163.setLocation(9,283);
        InvisibleWall invisibleWall166 = new InvisibleWall();
        addObject(invisibleWall166,9,283);
        invisibleWall163.setLocation(8,291);
        InvisibleWall invisibleWall167 = new InvisibleWall();
        addObject(invisibleWall167,8,291);
        invisibleWall163.setLocation(12,283);
        InvisibleWall invisibleWall168 = new InvisibleWall();
        addObject(invisibleWall168,12,283);
        invisibleWall163.setLocation(15,278);
        InvisibleWall invisibleWall169 = new InvisibleWall();
        addObject(invisibleWall169,15,278);
        invisibleWall163.setLocation(20,271);
        InvisibleWall invisibleWall170 = new InvisibleWall();
        addObject(invisibleWall170,20,271);
        invisibleWall165.setLocation(24,264);
        InvisibleWall invisibleWall171 = new InvisibleWall();
        addObject(invisibleWall171,24,264);
        invisibleWall166.setLocation(27,260);
        InvisibleWall invisibleWall172 = new InvisibleWall();
        addObject(invisibleWall172,27,260);
        invisibleWall169.setLocation(30,256);
        InvisibleWall invisibleWall173 = new InvisibleWall();
        addObject(invisibleWall173,30,256);
        invisibleWall171.setLocation(30,245);
        InvisibleWall invisibleWall174 = new InvisibleWall();
        addObject(invisibleWall174,30,245);
        invisibleWall173.setLocation(28,232);
        InvisibleWall invisibleWall175 = new InvisibleWall();
        addObject(invisibleWall175,28,232);
        invisibleWall174.setLocation(28,220);
        InvisibleWall invisibleWall176 = new InvisibleWall();
        addObject(invisibleWall176,28,220);
        invisibleWall175.setLocation(28,209);
        InvisibleWall invisibleWall177 = new InvisibleWall();
        addObject(invisibleWall177,28,209);
        invisibleWall.setLocation(30,184);
        InvisibleWall invisibleWall178 = new InvisibleWall();
        addObject(invisibleWall178,30,184);
        invisibleWall.setLocation(30,158);
        InvisibleWall invisibleWall179 = new InvisibleWall();
        addObject(invisibleWall179,30,158);
        invisibleWall179.setLocation(31,145);
        InvisibleWall invisibleWall180 = new InvisibleWall();
        addObject(invisibleWall180,31,145);
        invisibleWall2.setLocation(33,113);
        InvisibleWall invisibleWall181 = new InvisibleWall();
        addObject(invisibleWall181,33,113);
        invisibleWall2.setLocation(37,109);
        InvisibleWall invisibleWall182 = new InvisibleWall();
        addObject(invisibleWall182,37,109);
        invisibleWall2.setLocation(38,107);
        InvisibleWall invisibleWall183 = new InvisibleWall();
        addObject(invisibleWall183,38,107);
        invisibleWall2.setLocation(41,103);
        InvisibleWall invisibleWall184 = new InvisibleWall();
        addObject(invisibleWall184,41,103);
        invisibleWall2.setLocation(43,98);
        InvisibleWall invisibleWall185 = new InvisibleWall();
        addObject(invisibleWall185,43,98);
        invisibleWall2.setLocation(47,93);
        InvisibleWall invisibleWall186 = new InvisibleWall();
        addObject(invisibleWall186,47,93);
        invisibleWall2.setLocation(49,87);
        InvisibleWall invisibleWall187 = new InvisibleWall();
        addObject(invisibleWall187,49,87);
        invisibleWall2.setLocation(52,79);
        InvisibleWall invisibleWall188 = new InvisibleWall();
        addObject(invisibleWall188,52,79);
        invisibleWall3.setLocation(55,73);
        InvisibleWall invisibleWall189 = new InvisibleWall();
        addObject(invisibleWall189,55,73);
        invisibleWall4.setLocation(56,66);
        InvisibleWall invisibleWall190 = new InvisibleWall();
        addObject(invisibleWall190,56,66);
        invisibleWall7.setLocation(58,56);
        InvisibleWall invisibleWall191 = new InvisibleWall();
        addObject(invisibleWall191,58,56);
        invisibleWall7.setLocation(61,49);
        InvisibleWall invisibleWall192 = new InvisibleWall();
        addObject(invisibleWall192,61,49);
        invisibleWall7.setLocation(64,42);
        InvisibleWall invisibleWall193 = new InvisibleWall();
        addObject(invisibleWall193,64,42);
        invisibleWall7.setLocation(69,26);
        InvisibleWall invisibleWall194 = new InvisibleWall();
        addObject(invisibleWall194,69,26);
        invisibleWall7.setLocation(66,34);
        InvisibleWall invisibleWall195 = new InvisibleWall();
        addObject(invisibleWall195,66,34);
        invisibleWall7.setLocation(72,25);
        InvisibleWall invisibleWall196 = new InvisibleWall();
        addObject(invisibleWall196,72,25);
        invisibleWall7.setLocation(68,33);
        InvisibleWall invisibleWall197 = new InvisibleWall();
        addObject(invisibleWall197,68,33);
        invisibleWall7.setLocation(74,24);
        InvisibleWall invisibleWall198 = new InvisibleWall();
        addObject(invisibleWall198,74,24);
        invisibleWall7.setLocation(71,28);
        InvisibleWall invisibleWall199 = new InvisibleWall();
        addObject(invisibleWall199,71,28);
        invisibleWall7.setLocation(77,20);
        InvisibleWall invisibleWall200 = new InvisibleWall();
        addObject(invisibleWall200,77,20);
        invisibleWall7.setLocation(86,16);
        InvisibleWall invisibleWall201 = new InvisibleWall();
        addObject(invisibleWall201,86,16);
        invisibleWall8.setLocation(95,13);
        InvisibleWall invisibleWall202 = new InvisibleWall();
        addObject(invisibleWall202,95,13);
        invisibleWall8.setLocation(112,10);
        InvisibleWall invisibleWall203 = new InvisibleWall();
        addObject(invisibleWall203,112,10);
        invisibleWall11.setLocation(137,7);
        InvisibleWall invisibleWall204 = new InvisibleWall();
        addObject(invisibleWall204,137,7);
        invisibleWall14.setLocation(156,8);
        InvisibleWall invisibleWall205 = new InvisibleWall();
        addObject(invisibleWall205,156,8);
        invisibleWall13.setLocation(176,10);
        InvisibleWall invisibleWall206 = new InvisibleWall();
        addObject(invisibleWall206,176,10);
        invisibleWall13.setLocation(193,13);
        InvisibleWall invisibleWall207 = new InvisibleWall();
        addObject(invisibleWall207,193,13);
        invisibleWall13.setLocation(202,18);
        InvisibleWall invisibleWall208 = new InvisibleWall();
        addObject(invisibleWall208,202,18);
        invisibleWall13.setLocation(205,27);
        InvisibleWall invisibleWall209 = new InvisibleWall();
        addObject(invisibleWall209,205,27);
        invisibleWall15.setLocation(213,45);
        InvisibleWall invisibleWall210 = new InvisibleWall();
        addObject(invisibleWall210,213,45);
        invisibleWall16.setLocation(220,59);
        InvisibleWall invisibleWall211 = new InvisibleWall();
        addObject(invisibleWall211,220,59);
        invisibleWall19.setLocation(227,81);
        InvisibleWall invisibleWall212 = new InvisibleWall();
        addObject(invisibleWall212,227,81);
        InvisibleWall invisibleWall213 = new InvisibleWall();
        addObject(invisibleWall213,25,18);
        InvisibleWall invisibleWall214 = new InvisibleWall();
        addObject(invisibleWall214,6,44);
        InvisibleWall invisibleWall215 = new InvisibleWall();
        addObject(invisibleWall215,4,78);
        InvisibleWall invisibleWall216 = new InvisibleWall();
        addObject(invisibleWall216,6,115);
        InvisibleWall invisibleWall217 = new InvisibleWall();
        addObject(invisibleWall217,2,159);
        InvisibleWall invisibleWall218 = new InvisibleWall();
        addObject(invisibleWall218,2,220);
        invisibleWall176.setLocation(3,202);
        InvisibleWall invisibleWall219 = new InvisibleWall();
        addObject(invisibleWall219,3,202);
        invisibleWall175.setLocation(30,211);
        InvisibleWall invisibleWall220 = new InvisibleWall();
        addObject(invisibleWall220,30,211);
        InvisibleWall invisibleWall221 = new InvisibleWall();
        addObject(invisibleWall221,251,2);
        invisibleWall23.setLocation(269,33);
        InvisibleWall invisibleWall222 = new InvisibleWall();
        addObject(invisibleWall222,269,33);
        InvisibleWall invisibleWall223 = new InvisibleWall();
        addObject(invisibleWall223,301,9);
        InvisibleWall invisibleWall224 = new InvisibleWall();
        addObject(invisibleWall224,330,16);
        InvisibleWall invisibleWall225 = new InvisibleWall();
        addObject(invisibleWall225,359,48);
        invisibleWall24.setLocation(302,67);
        InvisibleWall invisibleWall226 = new InvisibleWall();
        addObject(invisibleWall226,302,67);
        InvisibleWall invisibleWall227 = new InvisibleWall();
        addObject(invisibleWall227,401,22);
        InvisibleWall invisibleWall228 = new InvisibleWall();
        addObject(invisibleWall228,373,17);
        InvisibleWall invisibleWall229 = new InvisibleWall();
        addObject(invisibleWall229,446,30);
        invisibleWall229.setLocation(428,34);
        InvisibleWall invisibleWall230 = new InvisibleWall();
        addObject(invisibleWall230,428,34);
        invisibleWall229.setLocation(438,6);
        InvisibleWall invisibleWall231 = new InvisibleWall();
        addObject(invisibleWall231,438,6);
        InvisibleWall invisibleWall232 = new InvisibleWall();
        addObject(invisibleWall232,491,15);
        invisibleWall49.setLocation(479,54);
        InvisibleWall invisibleWall233 = new InvisibleWall();
        addObject(invisibleWall233,479,54);
        invisibleWall229.setLocation(462,14);
        InvisibleWall invisibleWall234 = new InvisibleWall();
        addObject(invisibleWall234,462,14);
        InvisibleWall invisibleWall235 = new InvisibleWall();
        addObject(invisibleWall235,495,137);
        InvisibleWall invisibleWall236 = new InvisibleWall();
        addObject(invisibleWall236,499,176);
        invisibleWall79.setLocation(412,451);
        invisibleWall79.setLocation(412,451);
        invisibleWall121.setLocation(232,462);
        invisibleWall121.setLocation(232,462);
        invisibleWall144.setLocation(144,432);
        InvisibleWall invisibleWall237 = new InvisibleWall();
        addObject(invisibleWall237,120,334);
        invisibleWall237.setLocation(138,327);
        InvisibleWall invisibleWall238 = new InvisibleWall();
        addObject(invisibleWall238,138,327);
        invisibleWall237.setLocation(129,325);
        InvisibleWall invisibleWall239 = new InvisibleWall();
        addObject(invisibleWall239,129,325);
        invisibleWall238.setLocation(136,308);
        InvisibleWall invisibleWall240 = new InvisibleWall();
        addObject(invisibleWall240,136,308);
        invisibleWall240.setLocation(137,294);
        InvisibleWall invisibleWall241 = new InvisibleWall();
        addObject(invisibleWall241,137,294);
        InvisibleWall invisibleWall242 = new InvisibleWall();
        addObject(invisibleWall242,146,268);
        invisibleWall242.setLocation(139,243);
        InvisibleWall invisibleWall243 = new InvisibleWall();
        addObject(invisibleWall243,139,243);
        InvisibleWall invisibleWall244 = new InvisibleWall();
        addObject(invisibleWall244,141,197);
        invisibleWall244.setLocation(145,175);
        InvisibleWall invisibleWall245 = new InvisibleWall();
        addObject(invisibleWall245,145,175);
        invisibleWall245.setLocation(141,157);
        InvisibleWall invisibleWall246 = new InvisibleWall();
        addObject(invisibleWall246,141,157);
        InvisibleWall invisibleWall247 = new InvisibleWall();
        addObject(invisibleWall247,148,264);
        invisibleWall242.setLocation(169,276);
        InvisibleWall invisibleWall248 = new InvisibleWall();
        addObject(invisibleWall248,169,276);
        invisibleWall248.setLocation(184,286);
        InvisibleWall invisibleWall249 = new InvisibleWall();
        addObject(invisibleWall249,184,286);
        invisibleWall238.setLocation(159,334);
        InvisibleWall invisibleWall250 = new InvisibleWall();
        addObject(invisibleWall250,159,334);
        invisibleWall250.setLocation(180,325);
        InvisibleWall invisibleWall251 = new InvisibleWall();
        addObject(invisibleWall251,180,325);
        InvisibleWall invisibleWall252 = new InvisibleWall();
        addObject(invisibleWall252,220,292);
        invisibleWall252.setLocation(214,314);
        InvisibleWall invisibleWall253 = new InvisibleWall();
        addObject(invisibleWall253,214,314);
        InvisibleWall invisibleWall254 = new InvisibleWall();
        addObject(invisibleWall254,247,305);
        InvisibleWall invisibleWall255 = new InvisibleWall();
        addObject(invisibleWall255,286,312);
        InvisibleWall invisibleWall256 = new InvisibleWall();
        addObject(invisibleWall256,312,312);
        InvisibleWall invisibleWall257 = new InvisibleWall();
        addObject(invisibleWall257,337,308);
        invisibleWall257.setLocation(355,308);
        InvisibleWall invisibleWall258 = new InvisibleWall();
        addObject(invisibleWall258,355,308);
        invisibleWall258.setLocation(369,308);
        InvisibleWall invisibleWall259 = new InvisibleWall();
        addObject(invisibleWall259,369,308);
        invisibleWall258.setLocation(370,290);
        InvisibleWall invisibleWall260 = new InvisibleWall();
        addObject(invisibleWall260,370,290);
        invisibleWall257.setLocation(358,295);
        InvisibleWall invisibleWall261 = new InvisibleWall();
        addObject(invisibleWall261,358,295);
        invisibleWall257.setLocation(351,298);
        InvisibleWall invisibleWall262 = new InvisibleWall();
        addObject(invisibleWall262,351,298);
        invisibleWall260.setLocation(363,277);
        InvisibleWall invisibleWall263 = new InvisibleWall();
        addObject(invisibleWall263,363,277);
        InvisibleWall invisibleWall264 = new InvisibleWall();
        addObject(invisibleWall264,375,251);
        InvisibleWall invisibleWall265 = new InvisibleWall();
        addObject(invisibleWall265,383,209);
        invisibleWall265.setLocation(368,214);
        InvisibleWall invisibleWall266 = new InvisibleWall();
        addObject(invisibleWall266,368,214);
        startpoint startpoint = new startpoint();
        addObject(startpoint,299,360);

    }

}
