public class songsDatabase {

    public static String jacketUrl;

    public static String[] chartsAll = { "Select a chart",
        "[X]",
        "#1f1e33",
        "〇、",
        "1F√",
        "7thSense",
        "99 Glooms",
        "A Wandering Melody of Love",
        "Abstruse Dilemma",
        "Aegleseeker",
        "Ai Drew",
        "AI[UE]OON",
        "Aleph-0",
        "Alexandrite",
        "Alice à la mode",
        "Alice's Suitcase",
        "Alone & Lorn",
        "Altair (feat. *spiLa*)",
        "Altale",
        "AlterAle",
        "AMAZING MIGHTYYYY!!!!",
        "Amekagura",
        "amygdata",
        "Anökumene",
        "Antagonism",
        "Antithese",
        "April showers",
        "Arcahv",
        "Arcana Eden",
        "Arghena",
        "Ascent",
        "Astra walkthrough",
        "Astral tale",
        "AttraqtiA",
        "Aurgelmir",
        "Auxesia",
        "Avant Raze",
        "Ävril -Flicka i krans-",
        "Awaken In Ruins",
        "Axium Crisis",
        "B.B.K.K.B.K.K.",
        "Babaroque",
        "BADTEK",
        "Bamboo",
        "BATTLE NO.1",
        "Be There",
        "Beside You",
        "Black Lotus",
        "Black Territory",
        "Blaster",
        "Blocked Library",
        "Blossoms",
        "BLRINK",
        "blue comet",
        "Blue Rose",
        "Bookmaker (2D Version)",
        "Brand new world",
        "BUCHiGiRE Berserker",
        "Bullet Waiting for Me (James Landino remix)",
        "Call My Name feat. Yukacco",
        "Callima Karma",
        "Can I Friend You on Bassbook? Lol",
        "Capella",
        "carmine:scythe",
        "CHAOS",
        "Chelsea",
        "Chromafill",
        "Chronicle",
        "Chronostasis",
        "Climax",
        "Clotho and the stargazer",
        "Clotho and the stargazer (Eternal)",
        "Coastal Highway",
        "cocoro*cosmetic",
        "conflict",
        "corps-sans-organes",
        "Corruption",
        "Cosmica",
        "Cosmo Pop Funclub",
        "Crimson Throne",
        "CROSS†OVER",
        "CROSS†SOUL",
        "cry of viyella",
        "Crystal Gravity",
        "Cyaegha",
        "cyanine",
        "Cybernecia Catharsis",
        "CYCLES",
        "Dancin' on a Cat's Paw",
        "Dandelion",
        "Dantalion",
        "DataErr0r",
        "Dazzle hop",
        "DDD",
        "Defection",
        "Dement ~after legend~",
        "Désive",
        "Désive (Eternal)",
        "Devillic Sphere",
        "Dialnote",
        "Diode",
        "Distorted Fate",
        "Distorted Fate (Eternal)",
        "Divine Light of Myriad",
        "Dot to Dot feat. shully",
        "Dreadnought",
        "Dream goes on",
        "Dreamin' Attraction!!",
        "DRG",
        "dropdead",
        "DX Choseinou Full Metal Shojo",
        "Dynitikós",
        "Eccentric Tale",
        "eden",
        "Ego Eimi",
        "Einherjar Joker",
        "Empire of Winter",
        "enchanted love",
        "ENERGY SYNERGY MATRIX",
        "Equilibrium",
        "Essence of Twilight",
        "Ether Strike",
        "Evening in Scarlet",
        "Evoltex (poppi'n mix)",
        "Faint Light (Arcaea Edit)",
        "Fairytale",
        "Fallensquare",
        "False Embellishment",
        "FANTA5Y",
        "Far Away Light",
        "Feels So Right feat. Renko",
        "Felis",
        "felys final remix",
        "Filament",
        "Final Step!",
        "First Snow",
        "Flashback",
        "Floating World",
        "FLUFFY FLASH",
        "Flyburg and Endroll",
        "Fracture Ray",
        "Free Myself",
        "FREEF4LL",
        "G e n g a o z o",
        "Galactic Love",
        "Galaxy Friends",
        "Garakuta Doll Play",
        "Gekka (Short Version)",
        "Genesis",
        "Genesis (CHUNITHM)",
        "GENOCIDER",
        "GIMME DA BLOOD",
        "GIMMICK",
        "Give Me a Nightmare",
        "GLORY：ROAD",
        "Glow",
        "goldenslaughterer",
        "Good bye, Merry-Go-Round.",
        "GOODTEK (Arcaea Edit)",
        "Got hive of Ra",
        "Grievous Lady",
        "Grimheart",
        "Halcyon",
        "Hall of Mirrors",
        "Harutopia ~Utopia of Spring~",
        "Haze of Autumn",
        "Head BONK ache",
        "Heart",
        "Heart Jackin'",
        "Heavenly caress",
        "Heavensdoor",
        "HELLOHELL",
        "HELLOHELL (Eternal)",
        "Hiiro Gekka, Kyoushou no Zetsu (nayuta 2017 ver.)",
        "Hikari",
        "HIVEMIND",
        "Hotarubi no Yuki",
        "Hybris (The one who shattered)",
        "I've heard it said",
        "Iconoclast",
        "Ignotus",
        "	͟͝͞Ⅱ́̕",
        "Ikazuchi",
        "Illegal Paradise",
        "IMPACT",
        "Impure Bird",
        "Infinite Strife,",
        "Infinity Heaven",
        "init()",
        "inkar-usi",
        "Innocence",
        "Innocence (Eternal)",
        "INTERNET OVERDOSE",
        "INTERNET YAMERO",
        "IONOSTREAM",
        "IONOSTREAM (Eternal)",
        "IZANA",
        "Jingle",
        "Jingle (Eternal)",
        "Journey",
        "Jump",
        "Kanagawa Cyber Culvert",
        "Kanbu de Tomatte Sugu Tokeru",
        "Kanjou no Matenrou ～Arr.Demetori",
        "Kissing Lucifer",
        "KYOREN ROMANCE",
        "La'qryma of the Wasteland",
        "LAMIA",
        "Lapis",
        "Last",
        "lastendconductor",
        "Lawless Point",
        "Lazy Addiction",
        "Leave All Behind",
        "Let you DIVE! (nitro rmx)",
        "Let's Rock (Arcaea mix)",
        "Lethaeus",
        "Lethal Voltage",
        "Libertas",
        "Life is PIANO",
        "Lightning Screw",
        "Lights of Muse",
        "Linear Accelerator",
        "Live Fast Die Young",
        "LIVHT MY WΔY",
        "Logos",
        "Löschen",
        "Lost Civilization",
        "Lost Desire",
        "Lost Emotion feat. nomico",
        "Lost in the Abyss",
        "Loveless Dress",
        "Lucid Traveler",
        "Lucifer",
        "Lumia",
        "Luna Rossa",
        "LunarOrbit -believe in the Espebranch road-",
        "Macrocosmic Modulation",
        "Magnolia",
        "MAHOROBA",
        "Malicious Mischance",
        "Manic Jeer",
        "MANTIS (Arcaea Ultra-Bloodrush VIP)",
        "Masquerade Legion",
        "MAXRAGE",
        "Maze No.9",
        "Mazy Metroplex",
        "Medusa",
        "Memory Forest",
        "memoryfactory.lzh",
        "MERLIN",
        "Meta-Mysteria",
        "Metallic Punisher",
        "MIRINAE",
        "Mirzam",
        "Misdeed -la bonté de Dieu et l'origine du mal-",
        "Modelista",
        "Monochrome Princess",
        "Moonheart",
        "Moonlight of Sand Castle",
        "MORNINGLOOM",
        "MORNINGLOOM (Eternal)",
        "Nameless Passion",
        "NEO WINGS",
        "New York Back Raise",
        "next to you",
        "Nhelv",
        "Nirv lucE",
        "NULCTRL",
        "NULL APOPHENIA",
        "nέo κósmo",
        "Oblivia",
        "OMAKENO Stroke",
        "On And On!! feat. Jenga",
        "One Last Drive",
        "Oracle",
        "Oshama Scramble!",
        "ouroboros -twin stroke of the end-",
        "Ouvertüre",
        "Overwhelm",
        "Paper Witch",
        "Paradise",
        "Particle Arts",
        "Party Vinyl",
        "Pentiment",
        "Phantasia",
        "PICO-Pico-Translation!",
        "PRAGMATISM",
        "Primeval Texture",
        "PRIMITIVE LIGHTS",
        "Prism",
        "Protoflicker",
        "PUPA",
        "Purgatorium",
        "Purple Verse",
        "Qovat",
        "qualia -ideaesthesia-",
        "Quon (Feryquitous)",
        "Quon",
        "Rabbit In The Black Room",
        "Raven's Pride",
        "REconstruction",
        "Red and Blue",
        "Red and Blue and Green",
        "Redolent Shape",
        "Redraw the Colorless World",
        "Reinvent",
        "REKKA RESONANCE",
        "Relentless",
        "Remind the Souls (Short Version)",
        "ReviXy",
        "RGB",
        "Ringed Genesis",
        "Rise",
        "Rise of the World",
        "Romance Wars",
        "Rugie",
        "SACRIFICE feat. ayame",
        "SAIKYO STRONGER",
        "Sakura Fubuki",
        "san skia",
        "Sayonara Hatsukoi",
        "Sayonara Hatsukoi (Eternal)",
        "Scarlet Cage",
        "Scarlet Lance",
        "Seclusion",
        "Senkyou",
        "Shades of Light in a Transcendent Realm",
        "Sheriruth",
        "Sheriruth (Laur Remix)",
        "Silent Rush",
        "Singularity",
        "Small Cloud Sugar Candy",
        "Snow White",
        "Solitary Dream",
        "SOUNDWiTCH",
        "Specta",
        "Spider's Thread",
        "STAGER (ALL STAGE CLEAR)",
        "Stasis",
        "Stratoliner",
        "Strongholds",
        "Sulfur",
        "Summer Fireworks of Love",
        "Suomi",
        "Suomi (Eternal)",
        "SUPERNOVA",
        "Surrender",
        "Syro",
        "syūten",
        "Technicolour",
        "Tempestissimo",
        "TEmPTaTiON",
        "TeraVolt",
        "Teriqma",
        "Testify",
        "The Formula",
        "The Message",
        "The Survivor (Game Edit)",
        "THE ULTIMACY",
        "Tie me down gently",
        "Tiferet",
        "To the Furthest Dream",
        "To the Milky Way",
        "To: Alice Liddell",
        "Transient Space",
        "Trap Crow",
        "trappola bewitching",
        "Trrricksters!!",
        "Tsuki ni Murakumo, Hana ni Kaze",
        "Turbocharger",
        "Ultimate taste",
        "ultradiaxon-N3",
        "UNKNOWN LEVELS",
        "Used to be",
        "Valhalla:0",
        "Vandalism",
        "VECTOЯ",
        "Vexaria",
        "Vicious Heroism",
        "Vindication",
        "Vivid Theory",
        "Viyella's Tears",
        "WAIT FOR DAWN",
        "Wish Upon a Snow",
        "with U",
        "World Ender",
        "World Fragments III(radio edit)",
        "World Vanquisher",
        "world.execute(me);",
        "Xanatos",
        "Xeraphinite",
        "XTREME",
        "Yosakura Fubuki",
        "Your voice so... feat. Such",
        "αterlβus",
        "γuarδina",
        "µ",
        "ΟΔΥΣΣΕΙΑ",
        "ω4"
    };

