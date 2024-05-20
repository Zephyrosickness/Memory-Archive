public class score extends display{
    public static void calcScore(String minScoreString, int far, int miss, String farOp, String missOp){

        //init var

        int missFinal;
        int farFinal;
        double pureRaw = 10000000.0 / combo;
        double farRaw = pureRaw / 2.0;
        int pureFinal;
        int minScore = Integer.parseInt(minScoreString);
        double finalscore;
        boolean toa = display.toa.isSelected();
        //these threshold variables exist because i mean i dont think anyone is gonna care about your score if you get like 500 fars or whatever
        //it just eliminates unecessary scores and speeds up the process (i think)
        int farThreshold = Math.round(combo/8);
        int missThreshold = Math.round(combo/8);

        //gets length of minscore. then adds 0's until it hits 7 digits
        int length = minScoreString.length();
        for(; length<7; length++){
            minScoreString = minScoreString+"0";
            minScore = Integer.parseInt(minScoreString);
        }
        /*this code is big and scary looking but it's actually not that bad. it basically just runs through every possible combination of far/lost notes,
        calculates the score, (very easy since arcaea's score calc is just dividing the combo count by 10 mil, and then dividing it in half for a far note) and
        only prints out the ones that fufill the requirements. it's about 3x as long as it should be since it has code for every possible operator but ITS NOT
        THAT BAD!!!! I SWEAR!!!!!*/

        if(farOp=="<"){    //if far is les than inserted
            for (farFinal = 0; farFinal <= far&&farFinal<=farThreshold; farFinal++) {
                if(missOp=="<"){    //if far is less than inserted and miss is less than inserted
                    for (missFinal = 0; missFinal <= miss&&missFinal<missThreshold; missFinal++) {

                        //vars
                        pureFinal = combo - (farFinal + missFinal);
                        finalscore = pureRaw * pureFinal + farRaw * farFinal;
                        System.out.println(minScoreString);
                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                                }
                            }else{
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }
                    }
                }else if(missOp=="Any"){  //if far is  less than inserted and miss is greater than inserted
                    for (missFinal = 0; missFinal <= combo&&missFinal<missThreshold; missFinal++){

                        //vars
                        pureFinal = combo - (farFinal + missFinal);
                        finalscore = pureRaw * pureFinal + farRaw * farFinal;

                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                                }
                            }else{
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }
                    }
                }else if(missOp=="="){  //if far is less than inserted and miss is equal to inserted

                    //vars
                    missFinal = miss;
                    pureFinal = combo - (farFinal + missFinal);
                    finalscore = pureRaw * pureFinal + farRaw * farFinal;

                    //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                    if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                        //only useful if toa is the partner (that bitch from spiders)
                        if (toa==true){
                            int impureTotal = farFinal+missFinal;
                            if(impureTotal<60){
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }else{
                            importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                        }
                    }
                }
            }
        }else if(farOp=="Any"){   //if far is greater than inserted
            for (farFinal = 0; farFinal <= combo&&farFinal<=farThreshold; farFinal++) {
                //if far is greater than inserted and miss is less than inserted
                if(missOp=="<"){
                    for (missFinal = 0; missFinal <= miss&&missFinal<missThreshold; missFinal++) {

                        //vars
                        pureFinal = combo - (farFinal + missFinal);
                        finalscore = pureRaw * pureFinal + farRaw * farFinal;

                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                                }
                            }else{
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }
                    }
                }else if(missOp=="Any"){  //if far is greater than inserted and miss is greater than inserted
                    for (missFinal = 0; missFinal <= combo&&missFinal<=missThreshold; missFinal++) {

                        //vars
                        pureFinal = combo - (farFinal + missFinal);
                        finalscore = pureRaw * pureFinal + farRaw * farFinal;

                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                                }
                            }else{
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }
                    }
                }else if(missOp=="="){    //if far is greater than inserted and miss is equal to inserted

                    //vars
                    missFinal = miss;
                    pureFinal = combo - (farFinal + missFinal);
                    finalscore = pureRaw * pureFinal + farRaw * farFinal;

                    //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                    if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                        //only useful if toa is the partner (that bitch from spiders)
                        if (toa==true){
                            int impureTotal = farFinal+missFinal;
                            if(impureTotal<60){
                                importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                    }else{
                        importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));}
                    }
                }
            }
        }else if(farOp=="="){ //if far is equal to inserted
            farFinal = far;
            //if far is equal to inserted and miss is less than inserted
            if(missOp=="<"){
                for (missFinal = 0; missFinal <= miss&&missFinal<missThreshold; missFinal++) {

                    //vars
                    pureFinal = combo - (farFinal + missFinal);
                    finalscore = pureRaw * pureFinal + farRaw * farFinal;

                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }else{
                            importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                        }
                    }
                }
            }else if(missOp=="Any"){   //if far is equal to inserted and miss is greater than inserted
                for (missFinal = 0; missFinal <= combo; missFinal++) {

                    //vars
                    pureFinal = combo - (farFinal + missFinal);
                    finalscore = pureRaw * pureFinal + farRaw * farFinal;

                        //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                        if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                            //only useful if toa is the partner (that bitch from spiders)
                            if (toa==true){
                                int impureTotal = farFinal+missFinal;
                                if(impureTotal<60){
                                    importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                            }
                        }else{
                            importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                        }
                    }
                }
            }else if(missOp=="="){    //if far is equal to inserted and miss is equal to inserted

                //vars
                missFinal = miss;
                pureFinal = combo - (farFinal + missFinal);
                finalscore = pureRaw * pureFinal + farRaw * farFinal;

                //only prints if score meets reqs & doesnt have any odd shit like negative far counts (idk how it happens but it does)
                if (finalscore >= minScore && legitimacyCheck(pureFinal, farFinal, missFinal, combo, finalscore) == true) {
                    //only useful if toa is the partner (that bitch from spiders)
                    if (toa==true){
                        int impureTotal = farFinal+missFinal;
                        if(impureTotal<60){
                            importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                        }
                    }else{
                        importComponent(finalscore,pureFinal,farFinal,missFinal, pttCalc(finalscore));
                    }
                }
            }
        }
    }

    //calculates play rating and returns as double. not much to say besides if u need more info u can find it here https://arcaea.fandom.com/wiki/Potential
    public static double pttCalc(double score){
        double modifier;
        if(score==10000000){
            modifier = 2;
        }else if(score>=9800000&&score<=9999999&&score!=10000000){
            modifier = 1+((score-9800000)/200000);
        }else{
            modifier = (score-9500000)/300000;
        }

        //error check to make sure its not a negative value and rounds if its positive.
        //raw is the unrounded, raw play rating. the code rounds it to the 2nd decimal place because if i didnt do this then it would be like 500 lines long
        double raw = cc + modifier;
        if(raw<=0){
            return 0;
        }else{
            double scale = Math.pow(10, 2);
            double rating = Math.round(raw * scale) / scale;
            return rating;
        }
    }
    public static boolean legitimacyCheck(int pure, int far, int miss, int combo, double score){
        //init var
        int total = pure+far+miss;

        //checks if all the values are positive integers and that it all adds up to the total combo. both of these need to be true or the score doesnt display
        if(pure >= 0&&far >=0 &&miss>=0&&total==combo&&score<=10000000){
            boolean result = true;
            return result;
        }else{
            boolean result = false;
            return result;
        }
    }
}