    public static String[] chartsBYD = { "Select a chart",

    // A

    "Antithese",
    "Arcana Eden",

    // B

    "Bookmaker (2D Version)",

    // C

    "Cybernecia Catharsis",

    // D

    "Dement ~after legend~",

    // E

    "Einherjar Joker",

    // F

    "Fairytale",
    "FREEF4LL",

    // G

    "GOODTEK (Arcaea Edit)",

    // H

    "Heavensdoor",

    // I

    "Ignotus Afterburn",
    "Infinite Strife,",
    "Infinity Heaven",
    "inkar-usi",

    // K

    "Kanagawa Cyber Culvert",

    // L

    "La'qryma of the Wasteland",
    "lastendconductor",
    "Last | Moment",
    "Last | Eternity",
    "Libertas",
    "Lost Civilization",
    "Lumia",

    // M

    "MERLIN",
    "Moonheart",

    // N

    "next to you",

    // O

    "Oblivia",
    "OMAKENO Stroke",
    "overdead.",

    // P

    "Party Vinyl",
    "Pentiment",
    "PRAGMATISM -RESURRECTION-",
    "Purgatorium",
    "Purple Verse",

    // Q

    "Quon",

    // R

    "Red and Blue and Green",

    // S

    "Shades of Light in a Transcendent Realm",
    "Singularity VVVIP",

    // T

    "Tempestissimo",
    "Teriqma",
    "Testify",

    // V

    "Vexaria",
    "Vicious [ANTi] Heroism",

    // W

    "World Ender",

};

    // contains jacket/cc/combo info
    public static void db(String selected, String difficulty) {
        if (difficulty == "BYD") {
            switch (selected) {
                case "Antithese":

                    display.combo = 968;
                    display.cc = 9.5;
                    break;
                case "Arcana Eden":

                    display.combo = 2134;
                    display.cc = 11.4;
                    break;
                case "Bookmaker (2D Version)":

                    display.combo = 1287;
                    display.cc = 10;
                    break;
                case "Cybernecia Catharsis":

                    display.combo = 991;
                    display.cc = 9.8;
                    break;
                case "Dement ~after legend~":

                    display.combo = 1040;
                    display.cc = 9.9;
                    break;
                case "Einherjar Joker":

                    display.combo = 1857;
                    display.cc = 10.9;
                    break;
                case "Fairytale":

                    display.combo = 932;
                    display.cc = 9.5;
                    break;
                case "FREEF4LL":

                    display.combo = 1336;
                    display.cc = 9.8;
                    break;
                case "GOODTEK (Arcaea Edit)":

                    display.combo = 1103;
                    display.cc = 9.8;
                    break;
                case "Heavensdoor":

                    display.combo = 1534;
                    display.cc = 10.8;
                    break;
                case "Ignotus Afterburn":

                    display.combo = 1077;
                    display.cc = 9.9;
                    break;
                case "IMPACT":

                    display.combo = 1392;
                    display.cc = 10.4;
                    break;
                case "Infinite Strife,":

                    display.combo = 1633;
                    display.cc = 10.9;
                    break;
                case "Infinity Heaven":

                    display.combo = 986;
                    display.cc = 9.6;
                    break;
                case "inkar-usi":

                    display.combo = 857;
                    display.cc = 9.4;
                    break;
                case "Kanagawa Cyber Culvert":

                    display.combo = 1121;
                    display.cc = 9.8;
                    break;
                case "La'qryma of the Wasteland":

                    display.combo = 1161;
                    display.cc = 9.9;
                    break;
                case "lastendconductor":

                    display.combo = 1339;
                    display.cc = 10.1;
                    break;

                case "Last | Moment":
                    display.combo = 888;
                    display.cc = 9.6;
                    break;

                case "Last | Eternity":
                    display.combo =786;
                    display.cc =9.7;
                    break;

                case "Libertas":

                    display.combo = 1048;
                    display.cc = 10.5;
                    break;
                case "Lost Civilization":

                    display.combo = 1061;
                    display.cc = 9.8;
                    break;
                case "Lumia":

                    display.combo = 814;
                    display.cc = 9.5;
                    break;
                case "MERLIN":

                    display.combo = 881;
                    display.cc = 9.4;
                    break;
                case "Moonheart":

                    display.combo = 1139;
                    display.cc = 9.7;
                    break;
                case "next to you":

                    display.combo = 954;
                    display.cc = 9.6;
                    break;
                case "Oblivia":

                    display.combo = 1021;
                    display.cc = 9.7;
                    break;
                case "OMAKENO Stroke":

                    display.combo = 931;
                    display.cc = 10.2;
                    break;
                case "overdead.":

                    display.combo = 1503;
                    display.cc = 10.5;
                    break;
                case "Party Vinyl":

                    display.combo = 946;
                    display.cc = 10.1;
                    break;
                case "Pentiment":

                    display.combo = 1741;
                    display.cc = 11.4;
                    break;
                case "PRAGMATISM -RESURRECTION-":

                    display.combo = 1502;
                    display.cc = 11;
                    break;

                case "Purgatorium":

                    display.combo = 1051;
                    display.cc = 9.6;
                    break;
                case "Purple Verse":

                    display.combo = 1202;
                    display.cc = 10.6;
                    break;
                case "qualia -ideaesthesia-":

                    display.combo = 1288;
                    display.cc = 9.7;
                    break;
                case "Quon":

                    display.combo = 1044;
                    display.cc = 10.2;
                    break;
                case "Red and Blue and Green":

                    display.combo = 1194;
                    display.cc = 10;
                    break;
                case "Shades of Light in a Transcendent Realm":

                    display.combo = 1042;
                    display.cc = 9;
                    break;
                case "Singularity VVVIP":

                    display.combo = 1114;
                    display.cc = 10.4;
                    break;
                case "Tempestissimo":

                    display.combo = 1540;
                    display.cc = 11.5;
                    break;
                case "Teriqma":

                    display.combo = 954;
                    display.cc = 9.7;
                    break;
                case "Testify":

                    display.combo = 2221;
                    display.cc = 12;
                    break;
                case "trappola bewitching":

                    display.combo = 1086;
                    display.cc = 10.5;
                    break;
                case "Vexaria":

                    display.combo = 785;
                    display.cc = 9;
                    break;
                case "Vicious [ANTi] Heroism":

                    display.combo = 1772;
                    display.cc = 11.1;
                    break;
                case "World Ender":

                    display.combo = 1661;
                    display.cc = 11.2;
                    break;

                case null:
                    display.combo = 0;
                    display.cc = 0;
                    break;

                default:
                    display.combo = 0;
                    display.cc = 0;
                    break;
            }
        } else {
            switch (selected) {
                case "[X]":

                    display.combo = 1190;
                    display.cc = 10.4;
                    break;
                case "#1f1e33":

                    display.combo = 1576;
                    display.cc = 10.9;
                    break;
                case "〇、":

                    display.combo = 708;
                    display.cc = 9.5;
                    break;
                case "1F√":

                    display.combo = 758;
                    display.cc = 8.2;
                    break;
                case "7thSense":

                    display.combo = 925;
                    display.cc = 9.9;
                    break;
                case "99 Glooms":

                    display.combo = 1294;
                    display.cc = 10.3;
                    break;
                case "A Wandering Melody of Love":

                    display.combo = 931;
                    display.cc = 9.6;
                    break;
                case "Abstruse Dilemma":

                    display.combo = 1467;
                    display.cc = 11.1;
                    break;
                case "Aegleseeker":

                    display.combo = 1568;
                    display.cc = 11.1;
                    break;
                case "Ai Drew":

                    display.combo = 1066;
                    display.cc = 9.8;
                    break;
                case "AI[UE]OON":

                    display.combo = 989;
                    display.cc = 9.4;
                    break;
                case "Aleph-0":

                    display.combo = 919;
                    display.cc = 10.5;
                    break;
                case "Alexandrite":

                    display.combo = 1040;
                    display.cc = 10;
                    break;
                case "Alice à la mode":

                    display.combo = 872;
                    display.cc = 9.2;
                    break;
                case "Alice's Suitcase":

                    display.combo = 999;
                    display.cc = 9.1;
                    break;
                case "Alone & Lorn":

                    display.combo = 970;
                    display.cc = 9.6;
                    break;
                case "Altair (feat. *spiLa*)":

                    display.combo = 830;
                    display.cc = 8.5;
                    break;
                case "Altale":

                    display.combo = 690;
                    display.cc = 9.7;
                    break;
                case "AlterAle":

                    display.combo = 1277;
                    display.cc = 9.7;
                    break;
                case "AMAZING MIGHTYYYY!!!!":

                    display.combo = 1249;
                    display.cc = 10.7;
                    break;
                case "Amekagura":

                    display.combo = 1076;
                    display.cc = 9.9;
                    break;
                case "amygdata":

                    display.combo = 1199;
                    display.cc = 9.7;
                    break;
                case "Anökumene":

                    display.combo = 851;
                    display.cc = 9.2;
                    break;
                case "Antagonism":

                    display.combo = 1142;
                    display.cc = 9.9;
                    break;
                case "Antithese":

                    display.combo = 877;
                    display.cc = 8.8;
                    break;
                case "April showers":

                    display.combo = 697;
                    display.cc = 8.6;
                    break;
                case "Arcahv":

                    display.combo = 1065;
                    display.cc = 9.9;
                    break;
                case "Arcana Eden":

                    display.combo = 1792;
                    display.cc = 10.5;
                    break;
                case "Arghena":

                    display.combo = 1444;
                    display.cc = 11.3;
                    break;
                case "Ascent":

                    display.combo = 1023;
                    display.cc = 9.8;
                    break;
                case "Astra walkthrough":

                    display.combo = 1191;
                    display.cc = 9.9;
                    break;
                case "Astral tale":

                    display.combo = 884;
                    display.cc = 9.6;
                    break;
                case "AttraqtiA":

                    display.combo = 1433;
                    display.cc = 10.6;
                    break;
                case "Aurgelmir":

                    display.combo = 1100;
                    display.cc = 10.5;
                    break;
                case "Auxesia":

                    display.combo = 1000;
                    display.cc = 9.3;
                    break;
                case "Avant Raze":

                    display.combo = 1125;
                    display.cc = 9.6;
                    break;
                case "Ävril -Flicka i krans-":

                    display.combo = 851;
                    display.cc = 8.3;
                    break;
                case "Awaken In Ruins":

                    display.combo = 754;
                    display.cc = 9.9;
                    break;
                case "Axium Crisis":

                    display.combo = 1094;
                    display.cc = 10.7;
                    break;
                case "B.B.K.K.B.K.K.":

                    display.combo = 976;
                    display.cc = 9.7;
                    break;
                case "Babaroque":

                    display.combo = 808;
                    display.cc = 8.5;
                    break;
                case "BADTEK":

                    display.combo = 916;
                    display.cc = 9.7;
                    break;
                case "Bamboo":

                    display.combo = 1050;
                    display.cc = 10;
                    break;
                case "BATTLE NO.1":

                    display.combo = 1042;
                    display.cc = 9.7;
                    break;
                case "Be There":

                    display.combo = 982;
                    display.cc = 9.4;
                    break;
                case "Beside You":

                    display.combo = 703;
                    display.cc = 8.7;
                    break;
                case "Black Lotus":

                    display.combo = 965;
                    display.cc = 9.7;
                    break;
                case "Black Territory":

                    display.combo = 1195;
                    display.cc = 9.8;
                    break;
                case "Blaster":

                    display.combo = 1002;
                    display.cc = 9.3;
                    break;
                case "Blocked Library":

                    display.combo = 850;
                    display.cc = 9.3;
                    break;
                case "Blossoms":

                    display.combo = 655;
                    display.cc = 7;
                    break;
                case "BLRINK":

                    display.combo = 1015;
                    display.cc = 9.7;
                    break;
                case "blue comet":

                    display.combo = 776;
                    display.cc = 8.2;
                    break;
                case "Blue Rose":

                    display.combo = 955;
                    display.cc = 9.1;
                    break;
                case "Bookmaker (2D Version)":

                    display.combo = 1124;
                    display.cc = 8.3;
                    break;
                case "Brand new world":

                    display.combo = 787;
                    display.cc = 7.8;
                    break;
                case "BUCHiGiRE Berserker":

                    display.combo = 1412;
                    display.cc = 10.9;
                    break;
                case "Bullet Waiting for Me (James Landino remix)":

                    display.combo = 701;
                    display.cc = 8.1;
                    break;
                case "Call My Name feat. Yukacco":

                    display.combo = 921;
                    display.cc = 8.7;
                    break;

                case "Callima Karma":
                    display.combo = 1222;
                    display.cc = 9.8;
                    break;

                case "Can I friend you on Bassbook? lol":
                    display.combo = 861;
                    display.cc = 9.3;
                    break;

                    case "Capella":

                    display.combo = 1159;
                    display.cc = 10.2;
                    break;
                case "carmine:scythe":

                    display.combo = 1164;
                    display.cc = 9.6;
                    break;
                case "CHAOS":

                    display.combo = 1369;
                    display.cc = 10.9;
                    break;
                case "Chelsea":

                    display.combo = 650;
                    display.cc = 8.9;
                    break;
                case "Chromafill":

                    display.combo = 1130;
                    display.cc = 10;
                    break;
                case "Chronicle":

                    display.combo = 1264;
                    display.cc = 10.4;
                    break;
                case "Chronostasis":

                    display.combo = 916;
                    display.cc = 8.9;
                    break;
                case "Climax":

                    display.combo = 1367;
                    display.cc = 10.4;
                    break;
                case "Clotho and the stargazer":

                    display.combo = 1021;
                    display.cc = 7.8;
                    break;
                case "Coastal Highway":

                    display.combo = 732;
                    display.cc = 9;
                    break;
                case "cocoro*cosmetic":

                    display.combo = 1025;
                    display.cc = 9.2;
                    break;
                case "conflict":

                    display.combo = 1056;
                    display.cc = 10.2;
                    break;
                case "corps-sans-organes":

                    display.combo = 1077;
                    display.cc = 10.6;
                    break;
                case "Corruption":

                    display.combo = 1293;
                    display.cc = 9.8;
                    break;
                case "Cosmica":

                    display.combo = 773;
                    display.cc = 8.8;
                    break;
                case "Cosmo Pop Funclub":

                    display.combo = 809;
                    display.cc = 8.8;
                    break;
                case "Crimson Throne":

                    display.combo = 1313;
                    display.cc = 10.4;
                    break;
                case "CROSS†OVER":

                    display.combo = 1094;
                    display.cc = 9.4;
                    break;
                case "CROSS†SOUL":

                    display.combo = 1081;
                    display.cc = 9.4;
                    break;
                case "cry of viyella":

                    display.combo = 791;
                    display.cc = 8.7;
                    break;
                case "Crystal Gravity":

                    display.combo = 872;
                    display.cc = 9.4;
                    break;
                case "Cyaegha":

                    display.combo = 1368;
                    display.cc = 10.7;
                    break;
                case "cyanine":

                    display.combo = 1171;
                    display.cc = 10.6;
                    break;
                case "Cybernecia Catharsis":

                    display.combo = 946;
                    display.cc = 9.5;
                    break;
                case "CYCLES":

                    display.combo = 695;
                    display.cc = 8.8;
                    break;
                case "Dancin' on a Cat's Paw":

                    display.combo = 891;
                    display.cc = 9.2;
                    break;
                case "Dandelion":

                    display.combo = 921;
                    display.cc = 8.5;
                    break;
                case "Dantalion":

                    display.combo = 1476;
                    display.cc = 10.9;
                    break;
                case "DataErr0r":

                    display.combo = 955;
                    display.cc = 9.5;
                    break;
                case "Dazzle hop":

                    display.combo = 1022;
                    display.cc = 9.7;
                    break;
                case "DDD":

                    display.combo = 653;
                    display.cc = 8.5;
                    break;
                case "Defection":

                    display.combo = 1141;
                    display.cc = 9.8;
                    break;
                case "Dement ~after legend~":

                    display.combo = 970;
                    display.cc = 7.8;
                    break;
                case "Désive":

                    display.combo = 1273;
                    display.cc = 9.9;
                    break;
                case "Devillic Sphere":

                    display.combo = 1129;
                    display.cc = 9.9;
                    break;
                case "Dialnote":

                    display.combo = 684;
                    display.cc = 8.8;
                    break;
                case "Diode":

                    display.combo = 709;
                    display.cc = 8.1;
                    break;
                case "Distorted Fate":

                    display.combo = 1172;
                    display.cc = 9.6;
                    break;
                case "Divine Light of Myriad":

                    display.combo = 1021;
                    display.cc = 10.8;
                    break;
                case "Dot to Dot feat. shully":

                    display.combo = 739;
                    display.cc = 8.3;
                    break;
                case "Dreadnought":

                    display.combo = 1099;
                    display.cc = 9.7;
                    break;
                case "Dream goes on":

                    display.combo = 719;
                    display.cc = 7.8;
                    break;
                    case "Dreamin' Attraction!!":

                    display.combo = 1129;
                    display.cc = 9.4;
                    break;
                case "DRG":

                    display.combo = 872;
                    display.cc = 9.5;
                    break;
                case "dropdead":

                    display.combo = 823;
                    display.cc = 9.1;
                    break;
                case "DX Choseinou Full Metal Shojo":

                    display.combo = 808;
                    display.cc = 9.8;
                    break;
                case "Dynitikós":

                    display.combo = 986;
                    display.cc = 9.5;
                    break;
                case "Eccentric Tale":

                    display.combo = 732;
                    display.cc = 8.4;
                    break;
                case "eden":

                    display.combo = 1365;
                    display.cc = 10.5;
                    break;
                case "Ego Eimi":

                    display.combo = 1223;
                    display.cc = 10.5;
                    break;
                case "Einherjar Joker":

                    display.combo = 1159;
                    display.cc = 9.8;
                    break;
                case "Empire of Winter":

                    display.combo = 920;
                    display.cc = 9;
                    break;
                case "enchanted love":

                    display.combo = 759;
                    display.cc = 8.6;
                    break;
                case "ENERGY SYNERGY MATRIX":

                    display.combo = 922;
                    display.cc = 9.6;
                    break;
                case "Equilibrium":

                    display.combo = 951;
                    display.cc = 9.4;
                    break;
                case "Essence of Twilight":

                    display.combo = 1204;
                    display.cc = 9.1;
                    break;
                case "Ether Strike":

                    display.combo = 1170;
                    display.cc = 10.3;
                    break;
                case "Evening in Scarlet":

                    display.combo = 922;
                    display.cc = 9.5;
                    break;
                case "Evoltex (poppi'n mix)":

                    display.combo = 775;
                    display.cc = 8.9;
                    break;
                case "Faint Light (Arcaea Edit)":

                    display.combo = 809;
                    display.cc = 9.1;
                    break;
                case "Fairytale":

                    display.combo = 782;
                    display.cc = 7;
                    break;
                case "Fallensquare":

                    display.combo = 703;
                    display.cc = 9.6;
                    break;
                case "False Embellishment":

                    display.combo = 969;
                    display.cc = 9.3;
                    break;
                case "FANTA5Y":

                    display.combo = 965;
                    display.cc = 9.4;
                    break;
                case "Far Away Light":

                    display.combo = 1322;
                    display.cc = 9.8;
                    break;
                case "Feels So Right feat. Renko":

                    display.combo = 947;
                    display.cc = 9.3;
                    break;
                case "Felis":

                    display.combo = 1153;
                    display.cc = 10.4;
                    break;
                case "felys final remix":

                    display.combo = 1130;
                    display.cc = 9.5;
                    break;
                case "Filament":

                    display.combo = 991;
                    display.cc = 9.7;
                    break;
                case "Final Step!":

                    display.combo = 1056;
                    display.cc = 9.4;
                    break;
                case "First Snow":

                    display.combo = 578;
                    display.cc = 7.8;
                    break;
                case "Flashback":

                    display.combo = 856;
                    display.cc = 8.9;
                    break;
                case "Floating World":

                    display.combo = 1047;
                    display.cc = 9.3;
                    break;
                case "FLUFFY FLASH":

                    display.combo = 1329;
                    display.cc = 9.8;
                    break;
                case "Flyburg and Endroll":

                    display.combo = 930;
                    display.cc = 9;
                    break;
                case "Fracture Ray":

                    display.combo = 1279;
                    display.cc = 11.3;
                    break;
                case "Free Myself":

                    display.combo = 1132;
                    display.cc = 10;
                    break;
                case "FREEF4LL":

                    display.combo = 1023;
                    display.cc = 8.6;
                    break;
                case "G e n g a o z o":

                    display.combo = 1353;
                    display.cc = 10.2;
                    break;
                case "Galactic Love":

                    display.combo = 813;
                    display.cc = 9;
                    break;
                case "Galaxy Friends":

                    display.combo = 1013;
                    display.cc = 9.8;
                    break;
                case "Garakuta Doll Play":

                    display.combo = 1035;
                    display.cc = 10.4;
                    break;
                case "Gekka (Short Version)":

                    display.combo = 817;
                    display.cc = 8.6;
                    break;
                case "Genesis":

                    display.combo = 713;
                    display.cc = 8.2;
                    break;
                case "Genesis (CHUNITHM)":

                    display.combo = 713;
                    display.cc = 8.2;
                    break;
                case "GENOCIDER":

                    display.combo = 1483;
                    display.cc = 10.7;
                    break;
                    case "GIMME DA BLOOD":

                    display.combo = 1093;
                    display.cc = 10.4;
                    break;
                case "GIMMICK":

                    display.combo = 733;
                    display.cc = 9.5;
                    break;
                case "Give Me a Nightmare":

                    display.combo = 948;
                    display.cc = 8.9;
                    break;
                case "GLORY：ROAD":

                    display.combo = 1479;
                    display.cc = 10.6;
                    break;
                case "Glow":

                    display.combo = 916;
                    display.cc = 9.3;
                    break;
                case "goldenslaughterer":

                    display.combo = 1326;
                    display.cc = 9.7;
                    break;
                case "Good bye, Merry-Go-Round.":

                    display.combo = 1084;
                    display.cc = 10.5;
                    break;
                case "GOODTEK (Arcaea Edit)":

                    display.combo = 968;
                    display.cc = 9.3;
                    break;
                case "Got hive of Ra":

                    display.combo = 794;
                    display.cc = 9.8;
                    break;
                case "Grievous Lady":

                    display.combo = 1450;
                    display.cc = 11.3;
                    break;
                case "Grimheart":

                    display.combo = 959;
                    display.cc = 8.7;
                    break;
                case "Halcyon":

                    display.combo = 1227;
                    display.cc = 10.7;
                    break;
                case "Hall of Mirrors":

                    display.combo = 898;
                    display.cc = 8.2;
                    break;
                case "Harutopia ~Utopia of Spring~":

                    display.combo = 1061;
                    display.cc = 8.5;
                    break;
                case "Haze of Autumn":

                    display.combo = 1077;
                    display.cc = 9.8;
                    break;
                case "Head BONK ache":

                    display.combo = 1061;
                    display.cc = 9.4;
                    break;
                case "Heart":

                    display.combo = 872;
                    display.cc = 9.3;
                    break;
                case "Heart Jackin'":

                    display.combo = 1112;
                    display.cc = 9.7;
                    break;
                case "Heavenly caress":

                    display.combo = 1560;
                    display.cc = 9.8;
                    break;
                case "Heavensdoor":
                    display.combo = 1101;
                    display.cc = 9.9;
                    break;
                case "HELLOHELL":
                    display.combo = 673;
                    display.cc = 7.5;
                    break;
                case "Hiiro Gekka, Kyoushou no Zetsu (nayuta 2017 ver.)":
                    display.combo = 1126;
                    display.cc = 10.3;
                    break;
                case "Hikari":
                    display.combo = 684;
                    display.cc = 8.1;
                    break;
                case "HIVEMIND":
                    display.combo = 1252;
                    display.cc = 10;
                    break;
                case "Hotarubi no Yuki":
                    display.combo = 991;
                    display.cc = 9.7;
                    break;
                case "Hybris (The one who shattered)":
                    display.combo = 1196;
                    display.cc = 9.8;
                    break;
                case "I've heard it said":
                    display.combo = 864;
                    display.cc = 8.1;
                    break;
                case "Iconoclast":
                    display.combo = 795;
                    display.cc = 9.1;
                    break;
                case "Ignotus":
                    display.combo = 1225;
                    display.cc = 9.3;
                    break;
                case "	͟͝͞Ⅱ́̕":
                    display.combo = 1051;
                    display.cc = 10.8;
                    break;
                case "Ikazuchi":
                    display.combo = 1347;
                    display.cc = 10.4;
                    break;
                case "Illegal Paradise":
                    display.combo = 1061;
                    display.cc = 9.5;
                    break;
                case "IMPACT":
                    display.combo = 1231;
                    display.cc = 9.6;
                    break;
                case "Impure Bird":
                    display.combo = 805;
                    display.cc = 9.4;
                    break;
                case "Infinite Strife,":
                    display.combo = 1511;
                    display.cc = 9.9;
                    break;
                case "Infinity Heaven":
                    display.combo = 853;
                    display.cc = 7.8;
                    break;
                case "init()":
                    display.combo = 1204;
                    display.cc = 9.8;
                    break;
                case "inkar-usi":
                    display.combo = 463;
                    display.cc = 7.8;
                    break;
                case "Innocence":
                    display.combo = 1023;
                    display.cc = 8.5;
                    break;
                case "INTERNET OVERDOSE":
                    display.combo = 657;
                    display.cc = 8.4;
                    break;
                case "INTERNET YAMERO":
                    display.combo = 1222;
                    display.cc = 9.9;
                    break;
                    case "IONOSTREAM":
                    display.combo = 818;
                    display.cc = 8.7;
                    break;
                case "IZANA":
                    display.combo = 976;
                    display.cc = 10.3;
                    break;
                case "Jingle":
                    display.combo = 848;
                    display.cc = 7.8;
                    break;
                case "Journey":
                    display.combo = 997;
                    display.cc = 9.1;
                    break;
                case "Jump":
                    display.combo = 841;
                    display.cc = 9;
                    break;
                case "Kanagawa Cyber Culvert":
                    display.combo = 1111;
                    display.cc = 9;
                    break;
                case "Kanbu de Tomatte Sugu Tokeru":
                    display.combo = 1108;
                    display.cc = 10;
                    break;
                case "Kanjou no Matenrou ～Arr.Demetori":
                    display.combo = 1294;
                    display.cc = 9.8;
                    break;
                case "Kissing Lucifer":
                    display.combo = 1183;
                    display.cc = 10.4;
                    break;
                case "KYOREN ROMANCE":
                    display.combo = 1519;
                    display.cc = 10.7;
                    break;
                case "La'qryma of the Wasteland":
                    display.combo = 956;
                    display.cc = 9.1;
                    break;
                case "LAMIA":
                    display.combo = 1385;
                    display.cc = 10.9;
                    break;
                case "Lapis":
                    display.combo = 920;
                    display.cc = 9.4;
                    break;
                case "Last":
                    display.combo = 831;
                    display.cc = 9;
                    break;

                case "Last Celebration":
                    display.combo = 1475;
                    display.cc = 10.5;
                    break;
                case "lastendconductor":
                    display.combo = 1209;
                    display.cc = 9.4;
                    break;
                case "Lawless Point":
                    display.combo = 838;
                    display.cc = 9;
                    break;
                case "Lazy Addiction":
                    display.combo = 1031;
                    display.cc = 9.6;
                    break;
                case "Leave All Behind":
                    display.combo = 828;
                    display.cc = 9.2;
                    break;
                case "Let you DIVE! (nitro rmx)":
                    display.combo = 1049;
                    display.cc = 9.4;
                    break;
                case "Let's Rock (Arcaea mix)":
                    display.combo = 1177;
                    display.cc = 9.7;
                    break;
                case "Lethaeus":
                    display.combo = 900;
                    display.cc = 9.7;
                    break;
                case "Lethal Voltage":
                    display.combo = 1497;
                    display.cc = 10.4;
                    break;
                case "Libertas":
                    display.combo = 947;
                    display.cc = 9.2;
                    break;
                case "Life is PIANO":
                    display.combo = 674;
                    display.cc = 9.1;
                    break;
                case "Lightning Screw":
                    display.combo = 1192;
                    display.cc = 10.5;
                    break;
                case "Lights of Muse":
                    display.combo = 580;
                    display.cc = 8.9;
                    break;
                case "Linear Accelerator":
                    display.combo = 905;
                    display.cc = 9.8;
                    break;
                case "Live Fast Die Young":
                    display.combo = 1292;
                    display.cc = 10.6;
                    break;
                case "LIVHT MY WΔY":
                    display.combo = 954;
                    display.cc = 9.8;
                    break;
                case "Logos":
                    display.combo = 1040;
                    display.cc = 10.1;
                    break;
                case "Löschen":
                    display.combo = 1235;
                    display.cc = 10.2;
                    break;
                case "Lost Civilization":
                    display.combo = 986;
                    display.cc = 9.2;
                    break;
                case "Lost Desire":
                    display.combo = 1154;
                    display.cc = 9.8;
                    break;
                case "Lost Emotion feat. nomico":
                    display.combo = 1123;
                    display.cc = 9.3;
                    break;
                case "Lost in the Abyss":
                    display.combo = 1179;
                    display.cc = 9.7;
                    break;
                case "Loveless Dress":
                    display.combo = 850;
                    display.cc = 9.6;
                    break;
                case "Lucid Traveler":
                    display.combo = 1341;
                    display.cc = 10.4;
                    break;
                case "Lucifer":
                    display.combo = 861;
                    display.cc = 8.2;
                    break;
                case "Lumia":
                    display.combo = 961;
                    display.cc = 8.4;
                    break;
                case "Luna Rossa":
                    display.combo = 920;
                    display.cc = 9.7;
                    break;
                case "LunarOrbit -believe in the Espebranch road-":
                    display.combo = 1058;
                    display.cc = 9.6;
                    break;
                    case "Macrocosmic Modulation":
                    display.combo = 1117;
                    display.cc = 9.8;
                    break;
                case "Magnolia":
                    display.combo = 895;
                    display.cc = 10.2;
                    break;
                case "MAHOROBA":
                    display.combo = 828;
                    display.cc = 9.5;
                    break;
                case "Malicious Mischance":
                    display.combo = 1126;
                    display.cc = 10.2;
                    break;
                case "Manic Jeer":
                    display.combo = 1286;
                    display.cc = 10.6;
                    break;
                case "MANTIS (Arcaea Ultra-Bloodrush VIP)":
                    display.combo = 1014;
                    display.cc = 9.3;
                    break;
                case "Masquerade Legion":
                    display.combo = 1064;
                    display.cc = 10;
                    break;
                case "MAXRAGE":
                    display.combo = 1184;
                    display.cc = 9.9;
                    break;
                case "Maze No.9":
                    display.combo = 775;
                    display.cc = 8.9;
                    break;
                case "Mazy Metroplex":
                    display.combo = 952;
                    display.cc = 9.7;
                    break;
                case "Medusa":
                    display.combo = 931;
                    display.cc = 10.2;
                    break;
                case "Memory Forest":
                    display.combo = 978;
                    display.cc = 9.8;
                    break;
                case "memoryfactory.lzh":
                    display.combo = 672;
                    display.cc = 8.9;
                    break;
                case "MERLIN":
                    display.combo = 712;
                    display.cc = 8.9;
                    break;
                case "Meta-Mysteria":
                    display.combo = 1309;
                    display.cc = 10.8;
                    break;
                case "Metallic Punisher":
                    display.combo = 1238;
                    display.cc = 10.3;
                    break;
                case "MIRINAE":
                    display.combo = 1277;
                    display.cc = 10.5;
                    break;
                case "Mirzam":
                    display.combo = 1303;
                    display.cc = 10;
                    break;
                case "Misdeed -la bonté de Dieu et l'origine du mal-":
                    display.combo = 1522;
                    display.cc = 10.9;
                    break;
                case "Modelista":
                    display.combo = 1010;
                    display.cc = 10;
                    break;
                case "Monochrome Princess":
                    display.combo = 974;
                    display.cc = 9.7;
                    break;
                case "Moonheart":
                    display.combo = 947;
                    display.cc = 8.4;
                    break;
                case "Moonlight of Sand Castle":
                    display.combo = 645;
                    display.cc = 7.8;
                    break;
                case "MORNINGLOOM":
                    display.combo = 940;
                    display.cc = 8.8;
                    break;
                case "Nameless Passion":
                    display.combo = 1223;
                    display.cc = 9.9;
                    break;
                case "NEO WINGS":
                    display.combo = 1328;
                    display.cc = 10.2;
                    break;
                case "New York Back Raise":
                    display.combo = 1091;
                    display.cc = 9.9;
                    break;
                case "next to you":
                    display.combo = 824;
                    display.cc = 8.8;
                    break;
                case "Nhelv":
                    display.combo = 1108;
                    display.cc = 9.9;
                    break;
                case "Nirv lucE":

                    display.combo = 980;
                    display.cc = 10.3;
                    break;
                case "NULCTRL":

                    display.combo = 715;
                    display.cc = 9.5;
                    break;
                case "NULL APOPHENIA":

                    display.combo = 1299;
                    display.cc = 10.6;
                    break;
                case "nέo κósmo":

                    display.combo = 979;
                    display.cc = 9.7;
                    break;
                case "Oblivia":

                    display.combo = 956;
                    display.cc = 8.3;
                    break;
                case "OMAKENO Stroke":

                    display.combo = 869;
                    display.cc = 9.5;
                    break;
                case "On And On!! feat. Jenga":

                    display.combo = 836;
                    display.cc = 9.5;
                    break;
                case "One Last Drive":

                    display.combo = 885;
                    display.cc = 8.2;
                    break;
                case "Oracle":

                    display.combo = 963;
                    display.cc = 9.3;
                    break;
                case "Oshama Scramble!":

                    display.combo = 1073;
                    display.cc = 10;
                    break;
                case "ouroboros -twin stroke of the end-":

                    display.combo = 1369;
                    display.cc = 10.7;
                    break;
                case "Ouvertüre":

                    display.combo = 913;
                    display.cc = 9.8;
                    break;
                case "Overwhelm":

                    display.combo = 1251;
                    display.cc = 10.6;
                    break;
                    case "Paper Witch":

                    display.combo = 793;
                    display.cc = 8.7;
                    break;
                case "Paradise":

                    display.combo = 729;
                    display.cc = 7.8;
                    break;
                case "Particle Arts":

                    display.combo = 925;
                    display.cc = 8.8;
                    break;
                case "Party Vinyl":

                    display.combo = 800;
                    display.cc = 9.4;
                    break;
                case "Pentiment":

                    display.combo = 1345;
                    display.cc = 10.3;
                    break;
                case "Phantasia":

                    display.combo = 952;
                    display.cc = 9.2;
                    break;
                case "PICO-Pico-Translation!":

                    display.combo = 1049;
                    display.cc = 9.3;
                    break;
                case "PRAGMATISM":

                    display.combo = 942;
                    display.cc = 10.1;
                    break;
                case "Primeval Texture":

                    display.combo = 810;
                    display.cc = 9;
                    break;
                case "PRIMITIVE LIGHTS":

                    display.combo = 1524;
                    display.cc = 10.7;
                    break;
                case "Prism":

                    display.combo = 785;
                    display.cc = 8;
                    break;
                case "Protoflicker":

                    display.combo = 1042;
                    display.cc = 9.8;
                    break;
                case "PUPA":

                    display.combo = 1099;
                    display.cc = 10.4;
                    break;
                case "Purgatorium":

                    display.combo = 983;
                    display.cc = 8.4;
                    break;
                case "Purple Verse":

                    display.combo = 1023;
                    display.cc = 9.6;
                    break;
                case "Qovat":

                    display.combo = 1299;
                    display.cc = 10.6;
                    break;
                case "qualia -ideaesthesia-":

                    display.combo = 1022;
                    display.cc = 9.1;
                    break;
                case "Quon":

                    display.combo = 749;
                    display.cc = 8.7;
                    break;
                case "Quon (Feryquitous)":

                    display.combo = 991;
                    display.cc = 9.6;
                    break;
                case "Rabbit In The Black Room":

                    display.combo = 772;
                    display.cc = 8.4;
                    break;
                case "Raven's Pride":

                    display.combo = 1030;
                    display.cc = 9.4;
                    break;
                case "REconstruction":

                    display.combo = 825;
                    display.cc = 8.4;
                    break;
                case "Red and Blue":

                    display.combo = 845;
                    display.cc = 9.4;
                    break;
                case "Redolent Shape":

                    display.combo = 1088;
                    display.cc = 10.2;
                    break;
                case "Redraw the Colorless World":

                    display.combo = 886;
                    display.cc = 9.2;
                    break;
                case "Reinvent":

                    display.combo = 852;
                    display.cc = 8.5;
                    break;
                case "REKKA RESONANCE":

                    display.combo = 1212;
                    display.cc = 10.7;
                    break;
                case "Relentless":

                    display.combo = 1015;
                    display.cc = 8;
                    break;
                case "Remind the Souls (Short Version)":

                    display.combo = 945;
                    display.cc = 9.5;
                    break;
                case "ReviXy":

                    display.combo = 1047;
                    display.cc = 9;
                    break;
                case "RGB":

                    display.combo = 1131;
                    display.cc = 9.7;
                    break;
                case "Ringed Genesis":

                    display.combo = 1146;
                    display.cc = 10.8;
                    break;
                case "Rise":

                    display.combo = 788;
                    display.cc = 7.8;
                    break;
                case "Rise of the World":

                    display.combo = 1176;
                    display.cc = 10.4;
                    break;
                case "Romance Wars":

                    display.combo = 641;
                    display.cc = 7.8;
                    break;
                case "Rugie":

                    display.combo = 975;
                    display.cc = 9.2;
                    break;
                case "SACRIFICE feat. ayame":

                    display.combo = 958;
                    display.cc = 9.7;
                    break;
                case "SAIKYO STRONGER":

                    display.combo = 1384;
                    display.cc = 11;
                    break;
                case "Sakura Fubuki":

                    display.combo = 837;
                    display.cc = 9.3;
                    break;
                case "san skia":

                    display.combo = 1046;
                    display.cc = 8.3;
                    break;
                case "Sayonara Hatsukoi":

                    display.combo = 666;
                    display.cc = 7;
                    break;
                case "Scarlet Cage":

                    display.combo = 1195;
                    display.cc = 9.8;
                    break;
                case "Scarlet Lance":

                    display.combo = 1130;
                    display.cc = 10.1;
                    break;
                case "Seclusion":

                    display.combo = 1132;
                    display.cc = 10.6;
                    break;
                    case "Senkyou":

                    display.combo = 964;
                    display.cc = 8.7;
                    break;
                case "Shades of Light in a Transcendent Realm":

                    display.combo = 1067;
                    display.cc = 8.3;
                    break;
                case "Sheriruth":

                    display.combo = 1151;
                    display.cc = 10.1;
                    break;
                case "Sheriruth (Laur Remix)":

                    display.combo = 1134;
                    display.cc = 10.6;
                    break;
                case "Silent Rush":

                    display.combo = 941;
                    display.cc = 8.6;
                    break;
                case "Singularity":

                    display.combo = 1105;
                    display.cc = 10.7;
                    break;
                case "Small Cloud Sugar Candy":

                    display.combo = 919;
                    display.cc = 9.1;
                    break;
                case "Snow White":

                    display.combo = 978;
                    display.cc = 8.4;
                    break;
                case "Solitary Dream":

                    display.combo = 972;
                    display.cc = 8.8;
                    break;
                case "SOUNDWiTCH":

                    display.combo = 785;
                    display.cc = 9.9;
                    break;
                case "Specta":

                    display.combo = 1096;
                    display.cc = 9.5;
                    break;
                case "Spider's Thread":

                    display.combo = 1203;
                    display.cc = 10.8;
                    break;
                case "STAGER (ALL STAGE CLEAR)":

                    display.combo = 1004;
                    display.cc = 9.5;
                    break;
                case "Stasis":

                    display.combo = 1521;
                    display.cc = 10.7;
                    break;
                case "Stratoliner":

                    display.combo = 877;
                    display.cc = 9.6;
                    break;
                case "Strongholds":

                    display.combo = 922;
                    display.cc = 9.2;
                    break;
                case "Sulfur":

                    display.combo = 1045;
                    display.cc = 9.7;
                    break;
                case "Summer Fireworks of Love":

                    display.combo = 1088;
                    display.cc = 9.9;
                    break;
                case "Suomi":

                    display.combo = 818;
                    display.cc = 7.8;
                    break;
                case "SUPERNOVA":

                    display.combo = 1123;
                    display.cc = 9.7;
                    break;
                case "Surrender":

                    display.combo = 925;
                    display.cc = 8.8;
                    break;
                case "Syro":

                    display.combo = 1150;
                    display.cc = 9.3;
                    break;
                case "syūten":

                    display.combo = 592;
                    display.cc = 8.5;
                    break;
                case "Technicolour":

                    display.combo = 1140;
                    display.cc = 9.8;
                    break;
                case "Tempestissimo":

                    display.combo = 1254;
                    display.cc = 10.7;
                    break;
                case "TEmPTaTiON":

                    display.combo = 1099;
                    display.cc = 10.9;
                    break;
                case "TeraVolt":

                    display.combo = 1008;
                    display.cc = 10.9;
                    break;
                case "Teriqma":

                    display.combo = 873;
                    display.cc = 9.4;
                    break;
                case "Testify":

                    display.combo = 1766;
                    display.cc = 10.8;
                    break;
                case "The Formula":

                    display.combo = 957;
                    display.cc = 9.3;
                    break;
                case "The Message":

                    display.combo = 992;
                    display.cc = 9.7;
                    break;
                case "The Survivor (Game Edit)":

                    display.combo = 1100;
                    display.cc = 9.9;
                    break;
                case "THE ULTIMACY":

                    display.combo = 1304;
                    display.cc = 9.8;
                    break;
                case "Tie me down gently":

                    display.combo = 724;
                    display.cc = 8.3;
                    break;
                case "Tiferet":

                    display.combo = 1086;
                    display.cc = 10.4;
                    break;
                case "To the Furthest Dream":

                    display.combo = 1102;
                    display.cc = 9.8;
                    break;
                case "To the Milky Way":

                    display.combo = 1392;
                    display.cc = 10.5;
                    break;
                case "To: Alice Liddell":

                    display.combo = 998;
                    display.cc = 10.3;
                    break;
                case "Transient Space":

                    display.combo = 805;
                    display.cc = 9.5;
                    break;
                case "Trap Crow":

                    display.combo = 1074;
                    display.cc = 9.9;
                    break;
                case "trappola bewitching":

                    display.combo = 1044;
                    display.cc = 10;
                    break;
                case "Trrricksters!!":

                    display.combo = 1183;
                    display.cc = 10.1;
                    break;
                    case "Tsuki ni Murakumo, Hana ni Kaze":

                    display.combo = 740;
                    display.cc = 8.7;
                    break;
                case "Turbocharger":

                    display.combo = 979;
                    display.cc = 9;
                    break;
                case "Ultimate taste":

                    display.combo = 1405;
                    display.cc = 9.7;
                    break;
                case "ultradiaxon-N3":

                    display.combo = 1228;
                    display.cc = 10.5;
                    break;
                case "UNKNOWN LEVELS":

                    display.combo = 1149;
                    display.cc = 10.6;
                    break;
                case "Used to be":

                    display.combo = 799;
                    display.cc = 9.2;
                    break;
                case "Valhalla:0":

                    display.combo = 1173;
                    display.cc = 10.4;
                    break;
                case "Vandalism":

                    display.combo = 1087;
                    display.cc = 9.7;
                    break;
                case "VECTOЯ":

                    display.combo = 1299;
                    display.cc = 9.4;
                    break;
                case "Vexaria":

                    display.combo = 734;
                    display.cc = 7;
                    break;
                case "Vicious Heroism":

                    display.combo = 1150;
                    display.cc = 10;
                    break;
                case "Vindication":

                    display.combo = 1075;
                    display.cc = 9.6;
                    break;
                case "Vivid Theory":

                    display.combo = 885;
                    display.cc = 8.8;
                    break;
                case "Viyella's Tears":

                    display.combo = 1403;
                    display.cc = 10.3;
                    break;
                case "WAIT FOR DAWN":

                    display.combo = 861;
                    display.cc = 8.7;
                    break;
                case "Wish Upon a Snow":

                    display.combo = 1309;
                    display.cc = 10.5;
                    break;
                case "with U":

                    display.combo = 932;
                    display.cc = 9.4;
                    break;
                case "World Ender":

                    display.combo = 1225;
                    display.cc = 9.9;
                    break;
                case "World Fragments III(radio edit)":

                    display.combo = 1387;
                    display.cc = 9.8;
                    break;
                case "World Vanquisher":

                    display.combo = 1452;
                    display.cc = 10.8;
                    break;
                case "world.execute(me);":

                    display.combo = 851;
                    display.cc = 8;
                    break;
                case "Xanatos":

                    display.combo = 1232;
                    display.cc = 10;
                    break;
                case "Xeraphinite":

                    display.combo = 1048;
                    display.cc = 9.8;
                    break;
                case "XTREME":

                    display.combo = 1258;
                    display.cc = 10.5;
                    break;
                case "Yosakura Fubuki":

                    display.combo = 931;
                    display.cc = 9.4;
                    break;
                case "Your voice so... feat. Such":

                    display.combo = 1013;
                    display.cc = 9.4;
                    break;
                case "αterlβus":

                    display.combo = 1030;
                    display.cc = 10.2;
                    break;
                case "γuarδina":

                    display.combo = 1120;
                    display.cc = 10.4;
                    break;
                case "µ":

                    display.combo = 1256;
                    display.cc = 9.7;
                    break;
                case "ΟΔΥΣΣΕΙΑ":

                    display.combo = 1092;
                    display.cc = 9.5;
                    break;
                case "ω4":

                    display.combo = 1393;
                    display.cc = 10.8;
                    break;


                    //ETR CHARTS



                case "Sayonara Hatsukoi (Eternal)":

                    display.combo = 728;
                    display.cc = 8.5;
                    break;
                case "Clotho and the stargazer (Eternal)":

                    display.combo = 1031;
                    display.cc = 8.8;
                    break;
                case "Suomi (Eternal)":

                    display.combo = 732;
                    display.cc = 8.9;
                    break;
                case "Jingle (Eternal)":

                    display.combo = 1047;
                    display.cc = 9.5;
                    break;
                case "Innocence (Eternal)":

                    display.combo = 1157;
                    display.cc = 9.7;
                    break;
                case "IONOSTREAM (Eternal)":

                    display.combo = 871;
                    display.cc = 9.7;
                    break;
                case "HELLOHELL (Eternal)":

                    display.combo = 770;
                    display.cc = 9.4;
                    break;
                case "MORNINGLOOM (Eternal)":

                    display.combo = 1035;
                    display.cc = 9.8;
                    break;
                case "Distorted Fate (Eternal)":

                    display.combo = 1402;
                    display.cc = 10.9;
                    break;
                case "Désive (Eternal)":

                    display.combo = 1340;
                    display.cc = 10.8;
                    break;

                case null:
                    display.combo = 0;
                    display.cc = 0;
                    break;

                default:
                    display.combo = 0;
                    display.cc = 0;
                    break;
            }
        }
    }
}